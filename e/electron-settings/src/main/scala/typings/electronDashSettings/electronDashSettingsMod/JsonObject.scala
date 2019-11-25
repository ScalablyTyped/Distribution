package typings.electronDashSettings.electronDashSettingsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObject
  extends /* x */ StringDictionary[JsonValue]
     with _JsonValue

object JsonObject {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[JsonValue] = null): JsonObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JsonObject]
  }
}

