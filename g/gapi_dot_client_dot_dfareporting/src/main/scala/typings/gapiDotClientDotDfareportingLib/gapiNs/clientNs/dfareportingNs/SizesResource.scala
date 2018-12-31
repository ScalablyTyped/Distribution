package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizesResource extends js.Object {
  /** Gets one size by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Size]
  /** Inserts a new size. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Size]
  /** Retrieves a list of sizes, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_IabStandard): gapiDotClientLib.gapiNs.clientNs.Request[SizesListResponse]
}

