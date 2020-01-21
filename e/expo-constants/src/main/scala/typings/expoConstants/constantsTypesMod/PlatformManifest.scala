package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.AnonKeyScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformManifest
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[AndroidManifest] = js.undefined
  var detach: js.UndefOr[AnonKeyScheme] = js.undefined
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
    detach: AnonKeyScheme = null,
    developer: String = null,
    hostUri: String = null,
    ios: IOSManifest = null,
    logUrl: String = null,
    scheme: String = null,
    web: WebManifest = null
  ): PlatformManifest = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (detach != null) __obj.updateDynamic("detach")(detach.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (hostUri != null) __obj.updateDynamic("hostUri")(hostUri.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformManifest]
  }
}

