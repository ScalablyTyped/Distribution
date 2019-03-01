package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltDartId): gapiDotClientLib.gapiNs.clientNs.Request[OperatingSystem]
  /** Retrieves a list of operating systems. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[OperatingSystemsListResponse]
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltDartId, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperatingSystem]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperatingSystemsListResponse]
    ]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[OperatingSystemsResource]
  }
}

