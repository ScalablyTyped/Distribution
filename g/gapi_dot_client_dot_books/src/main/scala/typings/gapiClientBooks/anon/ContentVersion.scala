package typings.gapiClientBooks.anon

import typings.gapiClientBooks.gapi.client.books.BooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentVersion extends js.Object {
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.native
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.native
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.native
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.native
}

object ContentVersion {
  @scala.inline
  def apply(): ContentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentVersion]
  }
  @scala.inline
  implicit class ContentVersionOps[Self <: ContentVersion] (val x: Self) extends AnyVal {
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
    def setCfiRange(value: BooksAnnotationsRange): Self = this.set("cfiRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCfiRange: Self = this.set("cfiRange", js.undefined)
    @scala.inline
    def setContentVersion(value: String): Self = this.set("contentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersion: Self = this.set("contentVersion", js.undefined)
    @scala.inline
    def setGbImageRange(value: BooksAnnotationsRange): Self = this.set("gbImageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGbImageRange: Self = this.set("gbImageRange", js.undefined)
    @scala.inline
    def setGbTextRange(value: BooksAnnotationsRange): Self = this.set("gbTextRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGbTextRange: Self = this.set("gbTextRange", js.undefined)
  }
  
}

