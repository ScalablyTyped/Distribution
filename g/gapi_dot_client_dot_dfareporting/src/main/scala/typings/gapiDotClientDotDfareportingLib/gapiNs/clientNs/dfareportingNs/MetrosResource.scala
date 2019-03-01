package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosResource extends js.Object {
  /** Retrieves a list of metros. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[MetrosListResponse]
}

object MetrosResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[MetrosListResponse]
    ]
  ): MetrosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MetrosResource]
  }
}

