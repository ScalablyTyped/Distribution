package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentsResource extends js.Object {
  /** Lists segments to which the user has access. */
  def list(request: Key): Request[Segments]
}

object SegmentsResource {
  @scala.inline
  def apply(list: Key => Request[Segments]): SegmentsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SegmentsResource]
  }
}

