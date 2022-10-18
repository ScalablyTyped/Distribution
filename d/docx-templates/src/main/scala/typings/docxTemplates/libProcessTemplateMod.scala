package typings.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.CmdName
import typings.docxTemplates.libTypesMod.Context
import typings.docxTemplates.libTypesMod.CreateReportOptions
import typings.docxTemplates.libTypesMod.Images
import typings.docxTemplates.libTypesMod.Links
import typings.docxTemplates.libTypesMod.Node
import typings.docxTemplates.libTypesMod.ReportData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessTemplateMod {
  
  @JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractQuery")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def findHighestImgId(mainDoc: Node): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findHighestImgId")(mainDoc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getCommand(command: String, shorthands: StringDictionary[String], fixSmartQuotes: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommand")(command.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], fixSmartQuotes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def newContext(options: CreateReportOptions): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("newContext")(options.asInstanceOf[js.Any]).asInstanceOf[Context]
  inline def newContext(options: CreateReportOptions, imageId: Double): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("newContext")(options.asInstanceOf[js.Any], imageId.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  inline def produceJsReport(data: Unit, template: Node, ctx: Context): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("produceJsReport")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  inline def produceJsReport(data: ReportData, template: Node, ctx: Context): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("produceJsReport")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  
  inline def splitCommand(cmd: String): CmdName = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCommand")(cmd.asInstanceOf[js.Any]).asInstanceOf[CmdName]
  
  inline def walkTemplate(data: Unit, template: Node, ctx: Context, processor: CommandProcessor): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTemplate")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  inline def walkTemplate(data: ReportData, template: Node, ctx: Context, processor: CommandProcessor): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTemplate")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  
  type CommandProcessor = js.Function3[
    /* data */ js.UndefOr[ReportData], 
    /* node */ Node, 
    /* ctx */ Context, 
    js.Promise[js.UndefOr[String | js.Error]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.anon.Htmls
    - typings.docxTemplates.anon.Errors
  */
  trait ReportOutput extends StObject
  object ReportOutput {
    
    inline def Errors(errors: js.Array[js.Error]): typings.docxTemplates.anon.Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = "errors")
      __obj.asInstanceOf[typings.docxTemplates.anon.Errors]
    }
    
    inline def Htmls(htmls: typings.docxTemplates.libTypesMod.Htmls, images: Images, links: Links, report: Node): typings.docxTemplates.anon.Htmls = {
      val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = "success")
      __obj.asInstanceOf[typings.docxTemplates.anon.Htmls]
    }
  }
}
