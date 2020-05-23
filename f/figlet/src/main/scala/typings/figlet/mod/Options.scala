package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var font: js.UndefOr[Fonts_] = js.undefined
  var horizontalLayout: js.UndefOr[KerningMethods] = js.undefined
  var printDirection: js.UndefOr[PrintDirection] = js.undefined
  var showHardBlanks: js.UndefOr[Boolean] = js.undefined
  var verticalLayout: js.UndefOr[KerningMethods] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    font: Fonts_ = null,
    horizontalLayout: KerningMethods = null,
    printDirection: js.UndefOr[PrintDirection] = js.undefined,
    showHardBlanks: js.UndefOr[Boolean] = js.undefined,
    verticalLayout: KerningMethods = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalLayout != null) __obj.updateDynamic("horizontalLayout")(horizontalLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(printDirection)) __obj.updateDynamic("printDirection")(printDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHardBlanks)) __obj.updateDynamic("showHardBlanks")(showHardBlanks.get.asInstanceOf[js.Any])
    if (verticalLayout != null) __obj.updateDynamic("verticalLayout")(verticalLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

