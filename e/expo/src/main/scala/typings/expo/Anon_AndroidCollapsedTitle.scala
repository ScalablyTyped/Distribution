package typings.expo

import typings.expo.expoStrings.collapse
import typings.expo.expoStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidCollapsedTitle extends js.Object {
  var androidCollapsedTitle: js.UndefOr[String] = js.undefined
  var androidMode: js.UndefOr[default | collapse] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
}

object Anon_AndroidCollapsedTitle {
  @scala.inline
  def apply(
    androidCollapsedTitle: String = null,
    androidMode: default | collapse = null,
    color: String = null,
    icon: String = null
  ): Anon_AndroidCollapsedTitle = {
    val __obj = js.Dynamic.literal()
    if (androidCollapsedTitle != null) __obj.updateDynamic("androidCollapsedTitle")(androidCollapsedTitle)
    if (androidMode != null) __obj.updateDynamic("androidMode")(androidMode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[Anon_AndroidCollapsedTitle]
  }
}

