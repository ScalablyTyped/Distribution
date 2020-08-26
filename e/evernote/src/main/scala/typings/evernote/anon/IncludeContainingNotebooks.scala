package typings.evernote.anon

import typings.evernote.mod.Types.RelatedContentType
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeContainingNotebooks extends js.Object {
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  var maxExperts: js.UndefOr[Double] = js.native
  var maxNotebooks: js.UndefOr[Double] = js.native
  var maxNotes: js.UndefOr[Double] = js.native
  var maxRelatedContent: js.UndefOr[Double] = js.native
  var maxTags: js.UndefOr[Double] = js.native
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}

object IncludeContainingNotebooks {
  @scala.inline
  def apply(): IncludeContainingNotebooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeContainingNotebooks]
  }
  @scala.inline
  implicit class IncludeContainingNotebooksOps[Self <: IncludeContainingNotebooks] (val x: Self) extends AnyVal {
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
    def setIncludeContainingNotebooks(value: Boolean): Self = this.set("includeContainingNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeContainingNotebooks: Self = this.set("includeContainingNotebooks", js.undefined)
    @scala.inline
    def setIncludeDebugInfo(value: Boolean): Self = this.set("includeDebugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDebugInfo: Self = this.set("includeDebugInfo", js.undefined)
    @scala.inline
    def setMaxExperts(value: Double): Self = this.set("maxExperts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxExperts: Self = this.set("maxExperts", js.undefined)
    @scala.inline
    def setMaxNotebooks(value: Double): Self = this.set("maxNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNotebooks: Self = this.set("maxNotebooks", js.undefined)
    @scala.inline
    def setMaxNotes(value: Double): Self = this.set("maxNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNotes: Self = this.set("maxNotes", js.undefined)
    @scala.inline
    def setMaxRelatedContent(value: Double): Self = this.set("maxRelatedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRelatedContent: Self = this.set("maxRelatedContent", js.undefined)
    @scala.inline
    def setMaxTags(value: Double): Self = this.set("maxTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTags: Self = this.set("maxTags", js.undefined)
    @scala.inline
    def setRelatedContentTypes(value: Set[RelatedContentType]): Self = this.set("relatedContentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedContentTypes: Self = this.set("relatedContentTypes", js.undefined)
    @scala.inline
    def setWritableNotebooksOnly(value: Boolean): Self = this.set("writableNotebooksOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableNotebooksOnly: Self = this.set("writableNotebooksOnly", js.undefined)
  }
  
}

