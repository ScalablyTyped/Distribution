package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: String = null,
    options: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

