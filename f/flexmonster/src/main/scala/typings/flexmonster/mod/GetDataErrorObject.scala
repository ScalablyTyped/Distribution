package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataErrorObject extends js.Object {
  var dataHeight: Double
  var dataWidth: Double
  var errorMessage: String
}

object GetDataErrorObject {
  @scala.inline
  def apply(dataHeight: Double, dataWidth: Double, errorMessage: String): GetDataErrorObject = {
    val __obj = js.Dynamic.literal(dataHeight = dataHeight.asInstanceOf[js.Any], dataWidth = dataWidth.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataErrorObject]
  }
}

