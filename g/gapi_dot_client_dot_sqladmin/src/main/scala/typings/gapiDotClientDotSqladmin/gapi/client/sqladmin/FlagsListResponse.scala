package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsListResponse extends js.Object {
  /** List of flags. */
  var items: js.UndefOr[js.Array[Flag]] = js.undefined
  /** This is always sql#flagsList. */
  var kind: js.UndefOr[String] = js.undefined
}

object FlagsListResponse {
  @scala.inline
  def apply(items: js.Array[Flag] = null, kind: String = null): FlagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagsListResponse]
  }
}

