package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionResource extends js.Object {
  /** Retrieves a list of conversions from a DoubleClick Search engine account. */
  def get(request: gapiDotClientDotDoubleclicksearchLib.Anon_EndDate): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Inserts a batch of new conversions into DoubleClick Search. */
  def insert(request: gapiDotClientDotDoubleclicksearchLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDoubleclicksearchLib.Anon_EndDateRowCount): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates a batch of conversions in DoubleClick Search. */
  def update(request: gapiDotClientDotDoubleclicksearchLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ConversionList]
  /** Updates the availabilities of a batch of floodlight activities in DoubleClick Search. */
  def updateAvailability(request: gapiDotClientDotDoubleclicksearchLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[UpdateAvailabilityResponse]
}

