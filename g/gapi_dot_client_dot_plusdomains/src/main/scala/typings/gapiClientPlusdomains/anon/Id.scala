package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  /** The ID of the activity. */
  var id: js.UndefOr[String] = js.undefined
  /** The URL of the activity. */
  var url: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(id: String = null, url: String = null): Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

