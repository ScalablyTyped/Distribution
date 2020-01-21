package typings.divaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectData extends js.Object {
  var objectData: String | js.Object
}

object AnonObjectData {
  @scala.inline
  def apply(objectData: String | js.Object): AnonObjectData = {
    val __obj = js.Dynamic.literal(objectData = objectData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObjectData]
  }
}

