package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  /** Retrieves a list of regions. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RegionsListResponse]
}

object RegionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[RegionsListResponse]
    ]
  ): RegionsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[RegionsResource]
  }
}

