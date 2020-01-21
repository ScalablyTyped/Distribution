package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclicksearch.AnonAdvertiserIdAgencyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnsResource extends js.Object {
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: AnonAdvertiserIdAgencyId): Request_[SavedColumnList]
}

object SavedColumnsResource {
  @scala.inline
  def apply(list: AnonAdvertiserIdAgencyId => Request_[SavedColumnList]): SavedColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedColumnsResource]
  }
}

