package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaResource extends js.Object {
  /** Returns Analytics data for a view (profile). */
  def get(request: AnonAlt): Request_[GaData]
}

object GaResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[GaData]): GaResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[GaResource]
  }
}

