package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: Anon_AltFields): Request[OperatingSystemVersion]
  /** Retrieves a list of operating system versions. */
  def list(request: Anon_AltFieldsKey): Request[OperatingSystemVersionsListResponse]
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[OperatingSystemVersion],
    list: Anon_AltFieldsKey => Request[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
}

