package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggPlugin
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[EggPluginItem]] {
  var development: js.UndefOr[EggPluginItem] = js.undefined
  var i18n: js.UndefOr[EggPluginItem] = js.undefined
  var jsonp: js.UndefOr[EggPluginItem] = js.undefined
  var logrotator: js.UndefOr[EggPluginItem] = js.undefined
  var multipart: js.UndefOr[EggPluginItem] = js.undefined
  var onerror: js.UndefOr[EggPluginItem] = js.undefined
  var schedule: js.UndefOr[EggPluginItem] = js.undefined
  var security: js.UndefOr[EggPluginItem] = js.undefined
  var session: js.UndefOr[EggPluginItem] = js.undefined
  var static: js.UndefOr[EggPluginItem] = js.undefined
  var view: js.UndefOr[EggPluginItem] = js.undefined
  var watcher: js.UndefOr[EggPluginItem] = js.undefined
}

object EggPlugin {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[EggPluginItem]] = null,
    development: EggPluginItem = null,
    i18n: EggPluginItem = null,
    jsonp: EggPluginItem = null,
    logrotator: EggPluginItem = null,
    multipart: EggPluginItem = null,
    onerror: EggPluginItem = null,
    schedule: EggPluginItem = null,
    security: EggPluginItem = null,
    session: EggPluginItem = null,
    static: EggPluginItem = null,
    view: EggPluginItem = null,
    watcher: EggPluginItem = null
  ): EggPlugin = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (development != null) __obj.updateDynamic("development")(development.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (logrotator != null) __obj.updateDynamic("logrotator")(logrotator.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (watcher != null) __obj.updateDynamic("watcher")(watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggPlugin]
  }
}

