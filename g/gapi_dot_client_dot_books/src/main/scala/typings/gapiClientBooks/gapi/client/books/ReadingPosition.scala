package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadingPosition extends js.Object {
  /** Position in an EPUB as a CFI. */
  var epubCfiPosition: js.UndefOr[String] = js.native
  /** Position in a volume for image-based content. */
  var gbImagePosition: js.UndefOr[String] = js.native
  /** Position in a volume for text-based content. */
  var gbTextPosition: js.UndefOr[String] = js.native
  /** Resource type for a reading position. */
  var kind: js.UndefOr[String] = js.native
  /** Position in a PDF file. */
  var pdfPosition: js.UndefOr[String] = js.native
  /** Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.native
  /** Volume id associated with this reading position. */
  var volumeId: js.UndefOr[String] = js.native
}

object ReadingPosition {
  @scala.inline
  def apply(): ReadingPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingPosition]
  }
  @scala.inline
  implicit class ReadingPositionOps[Self <: ReadingPosition] (val x: Self) extends AnyVal {
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
    def setEpubCfiPosition(value: String): Self = this.set("epubCfiPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpubCfiPosition: Self = this.set("epubCfiPosition", js.undefined)
    @scala.inline
    def setGbImagePosition(value: String): Self = this.set("gbImagePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGbImagePosition: Self = this.set("gbImagePosition", js.undefined)
    @scala.inline
    def setGbTextPosition(value: String): Self = this.set("gbTextPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGbTextPosition: Self = this.set("gbTextPosition", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPdfPosition(value: String): Self = this.set("pdfPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfPosition: Self = this.set("pdfPosition", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
  
}

