package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adsense extends js.Object {
  var Accounts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsCollection
  ] = js.undefined
  var Adclients: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdclientsCollection
  ] = js.undefined
  var Adunits: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdunitsCollection
  ] = js.undefined
  var Alerts: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AlertsCollection
  ] = js.undefined
  var Customchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.CustomchannelsCollection
  ] = js.undefined
  var Metadata: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataCollection
  ] = js.undefined
  var Payments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.PaymentsCollection
  ] = js.undefined
  var Reports: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsCollection
  ] = js.undefined
  var Savedadstyles: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.SavedadstylesCollection
  ] = js.undefined
  var Urlchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.UrlchannelsCollection
  ] = js.undefined
}

object Adsense {
  @scala.inline
  def apply(
    Accounts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsCollection = null,
    Adclients: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdclientsCollection = null,
    Adunits: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdunitsCollection = null,
    Alerts: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AlertsCollection = null,
    Customchannels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.CustomchannelsCollection = null,
    Metadata: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataCollection = null,
    Payments: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.PaymentsCollection = null,
    Reports: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsCollection = null,
    Savedadstyles: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.SavedadstylesCollection = null,
    Urlchannels: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.UrlchannelsCollection = null
  ): Adsense = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (Adclients != null) __obj.updateDynamic("Adclients")(Adclients)
    if (Adunits != null) __obj.updateDynamic("Adunits")(Adunits)
    if (Alerts != null) __obj.updateDynamic("Alerts")(Alerts)
    if (Customchannels != null) __obj.updateDynamic("Customchannels")(Customchannels)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (Payments != null) __obj.updateDynamic("Payments")(Payments)
    if (Reports != null) __obj.updateDynamic("Reports")(Reports)
    if (Savedadstyles != null) __obj.updateDynamic("Savedadstyles")(Savedadstyles)
    if (Urlchannels != null) __obj.updateDynamic("Urlchannels")(Urlchannels)
    __obj.asInstanceOf[Adsense]
  }
}

