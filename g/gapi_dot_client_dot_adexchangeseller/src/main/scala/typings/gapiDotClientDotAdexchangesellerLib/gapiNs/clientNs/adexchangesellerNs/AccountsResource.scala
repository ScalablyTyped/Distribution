package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

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
  def get(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Account]
  /** List all accounts available to this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    adclients: AdclientsResource,
    alerts: AlertsResource,
    customchannels: CustomchannelsResource,
    get: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
    ],
    metadata: MetadataResource,
    preferreddeals: PreferreddealsResource,
    reports: ReportsResource,
    urlchannels: UrlchannelsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(adclients = adclients, alerts = alerts, customchannels = customchannels, get = get, list = list, metadata = metadata, preferreddeals = preferreddeals, reports = reports, urlchannels = urlchannels)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

