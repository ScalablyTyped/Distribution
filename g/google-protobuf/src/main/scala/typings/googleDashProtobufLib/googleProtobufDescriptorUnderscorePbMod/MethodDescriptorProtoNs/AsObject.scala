package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var clientStreaming: js.UndefOr[scala.Boolean] = js.undefined
  var inputType: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.AsObject
  ] = js.undefined
  var outputType: js.UndefOr[java.lang.String] = js.undefined
  var serverStreaming: js.UndefOr[scala.Boolean] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    clientStreaming: js.UndefOr[scala.Boolean] = js.undefined,
    inputType: java.lang.String = null,
    name: java.lang.String = null,
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.MethodOptionsNs.AsObject = null,
    outputType: java.lang.String = null,
    serverStreaming: js.UndefOr[scala.Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientStreaming)) __obj.updateDynamic("clientStreaming")(clientStreaming)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (outputType != null) __obj.updateDynamic("outputType")(outputType)
    if (!js.isUndefined(serverStreaming)) __obj.updateDynamic("serverStreaming")(serverStreaming)
    __obj.asInstanceOf[AsObject]
  }
}

