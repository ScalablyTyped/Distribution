package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersListResponse extends js.Object {
  /** List of tiers. */
  var items: js.UndefOr[js.Array[Tier]] = js.undefined
  /** This is always sql#tiersList. */
  var kind: js.UndefOr[String] = js.undefined
}

object TiersListResponse {
  @scala.inline
  def apply(items: js.Array[Tier] = null, kind: String = null): TiersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiersListResponse]
  }
}

