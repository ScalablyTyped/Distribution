package typings.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ServiceDescriptorProto. */
trait IServiceDescriptorProto extends js.Object {
  /** ServiceDescriptorProto method */
  var method: js.UndefOr[js.Array[IMethodDescriptorProto] | Null] = js.undefined
  /** ServiceDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** ServiceDescriptorProto options */
  var options: js.UndefOr[IServiceOptions | Null] = js.undefined
}

object IServiceDescriptorProto {
  @scala.inline
  def apply(
    method: js.UndefOr[Null | js.Array[IMethodDescriptorProto]] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    options: js.UndefOr[Null | IServiceOptions] = js.undefined
  ): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
}

