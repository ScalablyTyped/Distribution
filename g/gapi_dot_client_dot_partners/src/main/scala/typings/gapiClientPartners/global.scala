package typings.gapiClientPartners

import typings.gapiClientPartners.gapi.client.partners.AnalyticsResource
import typings.gapiClientPartners.gapi.client.partners.ClientMessagesResource
import typings.gapiClientPartners.gapi.client.partners.CompaniesResource
import typings.gapiClientPartners.gapi.client.partners.ExamsResource
import typings.gapiClientPartners.gapi.client.partners.LeadsResource
import typings.gapiClientPartners.gapi.client.partners.OffersResource
import typings.gapiClientPartners.gapi.client.partners.UserEventsResource
import typings.gapiClientPartners.gapi.client.partners.UserStatesResource
import typings.gapiClientPartners.gapi.client.partners.UsersResource
import typings.gapiClientPartners.gapi.client.partners.V2Resource
import typings.gapiClientPartners.gapiClientPartnersStrings.partners
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
      val analytics: AnalyticsResource = js.native
      val clientMessages: ClientMessagesResource = js.native
      val companies: CompaniesResource = js.native
      val exams: ExamsResource = js.native
      val leads: LeadsResource = js.native
      val offers: OffersResource = js.native
      val userEvents: UserEventsResource = js.native
      val userStates: UserStatesResource = js.native
      val users: UsersResource = js.native
      val v2: V2Resource = js.native
      /** Load Google Partners API v2 */
      def load(name: partners, version: typings.gapiClientPartners.gapiClientPartnersStrings.v2): js.Thenable[Unit] = js.native
      def load(
        name: partners,
        version: typings.gapiClientPartners.gapiClientPartnersStrings.v2,
        callback: js.Function0[_]
      ): Unit = js.native
    }
    
  }
  
}

