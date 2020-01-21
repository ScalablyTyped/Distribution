package typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart

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
    if (!js.isUndefined(isExtension)) __obj.updateDynamic("isExtension")(isExtension.asInstanceOf[js.Any])
    if (namePart != null) __obj.updateDynamic("namePart")(namePart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

