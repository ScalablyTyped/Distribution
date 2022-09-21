package typings.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.docxTemplatesStrings.errors
import typings.docxTemplates.docxTemplatesStrings.success
import typings.docxTemplates.processTemplateMod.ReportOutput
import typings.docxTemplates.typesMod.BufferStatus
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.NonTextNode
import typings.jszip.mod.JSZip
import typings.sax.mod.QualifiedAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var characters: js.UndefOr[Double] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var created: js.UndefOr[String] = js.undefined
    
    var creator: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var lastModifiedBy: js.UndefOr[String] = js.undefined
    
    var lastPrinted: js.UndefOr[String] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var modified: js.UndefOr[String] = js.undefined
    
    var pages: js.UndefOr[Double] = js.undefined
    
    var paragraphs: js.UndefOr[Double] = js.undefined
    
    var revision: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var words: js.UndefOr[Double] = js.undefined
  }
  object Category {
    
    inline def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCharacters(value: Double): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setCharactersUndefined: Self = StObject.set(x, "characters", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
      
      inline def setLastPrinted(value: String): Self = StObject.set(x, "lastPrinted", value.asInstanceOf[js.Any])
      
      inline def setLastPrintedUndefined: Self = StObject.set(x, "lastPrinted", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setParagraphs(value: Double): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
      
      inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  trait CmdName extends StObject {
    
    var cmdName: js.UndefOr[String] = js.undefined
    
    var cmdRest: String
  }
  object CmdName {
    
    inline def apply(cmdRest: String): CmdName = {
      val __obj = js.Dynamic.literal(cmdRest = cmdRest.asInstanceOf[js.Any])
      __obj.asInstanceOf[CmdName]
    }
    
    extension [Self <: CmdName](x: Self) {
      
      inline def setCmdName(value: String): Self = StObject.set(x, "cmdName", value.asInstanceOf[js.Any])
      
      inline def setCmdNameUndefined: Self = StObject.set(x, "cmdName", js.undefined)
      
      inline def setCmdRest(value: String): Self = StObject.set(x, "cmdRest", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentType
    extends StObject
       with /* key */ StringDictionary[QualifiedAttribute | String] {
    
    var ContentType: js.UndefOr[String] = js.undefined
    
    var Extension: js.UndefOr[String] = js.undefined
    
    var PartName: js.UndefOr[String] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
      
      inline def setPartName(value: String): Self = StObject.set(x, "PartName", value.asInstanceOf[js.Any])
      
      inline def setPartNameUndefined: Self = StObject.set(x, "PartName", js.undefined)
    }
  }
  
  trait ContentTypes extends StObject {
    
    var contentTypes: NonTextNode
    
    var jsTemplate: Node
    
    var mainDocument: String
    
    def zip(): JSZip
    @JSName("zip")
    var zip_Original: JSZip
  }
  object ContentTypes {
    
    inline def apply(contentTypes: NonTextNode, jsTemplate: Node, mainDocument: String, zip: JSZip): ContentTypes = {
      val __obj = js.Dynamic.literal(contentTypes = contentTypes.asInstanceOf[js.Any], jsTemplate = jsTemplate.asInstanceOf[js.Any], mainDocument = mainDocument.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTypes]
    }
    
    extension [Self <: ContentTypes](x: Self) {
      
      inline def setContentTypes(value: NonTextNode): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
      
      inline def setJsTemplate(value: Node): Self = StObject.set(x, "jsTemplate", value.asInstanceOf[js.Any])
      
      inline def setMainDocument(value: String): Self = StObject.set(x, "mainDocument", value.asInstanceOf[js.Any])
      
      inline def setZip(value: JSZip): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ctx extends StObject {
    
    var ctx: js.Object
    
    var sandbox: js.Object
  }
  object Ctx {
    
    inline def apply(ctx: js.Object, sandbox: js.Object): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    extension [Self <: Ctx](x: Self) {
      
      inline def setCtx(value: js.Object): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setSandbox(value: js.Object): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[typings.docxTemplates.bundledMod.QualifiedAttribute | String] {
    
    var ContentType: js.UndefOr[String] = js.undefined
    
    var Extension: js.UndefOr[String] = js.undefined
    
    var PartName: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
      
      inline def setPartName(value: String): Self = StObject.set(x, "PartName", value.asInstanceOf[js.Any])
      
      inline def setPartNameUndefined: Self = StObject.set(x, "PartName", js.undefined)
    }
  }
  
  trait Errors
    extends StObject
       with ReportOutput {
    
    var errors: js.Array[js.Error]
    
    var status: errors
  }
  object Errors {
    
    inline def apply(errors: js.Array[js.Error]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = "errors")
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setStatus(value: errors): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Htmls
    extends StObject
       with ReportOutput {
    
    var htmls: typings.docxTemplates.typesMod.Htmls
    
    var images: Images
    
    var links: Links
    
    var report: Node
    
    var status: success
  }
  object Htmls {
    
    inline def apply(htmls: typings.docxTemplates.typesMod.Htmls, images: Images, links: Links, report: Node): Htmls = {
      val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = "success")
      __obj.asInstanceOf[Htmls]
    }
    
    extension [Self <: Htmls](x: Self) {
      
      inline def setHtmls(value: typings.docxTemplates.typesMod.Htmls): Self = StObject.set(x, "htmls", value.asInstanceOf[js.Any])
      
      inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setReport(value: Node): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModifiedSandbox extends StObject {
    
    var modifiedSandbox: js.Object
    
    var result: Any
  }
  object ModifiedSandbox {
    
    inline def apply(modifiedSandbox: js.Object, result: Any): ModifiedSandbox = {
      val __obj = js.Dynamic.literal(modifiedSandbox = modifiedSandbox.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifiedSandbox]
    }
    
    extension [Self <: ModifiedSandbox](x: Self) {
      
      inline def setModifiedSandbox(value: js.Object): Self = StObject.set(x, "modifiedSandbox", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wp extends StObject {
    
    @JSName("w:p")
    var wColonp: BufferStatus
    
    @JSName("w:tr")
    var wColontr: BufferStatus
  }
  object Wp {
    
    inline def apply(wColonp: BufferStatus, wColontr: BufferStatus): Wp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("w:p")(wColonp.asInstanceOf[js.Any])
      __obj.updateDynamic("w:tr")(wColontr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wp]
    }
    
    extension [Self <: Wp](x: Self) {
      
      inline def setWColonp(value: BufferStatus): Self = StObject.set(x, "w:p", value.asInstanceOf[js.Any])
      
      inline def setWColontr(value: BufferStatus): Self = StObject.set(x, "w:tr", value.asInstanceOf[js.Any])
    }
  }
}
