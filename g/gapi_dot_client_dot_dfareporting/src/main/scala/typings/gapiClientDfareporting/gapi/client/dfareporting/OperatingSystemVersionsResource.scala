package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: Fields): Request[OperatingSystemVersion]
  /** Retrieves a list of operating system versions. */
  def list(request: Key): Request[OperatingSystemVersionsListResponse]
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: Fields => Request[OperatingSystemVersion],
    list: Key => Request[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
}

