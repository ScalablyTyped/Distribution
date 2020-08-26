package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotImage extends js.Object {
  /** The height of the image. */
  var height: js.UndefOr[Double] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshotImage. */
  var kind: js.UndefOr[String] = js.native
  /** The MIME type of the image. */
  var mime_type: js.UndefOr[String] = js.native
  /** The URL of the image. This URL may be invalidated at any time and should not be cached. */
  var url: js.UndefOr[String] = js.native
  /** The width of the image. */
  var width: js.UndefOr[Double] = js.native
}

object SnapshotImage {
  @scala.inline
  def apply(): SnapshotImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotImage]
  }
  @scala.inline
  implicit class SnapshotImageOps[Self <: SnapshotImage] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime_type: Self = this.set("mime_type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

