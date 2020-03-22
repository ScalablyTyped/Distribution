package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonDartId
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: AnonDartId): Request_[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: AnonKey): Request_[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: AnonDartId => Request_[OperatingSystem],
    list: AnonKey => Request_[OperatingSystemsListResponse]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

