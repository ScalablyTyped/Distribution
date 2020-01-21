package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidManifest
  extends /* key */ StringDictionary[js.Any] {
  var versionCode: Double
}

object AndroidManifest {
  @scala.inline
  def apply(versionCode: Double, StringDictionary: /* key */ StringDictionary[js.Any] = null): AndroidManifest = {
    val __obj = js.Dynamic.literal(versionCode = versionCode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AndroidManifest]
  }
}

