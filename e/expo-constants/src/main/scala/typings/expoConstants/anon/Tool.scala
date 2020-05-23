package typings.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tool
  extends /* key */ StringDictionary[js.Any] {
  var tool: js.UndefOr[String] = js.undefined
}

object Tool {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, tool: String = null): Tool = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
}

