package typings.firefoxWebextBrowser.browser.extensionTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainJSONObject
  extends /* key */ StringDictionary[PlainJSONValue]
     with _PlainJSONValue

object PlainJSONObject {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[PlainJSONValue] = null): PlainJSONObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PlainJSONObject]
  }
}

