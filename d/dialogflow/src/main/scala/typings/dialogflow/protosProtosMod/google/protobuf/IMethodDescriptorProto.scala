package typings.dialogflow.protosProtosMod.google.protobuf

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
    clientStreaming: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    name: String = null,
    options: IMethodOptions = null,
    outputType: String = null,
    serverStreaming: js.UndefOr[Boolean] = js.undefined
  ): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientStreaming)) __obj.updateDynamic("clientStreaming")(clientStreaming)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (outputType != null) __obj.updateDynamic("outputType")(outputType)
    if (!js.isUndefined(serverStreaming)) __obj.updateDynamic("serverStreaming")(serverStreaming)
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
}

