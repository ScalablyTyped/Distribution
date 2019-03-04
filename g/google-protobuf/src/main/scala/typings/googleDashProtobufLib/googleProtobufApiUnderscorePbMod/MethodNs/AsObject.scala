package typings
package googleDashProtobufLib.googleProtobufApiUnderscorePbMod.MethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: java.lang.String
  var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var requestStreaming: scala.Boolean
  var requestTypeUrl: java.lang.String
  var responseStreaming: scala.Boolean
  var responseTypeUrl: java.lang.String
  var syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
}

object AsObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    requestStreaming: scala.Boolean,
    requestTypeUrl: java.lang.String,
    responseStreaming: scala.Boolean,
    responseTypeUrl: java.lang.String,
    syntax: googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name, optionsList = optionsList, requestStreaming = requestStreaming, requestTypeUrl = requestTypeUrl, responseStreaming = responseStreaming, responseTypeUrl = responseTypeUrl, syntax = syntax)
  
    __obj.asInstanceOf[AsObject]
  }
}

