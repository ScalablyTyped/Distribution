package typings.expoDashConstants.buildConstantsDotTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoDashConstants.Anon_KeyScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformManifest
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[AndroidManifest] = js.undefined
  var detach: js.UndefOr[Anon_KeyScheme] = js.undefined
  var developer: js.UndefOr[String] = js.undefined
  var hostUri: js.UndefOr[String] = js.undefined
  var ios: js.UndefOr[IOSManifest] = js.undefined
  var logUrl: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var web: js.UndefOr[WebManifest] = js.undefined
}

object PlatformManifest {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    android: AndroidManifest = null,
    detach: Anon_KeyScheme = null,
    developer: String = null,
    hostUri: String = null,
    ios: IOSManifest = null,
    logUrl: String = null,
    scheme: String = null,
    web: WebManifest = null
  ): PlatformManifest = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android)
    if (detach != null) __obj.updateDynamic("detach")(detach)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (hostUri != null) __obj.updateDynamic("hostUri")(hostUri)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (web != null) __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[PlatformManifest]
  }
}

