package typings
package figletLib.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var font: js.UndefOr[Fonts] = js.undefined
  var horizontalLayout: js.UndefOr[KerningMethods] = js.undefined
  var printDirection: js.UndefOr[PrintDirection] = js.undefined
  var showHardBlanks: js.UndefOr[scala.Boolean] = js.undefined
  var verticalLayout: js.UndefOr[KerningMethods] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    font: Fonts = null,
    horizontalLayout: KerningMethods = null,
    printDirection: js.UndefOr[PrintDirection] = js.undefined,
    showHardBlanks: js.UndefOr[scala.Boolean] = js.undefined,
    verticalLayout: KerningMethods = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalLayout != null) __obj.updateDynamic("horizontalLayout")(horizontalLayout)
    if (!js.isUndefined(printDirection)) __obj.updateDynamic("printDirection")(printDirection)
    if (!js.isUndefined(showHardBlanks)) __obj.updateDynamic("showHardBlanks")(showHardBlanks)
    if (verticalLayout != null) __obj.updateDynamic("verticalLayout")(verticalLayout)
    __obj.asInstanceOf[Options]
  }
}

