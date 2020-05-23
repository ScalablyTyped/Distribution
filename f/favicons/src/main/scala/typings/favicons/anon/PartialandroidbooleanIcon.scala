package typings.favicons.anon

import typings.favicons.mod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  android  :boolean | favicons.favicons.IconOptions,   appleIcon  :boolean | favicons.favicons.IconOptions,   appleStartup  :boolean | favicons.favicons.IconOptions,   coast  :boolean | favicons.favicons.IconOptions,   favicons  :boolean | favicons.favicons.IconOptions,   firefox  :boolean | favicons.favicons.IconOptions,   windows  :boolean | favicons.favicons.IconOptions,   yandex  :boolean | favicons.favicons.IconOptions}> */
trait PartialandroidbooleanIcon extends js.Object {
  var android: js.UndefOr[Boolean | IconOptions] = js.undefined
  var appleIcon: js.UndefOr[Boolean | IconOptions] = js.undefined
  var appleStartup: js.UndefOr[Boolean | IconOptions] = js.undefined
  var coast: js.UndefOr[Boolean | IconOptions] = js.undefined
  var favicons: js.UndefOr[Boolean | IconOptions] = js.undefined
  var firefox: js.UndefOr[Boolean | IconOptions] = js.undefined
  var windows: js.UndefOr[Boolean | IconOptions] = js.undefined
  var yandex: js.UndefOr[Boolean | IconOptions] = js.undefined
}

object PartialandroidbooleanIcon {
  @scala.inline
  def apply(
    android: Boolean | IconOptions = null,
    appleIcon: Boolean | IconOptions = null,
    appleStartup: Boolean | IconOptions = null,
    coast: Boolean | IconOptions = null,
    favicons: Boolean | IconOptions = null,
    firefox: Boolean | IconOptions = null,
    windows: Boolean | IconOptions = null,
    yandex: Boolean | IconOptions = null
  ): PartialandroidbooleanIcon = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (appleIcon != null) __obj.updateDynamic("appleIcon")(appleIcon.asInstanceOf[js.Any])
    if (appleStartup != null) __obj.updateDynamic("appleStartup")(appleStartup.asInstanceOf[js.Any])
    if (coast != null) __obj.updateDynamic("coast")(coast.asInstanceOf[js.Any])
    if (favicons != null) __obj.updateDynamic("favicons")(favicons.asInstanceOf[js.Any])
    if (firefox != null) __obj.updateDynamic("firefox")(firefox.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    if (yandex != null) __obj.updateDynamic("yandex")(yandex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialandroidbooleanIcon]
  }
}

