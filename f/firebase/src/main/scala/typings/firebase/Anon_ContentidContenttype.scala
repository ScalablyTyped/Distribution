package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentidContenttype
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object Anon_ContentidContenttype {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    content_id: String = null,
    content_type: String = null,
    method: String = null
  ): Anon_ContentidContenttype = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_ContentidContenttype]
  }
}

