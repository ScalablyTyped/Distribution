package typings.emberData.mod.DS

import typings.emberData.emberDataBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sync extends js.Object {
  var async: `false`
}

object Sync {
  @scala.inline
  def apply(async: `false`): Sync = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sync]
  }
}

