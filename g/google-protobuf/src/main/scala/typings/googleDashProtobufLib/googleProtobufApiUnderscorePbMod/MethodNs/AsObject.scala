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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optionsList")(optionsList)
    __obj.updateDynamic("requestStreaming")(requestStreaming)
    __obj.updateDynamic("requestTypeUrl")(requestTypeUrl)
    __obj.updateDynamic("responseStreaming")(responseStreaming)
    __obj.updateDynamic("responseTypeUrl")(responseTypeUrl)
    __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[AsObject]
  }
}

