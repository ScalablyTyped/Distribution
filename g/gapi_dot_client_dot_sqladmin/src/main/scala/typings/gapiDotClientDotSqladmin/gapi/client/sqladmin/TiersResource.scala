package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSqladmin.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiersResource extends js.Object {
  /** Lists all available service tiers for Google Cloud SQL, for example D1, D2. For related information, see Pricing. */
  def list(request: Anon_AltFieldsKey): Request[TiersListResponse]
}

object TiersResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[TiersListResponse]): TiersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TiersResource]
  }
}

