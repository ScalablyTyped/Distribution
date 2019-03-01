package typings
package faviconsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  /* Create Android homescreen icon.  */
  var android: scala.Boolean | Anon_Background
  /* Create Apple touch icons.  */
  var appleIcon: scala.Boolean | Anon_Background
  /* Create Apple startup images.  */
  var appleStartup: scala.Boolean | Anon_Background
  /* Create Opera Coast icon.  */
  var coast: scala.Boolean | Anon_Background
  /* Create regular favicons.  */
  var favicons: scala.Boolean
  /* Create Firefox OS icons.  */
  var firefox: scala.Boolean | Anon_Background
  /* Create Windows 8 tile icons.   */
  var windows: scala.Boolean | Anon_BackgroundString
  /* Create Yandex browser icon. */
  var yandex: scala.Boolean | Anon_BackgroundString
}

object Anon_Android {
  @scala.inline
  def apply(
    android: scala.Boolean | Anon_Background,
    appleIcon: scala.Boolean | Anon_Background,
    appleStartup: scala.Boolean | Anon_Background,
    coast: scala.Boolean | Anon_Background,
    favicons: scala.Boolean,
    firefox: scala.Boolean | Anon_Background,
    windows: scala.Boolean | Anon_BackgroundString,
    yandex: scala.Boolean | Anon_BackgroundString
  ): Anon_Android = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    __obj.updateDynamic("appleIcon")(appleIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("appleStartup")(appleStartup.asInstanceOf[js.Any])
    __obj.updateDynamic("coast")(coast.asInstanceOf[js.Any])
    __obj.updateDynamic("favicons")(favicons)
    __obj.updateDynamic("firefox")(firefox.asInstanceOf[js.Any])
    __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.updateDynamic("yandex")(yandex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Android]
  }
}

