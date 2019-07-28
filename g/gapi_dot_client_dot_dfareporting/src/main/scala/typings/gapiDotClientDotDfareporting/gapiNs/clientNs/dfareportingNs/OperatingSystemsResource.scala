package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltDartId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: Anon_AltDartId): Request[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: Anon_AltFieldsKey): Request[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: Anon_AltDartId => Request[OperatingSystem],
    list: Anon_AltFieldsKey => Request[OperatingSystemsListResponse]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

