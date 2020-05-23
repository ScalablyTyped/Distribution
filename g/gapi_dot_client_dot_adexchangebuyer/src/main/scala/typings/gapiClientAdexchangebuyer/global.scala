package typings.gapiClientAdexchangebuyer

import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.AccountsResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BillingInfoResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BudgetResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.CreativesResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacedealsResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacenotesResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplaceprivateauctionResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PerformanceReportResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PretargetingConfigResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProductsResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProposalsResource
import typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PubprofilesResource
import typings.gapiClientAdexchangebuyer.gapiClientAdexchangebuyerStrings.adexchangebuyer
import typings.gapiClientAdexchangebuyer.gapiClientAdexchangebuyerStrings.v1Dot4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val accounts: AccountsResource = js.native
      val billingInfo: BillingInfoResource = js.native
      val budget: BudgetResource = js.native
      val creatives: CreativesResource = js.native
      val marketplacedeals: MarketplacedealsResource = js.native
      val marketplacenotes: MarketplacenotesResource = js.native
      val marketplaceprivateauction: MarketplaceprivateauctionResource = js.native
      val performanceReport: PerformanceReportResource = js.native
      val pretargetingConfig: PretargetingConfigResource = js.native
      val products: ProductsResource = js.native
      val proposals: ProposalsResource = js.native
      val pubprofiles: PubprofilesResource = js.native
      /** Load Ad Exchange Buyer API v1.4 */
      def load(name: adexchangebuyer, version: v1Dot4): js.Thenable[Unit] = js.native
      def load(name: adexchangebuyer, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

