package typings.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  @JSName("$ref")
  var $ref: String
}

object AnonRef {
  @scala.inline
  def apply($ref: String): AnonRef = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}

