package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

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
    method: js.Array[IMethodDescriptorProto] = null,
    name: String = null,
    options: IServiceOptions = null
  ): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
}

