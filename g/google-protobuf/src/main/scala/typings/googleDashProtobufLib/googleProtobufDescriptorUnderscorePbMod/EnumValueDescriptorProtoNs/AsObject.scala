package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs.AsObject
}

object AsObject {
  @scala.inline
  def apply(
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs.AsObject,
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

