package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: gapiDotClientDotResourceviewsLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: gapiDotClientDotResourceviewsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

