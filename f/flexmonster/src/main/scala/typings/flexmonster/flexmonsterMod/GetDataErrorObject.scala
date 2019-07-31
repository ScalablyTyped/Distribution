package typings.flexmonster.flexmonsterMod

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
    val __obj = js.Dynamic.literal(dataHeight = dataHeight, dataWidth = dataWidth, errorMessage = errorMessage)
  
    __obj.asInstanceOf[GetDataErrorObject]
  }
}

