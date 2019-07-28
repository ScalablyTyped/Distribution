package typings.gapiDotClientDotPartners.gapiNs.clientNs

import typings.gapiDotClientDotPartners.gapiDotClientDotPartnersStrings.partners
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.AnalyticsResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.ClientMessagesResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.CompaniesResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.ExamsResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.LeadsResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.OffersResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.UserEventsResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.UserStatesResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.UsersResource
import typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs.V2Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
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
  def load(name: partners, version: typings.gapiDotClientDotPartners.gapiDotClientDotPartnersStrings.v2): js.Thenable[Unit] = js.native
  def load(
    name: partners,
    version: typings.gapiDotClientDotPartners.gapiDotClientDotPartnersStrings.v2,
    callback: js.Function0[_]
  ): Unit = js.native
}

