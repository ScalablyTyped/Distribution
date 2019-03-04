package typings
package gapiDotClientDotAdexperiencereportLib.gapiNs.clientNs.adexperiencereportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResource extends js.Object {
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: gapiDotClientDotAdexperiencereportLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ViolatingSitesResponse]
}

object ViolatingSitesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexperiencereportLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ViolatingSitesResponse]
    ]
  ): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[ViolatingSitesResource]
  }
}

