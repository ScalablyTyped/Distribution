package typings.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.docxTemplatesStrings.errors
import typings.docxTemplates.docxTemplatesStrings.success
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.docxTemplates.typesMod.BufferStatus
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import typings.sax.mod.QualifiedAttribute
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.native
    
    var characters: js.UndefOr[Double] = js.native
    
    var company: js.UndefOr[String] = js.native
    
    var created: js.UndefOr[String] = js.native
    
    var creator: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var lastModifiedBy: js.UndefOr[String] = js.native
    
    var lastPrinted: js.UndefOr[String] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var modified: js.UndefOr[String] = js.native
    
    var pages: js.UndefOr[Double] = js.native
    
    var paragraphs: js.UndefOr[Double] = js.native
    
    var revision: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var words: js.UndefOr[Double] = js.native
  }
  object Category {
    
    @scala.inline
    def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCharacters(value: Double): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharactersUndefined: Self = StObject.set(x, "characters", js.undefined)
      
      @scala.inline
      def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
      
      @scala.inline
      def setLastPrinted(value: String): Self = StObject.set(x, "lastPrinted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPrintedUndefined: Self = StObject.set(x, "lastPrinted", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      @scala.inline
      def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      @scala.inline
      def setParagraphs(value: Double): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  @js.native
  trait CmdName extends StObject {
    
    var cmdName: js.UndefOr[String] = js.native
    
    var cmdRest: String = js.native
  }
  object CmdName {
    
    @scala.inline
    def apply(cmdRest: String): CmdName = {
      val __obj = js.Dynamic.literal(cmdRest = cmdRest.asInstanceOf[js.Any])
      __obj.asInstanceOf[CmdName]
    }
    
    @scala.inline
    implicit class CmdNameMutableBuilder[Self <: CmdName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmdName(value: String): Self = StObject.set(x, "cmdName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdNameUndefined: Self = StObject.set(x, "cmdName", js.undefined)
      
      @scala.inline
      def setCmdRest(value: String): Self = StObject.set(x, "cmdRest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ctx extends StObject {
    
    var ctx: js.Object = js.native
    
    var sandbox: js.Object = js.native
  }
  object Ctx {
    
    @scala.inline
    def apply(ctx: js.Object, sandbox: js.Object): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    @scala.inline
    implicit class CtxMutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: js.Object): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandbox(value: js.Object): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey extends /* key */ StringDictionary[QualifiedAttribute | String] {
    
    var ContentType: js.UndefOr[String] = js.native
    
    var Extension: js.UndefOr[String] = js.native
    
    var PartName: js.UndefOr[String] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
      
      @scala.inline
      def setPartName(value: String): Self = StObject.set(x, "PartName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartNameUndefined: Self = StObject.set(x, "PartName", js.undefined)
    }
  }
  
  @js.native
  trait Errors extends ReportOutput {
    
    var errors: js.Array[Error] = js.native
    
    var status: errors = js.native
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[Error], status: errors): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: errors): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Htmls extends ReportOutput {
    
    var htmls: typings.docxTemplates.typesMod.Htmls = js.native
    
    var images: Images = js.native
    
    var links: Links = js.native
    
    var report: Node = js.native
    
    var status: success = js.native
  }
  object Htmls {
    
    @scala.inline
    def apply(
      htmls: typings.docxTemplates.typesMod.Htmls,
      images: Images,
      links: Links,
      report: Node,
      status: success
    ): Htmls = {
      val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Htmls]
    }
    
    @scala.inline
    implicit class HtmlsMutableBuilder[Self <: Htmls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmls(value: typings.docxTemplates.typesMod.Htmls): Self = StObject.set(x, "htmls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReport(value: Node): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModifiedSandbox extends StObject {
    
    var modifiedSandbox: js.Object = js.native
    
    var result: js.Any = js.native
  }
  object ModifiedSandbox {
    
    @scala.inline
    def apply(modifiedSandbox: js.Object, result: js.Any): ModifiedSandbox = {
      val __obj = js.Dynamic.literal(modifiedSandbox = modifiedSandbox.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifiedSandbox]
    }
    
    @scala.inline
    implicit class ModifiedSandboxMutableBuilder[Self <: ModifiedSandbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifiedSandbox(value: js.Object): Self = StObject.set(x, "modifiedSandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wp extends StObject {
    
    @JSName("w:p")
    var wColonp: BufferStatus = js.native
    
    @JSName("w:tr")
    var wColontr: BufferStatus = js.native
  }
  object Wp {
    
    @scala.inline
    def apply(wColonp: BufferStatus, wColontr: BufferStatus): Wp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
      __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wp]
    }
    
    @scala.inline
    implicit class WpMutableBuilder[Self <: Wp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWColonp(value: BufferStatus): Self = StObject.set(x, "w:p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWColontr(value: BufferStatus): Self = StObject.set(x, "w:tr", value.asInstanceOf[js.Any])
    }
  }
}
