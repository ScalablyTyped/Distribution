package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presentation extends js.Object {
  var layouts: js.UndefOr[js.Array[Page]] = js.native
  var locale: js.UndefOr[String] = js.native
  var masters: js.UndefOr[js.Array[Page]] = js.native
  var notesMaster: js.UndefOr[Page] = js.native
  var pageSize: js.UndefOr[Size] = js.native
  var presentationId: js.UndefOr[String] = js.native
  var revisionId: js.UndefOr[String] = js.native
  var slides: js.UndefOr[js.Array[Page]] = js.native
  var title: js.UndefOr[String] = js.native
}

object Presentation {
  @scala.inline
  def apply(): Presentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presentation]
  }
  @scala.inline
  implicit class PresentationOps[Self <: Presentation] (val x: Self) extends AnyVal {
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
    def setLayoutsVarargs(value: Page*): Self = this.set("layouts", js.Array(value :_*))
    @scala.inline
    def setLayouts(value: js.Array[Page]): Self = this.set("layouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayouts: Self = this.set("layouts", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMastersVarargs(value: Page*): Self = this.set("masters", js.Array(value :_*))
    @scala.inline
    def setMasters(value: js.Array[Page]): Self = this.set("masters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasters: Self = this.set("masters", js.undefined)
    @scala.inline
    def setNotesMaster(value: Page): Self = this.set("notesMaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotesMaster: Self = this.set("notesMaster", js.undefined)
    @scala.inline
    def setPageSize(value: Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPresentationId(value: String): Self = this.set("presentationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationId: Self = this.set("presentationId", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setSlidesVarargs(value: Page*): Self = this.set("slides", js.Array(value :_*))
    @scala.inline
    def setSlides(value: js.Array[Page]): Self = this.set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

