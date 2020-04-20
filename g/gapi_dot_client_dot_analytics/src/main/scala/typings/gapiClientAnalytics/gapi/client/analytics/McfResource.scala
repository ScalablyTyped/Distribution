package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonEnddate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait McfResource extends js.Object {
  /** Returns Analytics Multi-Channel Funnels data for a view (profile). */
  def get(request: AnonEnddate): Request_[McfData]
}

object McfResource {
  @scala.inline
  def apply(get: AnonEnddate => Request_[McfData]): McfResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[McfResource]
  }
}

