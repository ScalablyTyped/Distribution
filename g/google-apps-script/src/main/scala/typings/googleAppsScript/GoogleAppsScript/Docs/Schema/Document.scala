package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var body: js.UndefOr[Body] = js.native
  var documentId: js.UndefOr[String] = js.native
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  var footers: js.UndefOr[js.Object] = js.native
  var footnotes: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var inlineObjects: js.UndefOr[js.Object] = js.native
  var lists: js.UndefOr[js.Object] = js.native
  var namedRanges: js.UndefOr[js.Object] = js.native
  var namedStyles: js.UndefOr[NamedStyles] = js.native
  var positionedObjects: js.UndefOr[js.Object] = js.native
  var revisionId: js.UndefOr[String] = js.native
  var suggestedDocumentStyleChanges: js.UndefOr[js.Object] = js.native
  var suggestedNamedStylesChanges: js.UndefOr[js.Object] = js.native
  var suggestionsViewMode: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    @scala.inline
    def setDocumentStyle(value: DocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    @scala.inline
    def setFooters(value: js.Object): Self = this.set("footers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooters: Self = this.set("footers", js.undefined)
    @scala.inline
    def setFootnotes(value: js.Object): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnotes: Self = this.set("footnotes", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setInlineObjects(value: js.Object): Self = this.set("inlineObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjects: Self = this.set("inlineObjects", js.undefined)
    @scala.inline
    def setLists(value: js.Object): Self = this.set("lists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    @scala.inline
    def setNamedRanges(value: js.Object): Self = this.set("namedRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedRanges: Self = this.set("namedRanges", js.undefined)
    @scala.inline
    def setNamedStyles(value: NamedStyles): Self = this.set("namedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStyles: Self = this.set("namedStyles", js.undefined)
    @scala.inline
    def setPositionedObjects(value: js.Object): Self = this.set("positionedObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionedObjects: Self = this.set("positionedObjects", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setSuggestedDocumentStyleChanges(value: js.Object): Self = this.set("suggestedDocumentStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDocumentStyleChanges: Self = this.set("suggestedDocumentStyleChanges", js.undefined)
    @scala.inline
    def setSuggestedNamedStylesChanges(value: js.Object): Self = this.set("suggestedNamedStylesChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedNamedStylesChanges: Self = this.set("suggestedNamedStylesChanges", js.undefined)
    @scala.inline
    def setSuggestionsViewMode(value: String): Self = this.set("suggestionsViewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsViewMode: Self = this.set("suggestionsViewMode", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

