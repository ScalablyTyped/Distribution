package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSManifest
  extends /* key */ StringDictionary[js.Any] {
  var buildNumber: String
  var model: String
  var platform: String
  var systemVersion: String
  var userInterfaceIdiom: UserInterfaceIdiom
}

object IOSManifest {
  @scala.inline
  def apply(
    buildNumber: String,
    model: String,
    platform: String,
    systemVersion: String,
    userInterfaceIdiom: UserInterfaceIdiom,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): IOSManifest = {
    val __obj = js.Dynamic.literal(buildNumber = buildNumber.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], userInterfaceIdiom = userInterfaceIdiom.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IOSManifest]
  }
}

