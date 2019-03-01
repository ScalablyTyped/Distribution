package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidCollapsedTitle extends js.Object {
  var androidCollapsedTitle: js.UndefOr[java.lang.String] = js.undefined
  var androidMode: js.UndefOr[expoLib.expoLibStrings.default | expoLib.expoLibStrings.collapse] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AndroidCollapsedTitle {
  @scala.inline
  def apply(
    androidCollapsedTitle: java.lang.String = null,
    androidMode: expoLib.expoLibStrings.default | expoLib.expoLibStrings.collapse = null,
    color: java.lang.String = null,
    icon: java.lang.String = null
  ): Anon_AndroidCollapsedTitle = {
    val __obj = js.Dynamic.literal()
    if (androidCollapsedTitle != null) __obj.updateDynamic("androidCollapsedTitle")(androidCollapsedTitle)
    if (androidMode != null) __obj.updateDynamic("androidMode")(androidMode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[Anon_AndroidCollapsedTitle]
  }
}

