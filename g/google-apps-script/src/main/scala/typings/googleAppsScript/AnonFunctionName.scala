package typings.googleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFunctionName extends js.Object {
  var functionName: String
  var name: String
}

object AnonFunctionName {
  @scala.inline
  def apply(functionName: String, name: String): AnonFunctionName = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFunctionName]
  }
}

