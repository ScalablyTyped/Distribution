package typings.ethereumjsDashCommon.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hardfork extends js.Object {
  var block: Double | Null
  var consensus: String
  var finality: js.Any
  var name: String
}

object Hardfork {
  @scala.inline
  def apply(consensus: String, finality: js.Any, name: String, block: Int | Double = null): Hardfork = {
    val __obj = js.Dynamic.literal(consensus = consensus.asInstanceOf[js.Any], finality = finality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hardfork]
  }
}

