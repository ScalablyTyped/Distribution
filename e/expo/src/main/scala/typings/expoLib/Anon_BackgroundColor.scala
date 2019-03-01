package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var barStyle: js.UndefOr[expoLib.expoLibStrings.`light-content` | expoLib.expoLibStrings.`dark-content`] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    barStyle: expoLib.expoLibStrings.`light-content` | expoLib.expoLibStrings.`dark-content` = null
  ): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

