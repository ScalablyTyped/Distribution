package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lang extends js.Object {
  var lang: js.UndefOr[String] = js.native
  var previewImageUrl: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[String] = js.native
  var snippetUrl: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Lang {
  @scala.inline
  def apply(): Lang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lang]
  }
  @scala.inline
  implicit class LangOps[Self <: Lang] (val x: Self) extends AnyVal {
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setPreviewImageUrl(value: String): Self = this.set("previewImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewImageUrl: Self = this.set("previewImageUrl", js.undefined)
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setSnippetUrl(value: String): Self = this.set("snippetUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippetUrl: Self = this.set("snippetUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

