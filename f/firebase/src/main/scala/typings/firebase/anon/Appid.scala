package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appid
  extends /* key */ StringDictionary[js.Any] {
  var app_id: js.UndefOr[String] = js.undefined
  var app_installer_id: js.UndefOr[String] = js.undefined
  var app_name: String
  var app_version: js.UndefOr[String] = js.undefined
  var screen_name: js.UndefOr[String] = js.undefined
}

object Appid {
  @scala.inline
  def apply(
    app_name: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    app_id: String = null,
    app_installer_id: String = null,
    app_version: String = null,
    screen_name: String = null
  ): Appid = {
    val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (app_installer_id != null) __obj.updateDynamic("app_installer_id")(app_installer_id.asInstanceOf[js.Any])
    if (app_version != null) __obj.updateDynamic("app_version")(app_version.asInstanceOf[js.Any])
    if (screen_name != null) __obj.updateDynamic("screen_name")(screen_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
}

