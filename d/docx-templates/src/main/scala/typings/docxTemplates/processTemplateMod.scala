package typings.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.CmdName
import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.CreateReportOptions
import typings.docxTemplates.typesMod.Images
import typings.docxTemplates.typesMod.Links
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.ReportData
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processTemplateMod {
  
  @JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractQuery")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getCommand(command: String, shorthands: StringDictionary[String], fixSmartQuotes: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommand")(command.asInstanceOf[js.Any], shorthands.asInstanceOf[js.Any], fixSmartQuotes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def produceJsReport(data: Unit, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("produceJsReport")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  inline def produceJsReport(data: ReportData, template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("produceJsReport")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  
  inline def splitCommand(cmd: String): CmdName = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCommand")(cmd.asInstanceOf[js.Any]).asInstanceOf[CmdName]
  
  inline def walkTemplate(data: Unit, template: Node, options: CreateReportOptions, processor: CommandProcessor): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTemplate")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  inline def walkTemplate(data: ReportData, template: Node, options: CreateReportOptions, processor: CommandProcessor): js.Promise[ReportOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkTemplate")(data.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReportOutput]]
  
  type CommandProcessor = js.Function3[
    /* data */ js.UndefOr[ReportData], 
    /* node */ Node, 
    /* ctx */ Context, 
    js.Promise[js.UndefOr[String | Error]]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.anon.Htmls
    - typings.docxTemplates.anon.Errors
  */
  trait ReportOutput extends StObject
  object ReportOutput {
    
    inline def Errors(errors: js.Array[Error]): typings.docxTemplates.anon.Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = "errors")
      __obj.asInstanceOf[typings.docxTemplates.anon.Errors]
    }
    
    inline def Htmls(htmls: typings.docxTemplates.typesMod.Htmls, images: Images, links: Links, report: Node): typings.docxTemplates.anon.Htmls = {
      val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = "success")
      __obj.asInstanceOf[typings.docxTemplates.anon.Htmls]
    }
  }
}
