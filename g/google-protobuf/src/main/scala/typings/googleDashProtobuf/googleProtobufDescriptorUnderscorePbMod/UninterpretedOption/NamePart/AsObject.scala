package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.NamePart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var isExtension: js.UndefOr[Boolean] = js.undefined
  var namePart: js.UndefOr[String] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(isExtension: js.UndefOr[Boolean] = js.undefined, namePart: String = null): AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExtension)) __obj.updateDynamic("isExtension")(isExtension)
    if (namePart != null) __obj.updateDynamic("namePart")(namePart)
    __obj.asInstanceOf[AsObject]
  }
}

