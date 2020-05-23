package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: Alt): Request[DownloadResponse]
}

object SdfResource {
  @scala.inline
  def apply(download: Alt => Request[DownloadResponse]): SdfResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
    __obj.asInstanceOf[SdfResource]
  }
}

