package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

