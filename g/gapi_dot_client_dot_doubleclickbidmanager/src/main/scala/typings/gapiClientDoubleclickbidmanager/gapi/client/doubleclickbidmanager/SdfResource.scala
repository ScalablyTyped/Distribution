package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SdfResource extends js.Object {
  /** Retrieves entities in SDF format. */
  def download(request: Alt): Request[DownloadResponse] = js.native
}

object SdfResource {
  @scala.inline
  def apply(download: Alt => Request[DownloadResponse]): SdfResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
    __obj.asInstanceOf[SdfResource]
  }
  @scala.inline
  implicit class SdfResourceOps[Self <: SdfResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownload(value: Alt => Request[DownloadResponse]): Self = this.set("download", js.Any.fromFunction1(value))
  }
  
}

