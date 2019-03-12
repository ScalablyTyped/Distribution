package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DownloadResponse]
}

object SdfResource {
  @scala.inline
  def apply(
    download: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[DownloadResponse]
  ): SdfResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
  
    __obj.asInstanceOf[SdfResource]
  }
}

