package typings.favicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  /* Create Android homescreen icon.  */
  var android: Boolean | Anon_Background
  /* Create Apple touch icons.  */
  var appleIcon: Boolean | Anon_Background
  /* Create Apple startup images.  */
  var appleStartup: Boolean | Anon_Background
  /* Create Opera Coast icon.  */
  var coast: Boolean | Anon_Background
  /* Create regular favicons.  */
  var favicons: Boolean
  /* Create Firefox OS icons.  */
  var firefox: Boolean | Anon_Background
  /* Create Windows 8 tile icons.   */
  var windows: Boolean | Anon_BackgroundString
  /* Create Yandex browser icon. */
  var yandex: Boolean | Anon_BackgroundString
}

object Anon_Android {
  @scala.inline
  def apply(
    android: Boolean | Anon_Background,
    appleIcon: Boolean | Anon_Background,
    appleStartup: Boolean | Anon_Background,
    coast: Boolean | Anon_Background,
    favicons: Boolean,
    firefox: Boolean | Anon_Background,
    windows: Boolean | Anon_BackgroundString,
    yandex: Boolean | Anon_BackgroundString
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], appleIcon = appleIcon.asInstanceOf[js.Any], appleStartup = appleStartup.asInstanceOf[js.Any], coast = coast.asInstanceOf[js.Any], favicons = favicons.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], yandex = yandex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Android]
  }
}

