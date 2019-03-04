package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject
}

object AsObject {
  @scala.inline
  def apply(
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.OneofOptionsNs.AsObject,
    name: java.lang.String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(options = options)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AsObject]
  }
}

