package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltDartId
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: AnonAltDartId): Request_[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: AnonAltFieldsKey): Request_[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: AnonAltDartId => Request_[OperatingSystem],
    list: AnonAltFieldsKey => Request_[OperatingSystemsListResponse]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

