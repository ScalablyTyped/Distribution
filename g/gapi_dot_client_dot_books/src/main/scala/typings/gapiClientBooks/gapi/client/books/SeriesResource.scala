package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonSeriesid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesResource extends js.Object {
  var membership: MembershipResource
  /** Returns Series metadata for the given series ids. */
  def get(request: AnonSeriesid): Request_[Series]
}

object SeriesResource {
  @scala.inline
  def apply(get: AnonSeriesid => Request_[Series], membership: MembershipResource): SeriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesResource]
  }
}

