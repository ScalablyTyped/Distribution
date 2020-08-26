package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadAccesses extends js.Object {
  /** A list of download access responses. */
  var downloadAccessList: js.UndefOr[js.Array[DownloadAccessRestriction]] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}

object DownloadAccesses {
  @scala.inline
  def apply(): DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadAccesses]
  }
  @scala.inline
  implicit class DownloadAccessesOps[Self <: DownloadAccesses] (val x: Self) extends AnyVal {
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
    def setDownloadAccessListVarargs(value: DownloadAccessRestriction*): Self = this.set("downloadAccessList", js.Array(value :_*))
    @scala.inline
    def setDownloadAccessList(value: js.Array[DownloadAccessRestriction]): Self = this.set("downloadAccessList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadAccessList: Self = this.set("downloadAccessList", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

