package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicCard extends js.Object {
  var buttons: js.UndefOr[js.Array[dialogflowLib.Anon_OpenUriAction]] = js.undefined
  var formattedText: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BasicCard {
  @scala.inline
  def apply(
    buttons: js.Array[dialogflowLib.Anon_OpenUriAction] = null,
    formattedText: java.lang.String = null,
    image: Image = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): BasicCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText)
    if (image != null) __obj.updateDynamic("image")(image)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BasicCard]
  }
}

