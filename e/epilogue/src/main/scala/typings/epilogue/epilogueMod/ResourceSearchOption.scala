package typings.epilogue.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceSearchOption extends js.Object {
  var attributes: js.Array[String]
  var operator: String
  var param: String
}

object ResourceSearchOption {
  @scala.inline
  def apply(attributes: js.Array[String], operator: String, param: String): ResourceSearchOption = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceSearchOption]
  }
}

