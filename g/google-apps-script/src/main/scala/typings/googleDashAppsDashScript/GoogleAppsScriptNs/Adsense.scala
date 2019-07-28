package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdclientsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AdunitsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AlertsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.CustomchannelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.PaymentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.SavedadstylesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.UrlchannelsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adsense extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var Adclients: js.UndefOr[AdclientsCollection] = js.undefined
  var Adunits: js.UndefOr[AdunitsCollection] = js.undefined
  var Alerts: js.UndefOr[AlertsCollection] = js.undefined
  var Customchannels: js.UndefOr[CustomchannelsCollection] = js.undefined
  var Metadata: js.UndefOr[MetadataCollection] = js.undefined
  var Payments: js.UndefOr[PaymentsCollection] = js.undefined
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  var Savedadstyles: js.UndefOr[SavedadstylesCollection] = js.undefined
  var Urlchannels: js.UndefOr[UrlchannelsCollection] = js.undefined
}

object Adsense {
  @scala.inline
  def apply(
    Accounts: AccountsCollection = null,
    Adclients: AdclientsCollection = null,
    Adunits: AdunitsCollection = null,
    Alerts: AlertsCollection = null,
    Customchannels: CustomchannelsCollection = null,
    Metadata: MetadataCollection = null,
    Payments: PaymentsCollection = null,
    Reports: ReportsCollection = null,
    Savedadstyles: SavedadstylesCollection = null,
    Urlchannels: UrlchannelsCollection = null
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

