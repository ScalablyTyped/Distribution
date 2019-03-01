package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsResource extends js.Object {
  /** List all available database flags for Google Cloud SQL instances. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltDatabaseVersion): gapiDotClientLib.gapiNs.clientNs.Request[FlagsListResponse]
}

object FlagsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltDatabaseVersion, 
      gapiDotClientLib.gapiNs.clientNs.Request[FlagsListResponse]
    ]
  ): FlagsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[FlagsResource]
  }
}

