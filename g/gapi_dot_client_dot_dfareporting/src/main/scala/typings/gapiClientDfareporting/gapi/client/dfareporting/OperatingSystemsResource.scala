package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.DartId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: DartId): Request[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: Key): Request[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(get: DartId => Request[OperatingSystem], list: Key => Request[OperatingSystemsListResponse]): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

