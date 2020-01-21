package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresults
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request_[Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request_[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresults): Request_[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request_[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp): Request_[EntityAdWordsLink]
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request_[Unit],
    get: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request_[EntityAdWordsLink],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[EntityAdWordsLink],
    list: AnonAccountIdAltFieldsKeyMaxresults => Request_[EntityAdWordsLinks],
    patch: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request_[EntityAdWordsLink],
    update: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp => Request_[EntityAdWordsLink]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
}

