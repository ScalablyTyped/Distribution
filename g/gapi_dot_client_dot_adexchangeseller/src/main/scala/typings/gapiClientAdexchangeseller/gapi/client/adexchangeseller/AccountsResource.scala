package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonAccountIdAltFields
import typings.gapiClientAdexchangeseller.AnonAlt
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
  def get(request: AnonAccountIdAltFields): Request_[Account]
  /** List all accounts available to this Ad Exchange account. */
  def list(request: AnonAlt): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: AnonAccountIdAltFields => Request_[Account],
    list: AnonAlt => Request_[Accounts],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients.asInstanceOf[js.Any], alerts = alerts.asInstanceOf[js.Any], customchannels = customchannels.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), metadata = metadata.asInstanceOf[js.Any], preferreddeals = preferreddeals.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], urlchannels = urlchannels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountsResource]
  }
}

