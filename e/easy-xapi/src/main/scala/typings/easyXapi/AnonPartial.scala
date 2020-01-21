package typings.easyXapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartial extends js.Object {
  var partial: Boolean
}

object AnonPartial {
  @scala.inline
  def apply(partial: Boolean): AnonPartial = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPartial]
  }
}

