package typings.gapiDotClientDotAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAltFields
import typings.gapiDotClientDotAdexchangeseller.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var adclients: AdclientsResource
  var alerts: AlertsResource
  var customchannels: CustomchannelsResource
  var metadata: MetadataResource
  var preferreddeals: PreferreddealsResource
  var reports: ReportsResource
  var urlchannels: UrlchannelsResource
  /** Get information about the selected Ad Exchange account. */
  def get(request: Anon_AccountIdAltFields): Request[Account]
  /** List all accounts available to this Ad Exchange account. */
  def list(request: Anon_Alt): Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: Anon_AccountIdAltFields => Request[Account],
    list: Anon_Alt => Request[Accounts],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients, alerts = alerts, customchannels = customchannels, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), metadata = metadata, preferreddeals = preferreddeals, reports = reports, urlchannels = urlchannels)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

