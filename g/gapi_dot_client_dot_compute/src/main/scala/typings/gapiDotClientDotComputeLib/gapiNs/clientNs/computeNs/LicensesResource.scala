package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyLicense): gapiDotClientLib.gapiNs.clientNs.Request[License]
}

object LicensesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotComputeLib.Anon_AltFieldsKeyLicense => gapiDotClientLib.gapiNs.clientNs.Request[License]
  ): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[LicensesResource]
  }
}

