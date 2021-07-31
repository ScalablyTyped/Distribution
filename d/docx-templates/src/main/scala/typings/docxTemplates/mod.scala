package typings.docxTemplates

import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.docxTemplates.typesMod.CommandSummary
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.UserOptions
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docx-templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  @scala.inline
  def default(options: UserOptions): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
  
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  @scala.inline
  def createReport(options: UserOptions): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @scala.inline
  def createReport_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @scala.inline
  def createReport_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @scala.inline
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @scala.inline
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  @scala.inline
  def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  @scala.inline
  def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
}
