package typings
package getoptsLib.getoptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `_`: js.Array[java.lang.String]
}

object ParsedOptions {
  @scala.inline
  def apply(
    `_`: js.Array[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(`_` = `_`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ParsedOptions]
  }
}

