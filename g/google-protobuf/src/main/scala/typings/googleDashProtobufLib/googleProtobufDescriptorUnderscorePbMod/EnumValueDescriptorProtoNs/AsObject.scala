package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueDescriptorProtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[
    googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    number: scala.Int | scala.Double = null,
    options: googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.EnumValueOptionsNs.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AsObject]
  }
}

