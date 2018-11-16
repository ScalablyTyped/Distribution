package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: gapiDotClientDotMirrorLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[LocationsListResponse]
}

