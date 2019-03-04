package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new user to the given web property. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
    ]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list, update = update)
  
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

