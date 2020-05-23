package typings.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MethodDescriptorProto. */
trait IMethodDescriptorProto extends js.Object {
  /** MethodDescriptorProto clientStreaming */
  var clientStreaming: js.UndefOr[Boolean | Null] = js.undefined
  /** MethodDescriptorProto inputType */
  var inputType: js.UndefOr[String | Null] = js.undefined
  /** MethodDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** MethodDescriptorProto options */
  var options: js.UndefOr[IMethodOptions | Null] = js.undefined
  /** MethodDescriptorProto outputType */
  var outputType: js.UndefOr[String | Null] = js.undefined
  /** MethodDescriptorProto serverStreaming */
  var serverStreaming: js.UndefOr[Boolean | Null] = js.undefined
}

object IMethodDescriptorProto {
  @scala.inline
  def apply(
    clientStreaming: js.UndefOr[Null | Boolean] = js.undefined,
    inputType: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    options: js.UndefOr[Null | IMethodOptions] = js.undefined,
    outputType: js.UndefOr[Null | String] = js.undefined,
    serverStreaming: js.UndefOr[Null | Boolean] = js.undefined
  ): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientStreaming)) __obj.updateDynamic("clientStreaming")(clientStreaming.asInstanceOf[js.Any])
    if (!js.isUndefined(inputType)) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(outputType)) __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    if (!js.isUndefined(serverStreaming)) __obj.updateDynamic("serverStreaming")(serverStreaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
}

