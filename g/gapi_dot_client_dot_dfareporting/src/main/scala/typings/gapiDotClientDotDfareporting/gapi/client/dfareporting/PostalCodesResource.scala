package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltCode
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesResource extends js.Object {
  /** Gets one postal code by ID. */
  def get(request: Anon_AltCode): Request[PostalCode]
  /** Retrieves a list of postal codes. */
  def list(request: Anon_AltFieldsKey): Request[PostalCodesListResponse]
}

object PostalCodesResource {
  @scala.inline
  def apply(
    get: Anon_AltCode => Request[PostalCode],
    list: Anon_AltFieldsKey => Request[PostalCodesListResponse]
  ): PostalCodesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PostalCodesResource]
  }
}

