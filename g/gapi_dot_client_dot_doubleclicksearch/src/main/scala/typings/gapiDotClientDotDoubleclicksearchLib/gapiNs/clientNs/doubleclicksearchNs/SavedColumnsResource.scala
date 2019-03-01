package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnsResource extends js.Object {
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserIdAgencyId): gapiDotClientLib.gapiNs.clientNs.Request[SavedColumnList]
}

object SavedColumnsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserIdAgencyId, 
      gapiDotClientLib.gapiNs.clientNs.Request[SavedColumnList]
    ]
  ): SavedColumnsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[SavedColumnsResource]
  }
}

