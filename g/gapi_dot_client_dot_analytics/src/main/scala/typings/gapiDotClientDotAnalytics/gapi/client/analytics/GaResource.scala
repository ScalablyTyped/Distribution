package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: Anon_Alt): Request[GaData]
}

object GaResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[GaData]): GaResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[GaResource]
  }
}

