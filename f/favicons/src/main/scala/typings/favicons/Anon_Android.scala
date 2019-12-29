package typings.favicons

import typings.favicons.faviconsMod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  /* Create Android homescreen icon. */
  var android: Boolean | IconOptions
  /* Create Apple touch icons. */
  var appleIcon: Boolean | IconOptions
  /* Create Apple startup images. */
  var appleStartup: Boolean | IconOptions
  /* Create Opera Coast icon. */
  var coast: Boolean | IconOptions
  /* Create regular favicons. */
  var favicons: Boolean | IconOptions
  /* Create Firefox OS icons. */
  var firefox: Boolean | IconOptions
  /* Create Windows 8 tile icons. */
  var windows: Boolean | IconOptions
  /* Create Yandex browser icon. */
  var yandex: Boolean | IconOptions
}

object Anon_Android {
  @scala.inline
  def apply(
    android: Boolean | IconOptions,
    appleIcon: Boolean | IconOptions,
    appleStartup: Boolean | IconOptions,
    coast: Boolean | IconOptions,
    favicons: Boolean | IconOptions,
    firefox: Boolean | IconOptions,
    windows: Boolean | IconOptions,
    yandex: Boolean | IconOptions
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], appleIcon = appleIcon.asInstanceOf[js.Any], appleStartup = appleStartup.asInstanceOf[js.Any], coast = coast.asInstanceOf[js.Any], favicons = favicons.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any], yandex = yandex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Android]
  }
}

