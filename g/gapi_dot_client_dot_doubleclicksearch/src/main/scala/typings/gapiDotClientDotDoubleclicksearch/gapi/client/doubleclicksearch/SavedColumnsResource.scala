package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDoubleclicksearch.Anon_AdvertiserIdAgencyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnsResource extends js.Object {
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: Anon_AdvertiserIdAgencyId): Request[SavedColumnList]
}

object SavedColumnsResource {
  @scala.inline
  def apply(list: Anon_AdvertiserIdAgencyId => Request[SavedColumnList]): SavedColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedColumnsResource]
  }
}

