package typings.getopts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions
  extends /* key */ StringDictionary[js.Any] {
  @JSName("_")
  var _underscore: js.Array[String]
}

object ParsedOptions {
  @scala.inline
  def apply(_underscore: js.Array[String], StringDictionary: /* key */ StringDictionary[js.Any] = null): ParsedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedOptions]
  }
}

