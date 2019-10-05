package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var clientStreaming: js.UndefOr[Boolean] = js.undefined
  var inputType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions.AsObject
  ] = js.undefined
  var outputType: js.UndefOr[String] = js.undefined
  var serverStreaming: js.UndefOr[Boolean] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    clientStreaming: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.MethodOptions.AsObject = null,
    outputType: String = null,
    serverStreaming: js.UndefOr[Boolean] = js.undefined
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

