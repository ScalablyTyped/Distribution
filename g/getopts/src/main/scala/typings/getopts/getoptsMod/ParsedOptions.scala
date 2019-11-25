package typings.getopts.getoptsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions
  extends /* key */ StringDictionary[js.Any] {
  var `_`: js.Array[String]
}

object ParsedOptions {
  @scala.inline
  def apply(`_`: js.Array[String], StringDictionary: /* key */ StringDictionary[js.Any] = null): ParsedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedOptions]
  }
}

