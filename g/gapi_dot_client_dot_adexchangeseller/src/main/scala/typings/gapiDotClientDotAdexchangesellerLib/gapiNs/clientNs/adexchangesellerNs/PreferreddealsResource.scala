package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreferreddealsResource extends js.Object {
  /** Get information about the selected Ad Exchange Preferred Deal. */
  def get(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltDealId): gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeal]
  /** List the preferred deals for this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeals]
}

object PreferreddealsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltDealId, 
      gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeal]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PreferredDeals]
    ]
  ): PreferreddealsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[PreferreddealsResource]
  }
}

