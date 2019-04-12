package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var accessibilityText: js.UndefOr[java.lang.String] = js.undefined
  var imageUri: js.UndefOr[java.lang.String] = js.undefined
}

object Image {
  @scala.inline
  def apply(accessibilityText: java.lang.String = null, imageUri: java.lang.String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (accessibilityText != null) __obj.updateDynamic("accessibilityText")(accessibilityText)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    __obj.asInstanceOf[Image]
  }
}

