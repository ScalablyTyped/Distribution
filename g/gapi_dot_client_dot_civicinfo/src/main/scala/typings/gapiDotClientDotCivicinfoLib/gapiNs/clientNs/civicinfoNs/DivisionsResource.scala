package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivisionsResource extends js.Object {
  /** Searches for political divisions by their natural name or OCD ID. */
  def search(request: gapiDotClientDotCivicinfoLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DivisionSearchResponse]
}

object DivisionsResource {
  @scala.inline
  def apply(
    search: js.Function1[
      gapiDotClientDotCivicinfoLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DivisionSearchResponse]
    ]
  ): DivisionsResource = {
    val __obj = js.Dynamic.literal(search = search)
  
    __obj.asInstanceOf[DivisionsResource]
  }
}

