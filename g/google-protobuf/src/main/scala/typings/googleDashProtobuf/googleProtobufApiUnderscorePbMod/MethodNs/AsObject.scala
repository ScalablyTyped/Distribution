package typings.googleDashProtobuf.googleProtobufApiUnderscorePbMod.MethodNs

import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  var requestStreaming: Boolean
  var requestTypeUrl: String
  var responseStreaming: Boolean
  var responseTypeUrl: String
  var syntax: Syntax
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject],
    requestStreaming: Boolean,
    requestTypeUrl: String,
    responseStreaming: Boolean,
    responseTypeUrl: String,
    syntax: Syntax
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name, optionsList = optionsList, requestStreaming = requestStreaming, requestTypeUrl = requestTypeUrl, responseStreaming = responseStreaming, responseTypeUrl = responseTypeUrl, syntax = syntax)
  
    __obj.asInstanceOf[AsObject]
  }
}

