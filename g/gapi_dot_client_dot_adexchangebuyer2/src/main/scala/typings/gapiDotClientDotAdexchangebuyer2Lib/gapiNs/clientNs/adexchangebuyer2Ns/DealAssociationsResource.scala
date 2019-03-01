package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealAssociationsResource extends js.Object {
  /** Associate an existing deal with a creative. */
  def add(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** List all creative-deal associations. */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListDealAssociationsResponse]
  /** Remove the association between a deal and a creative. */
  def remove(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

object DealAssociationsResource {
  @scala.inline
  def apply(
    add: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDealAssociationsResponse]
    ],
    remove: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ]
  ): DealAssociationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[DealAssociationsResource]
  }
}

