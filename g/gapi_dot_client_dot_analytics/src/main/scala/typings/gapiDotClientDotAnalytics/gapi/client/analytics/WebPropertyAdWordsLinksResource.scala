package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request[Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request[EntityAdWordsLink]
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request[Unit],
    get: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request[EntityAdWordsLink],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[EntityAdWordsLink],
    list: Anon_AccountIdAltFieldsKeyMaxresults => Request[EntityAdWordsLinks],
    patch: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request[EntityAdWordsLink],
    update: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request[EntityAdWordsLink]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
}

