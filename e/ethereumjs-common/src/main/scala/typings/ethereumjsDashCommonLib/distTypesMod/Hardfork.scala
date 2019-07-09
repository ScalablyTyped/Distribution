package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hardfork extends js.Object {
  var block: scala.Double | scala.Null
  var consensus: java.lang.String
  var finality: js.Any
  var name: java.lang.String
}

object Hardfork {
  @scala.inline
  def apply(
    consensus: java.lang.String,
    finality: js.Any,
    name: java.lang.String,
    block: scala.Int | scala.Double = null
  ): Hardfork = {
    val __obj = js.Dynamic.literal(consensus = consensus, finality = finality, name = name)
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hardfork]
  }
}

