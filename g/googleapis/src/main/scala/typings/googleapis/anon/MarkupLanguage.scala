package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkupLanguage extends js.Object {
  var markupLanguage: js.UndefOr[String] = js.native
  var scriptingLanguage: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object MarkupLanguage {
  @scala.inline
  def apply(): MarkupLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupLanguage]
  }
  @scala.inline
  implicit class MarkupLanguageOps[Self <: MarkupLanguage] (val x: Self) extends AnyVal {
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
    def setMarkupLanguage(value: String): Self = this.set("markupLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkupLanguage: Self = this.set("markupLanguage", js.undefined)
    @scala.inline
    def setScriptingLanguage(value: String): Self = this.set("scriptingLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptingLanguage: Self = this.set("scriptingLanguage", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

