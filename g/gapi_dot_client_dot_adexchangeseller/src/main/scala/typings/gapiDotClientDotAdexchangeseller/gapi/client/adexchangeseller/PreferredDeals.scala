package typings.gapiDotClientDotAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferredDeals extends js.Object {
  /** The preferred deals returned in this list response. */
  var items: js.UndefOr[js.Array[PreferredDeal]] = js.undefined
  /** Kind of list this is, in this case adexchangeseller#preferredDeals. */
  var kind: js.UndefOr[String] = js.undefined
}

object PreferredDeals {
  @scala.inline
  def apply(items: js.Array[PreferredDeal] = null, kind: String = null): PreferredDeals = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[PreferredDeals]
  }
}

