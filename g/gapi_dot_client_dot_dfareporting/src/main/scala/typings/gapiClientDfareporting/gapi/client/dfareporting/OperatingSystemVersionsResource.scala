package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: AnonAltFields): Request_[OperatingSystemVersion]
  /** Retrieves a list of operating system versions. */
  def list(request: AnonAltFieldsKey): Request_[OperatingSystemVersionsListResponse]
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[OperatingSystemVersion],
    list: AnonAltFieldsKey => Request_[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
}

