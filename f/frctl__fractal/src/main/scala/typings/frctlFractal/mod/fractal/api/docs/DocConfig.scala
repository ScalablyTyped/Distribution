package typings.frctlFractal.mod.fractal.api.docs

import org.scalablytyped.runtime.StringDictionary
import typings.frctlFractal.mod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocConfig extends js.Object {
  
  var default: js.UndefOr[DocDefaultConfig] = js.native
  
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.native
  
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.native
  
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.native
  
  var ext: js.UndefOr[String] = js.native
  
  var indexLabel: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var markdown: js.UndefOr[Boolean | DocMarkdownConfig] = js.native
  
  @JSName("markdown.breaks")
  var markdownDotbreaks: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.gfm")
  var markdownDotgfm: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.pedantic")
  var markdownDotpedantic: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.sanitize")
  var markdownDotsanitize: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.smartLists")
  var markdownDotsmartLists: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.smartypants")
  var markdownDotsmartypants: js.UndefOr[Boolean] = js.native
  
  @JSName("markdown.tables")
  var markdownDottables: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DocConfig {
  
  @scala.inline
  def apply(): DocConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocConfig]
  }
  
  @scala.inline
  implicit class DocConfigOps[Self <: DocConfig] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: DocDefaultConfig): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultDotcontext(value: js.Any): Self = this.set("default.context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDotcontext: Self = this.set("default.context", js.undefined)
    
    @scala.inline
    def setDefaultDotprefix(value: String): Self = this.set("default.prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDotprefix: Self = this.set("default.prefix", js.undefined)
    
    @scala.inline
    def setDefaultDotstatus(value: String): Self = this.set("default.status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDotstatus: Self = this.set("default.status", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setIndexLabel(value: String): Self = this.set("indexLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLabel: Self = this.set("indexLabel", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMarkdown(value: Boolean | DocMarkdownConfig): Self = this.set("markdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdown: Self = this.set("markdown", js.undefined)
    
    @scala.inline
    def setMarkdownDotbreaks(value: Boolean): Self = this.set("markdown.breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotbreaks: Self = this.set("markdown.breaks", js.undefined)
    
    @scala.inline
    def setMarkdownDotgfm(value: Boolean): Self = this.set("markdown.gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotgfm: Self = this.set("markdown.gfm", js.undefined)
    
    @scala.inline
    def setMarkdownDotpedantic(value: Boolean): Self = this.set("markdown.pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotpedantic: Self = this.set("markdown.pedantic", js.undefined)
    
    @scala.inline
    def setMarkdownDotsanitize(value: Boolean): Self = this.set("markdown.sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotsanitize: Self = this.set("markdown.sanitize", js.undefined)
    
    @scala.inline
    def setMarkdownDotsmartLists(value: Boolean): Self = this.set("markdown.smartLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotsmartLists: Self = this.set("markdown.smartLists", js.undefined)
    
    @scala.inline
    def setMarkdownDotsmartypants(value: Boolean): Self = this.set("markdown.smartypants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDotsmartypants: Self = this.set("markdown.smartypants", js.undefined)
    
    @scala.inline
    def setMarkdownDottables(value: Boolean): Self = this.set("markdown.tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkdownDottables: Self = this.set("markdown.tables", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStatuses(value: StringDictionary[StatusInfo]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
