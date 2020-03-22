package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: AnonKey): Request_[TiersListResponse]
}

object TiersResource {
  @scala.inline
  def apply(list: AnonKey => Request_[TiersListResponse]): TiersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TiersResource]
  }
}

