package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var buttons: js.UndefOr[js.Array[dialogflowLib.Anon_Postback]] = js.undefined
  var imageUri: js.UndefOr[java.lang.String] = js.undefined
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Card {
  @scala.inline
  def apply(
    buttons: js.Array[dialogflowLib.Anon_Postback] = null,
    imageUri: java.lang.String = null,
    subtitle: java.lang.String = null,
    title: java.lang.String = null
  ): Card = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Card]
  }
}

