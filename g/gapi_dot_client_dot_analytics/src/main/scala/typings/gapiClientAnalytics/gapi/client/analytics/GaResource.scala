package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: Alt): Request[GaData]
}

object GaResource {
  @scala.inline
  def apply(get: Alt => Request[GaData]): GaResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GaResource]
  }
}

