package typings.dialogflow.protosProtosMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OneofDescriptorProto. */
trait IOneofDescriptorProto extends js.Object {
  /** OneofDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** OneofDescriptorProto options */
  var options: js.UndefOr[IOneofOptions | Null] = js.undefined
}

object IOneofDescriptorProto {
  @scala.inline
  def apply(name: String = null, options: IOneofOptions = null): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
}

