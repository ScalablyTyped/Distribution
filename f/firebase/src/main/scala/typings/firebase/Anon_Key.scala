package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var method: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, method: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Key]
  }
}

