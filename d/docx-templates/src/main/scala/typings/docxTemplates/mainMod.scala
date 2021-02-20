package typings.docxTemplates

import typings.docxTemplates.anon.Category
import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.docxTemplates.typesMod.CommandSummary
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.NonTextNode
import typings.docxTemplates.typesMod.UserOptions
import typings.jszip.mod.JSZip
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
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
  @JSImport("docx-templates/lib/main", JSImport.Default)
  @js.native
  def default(options: UserOptions): js.Promise[Uint8Array] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates/lib/main", JSImport.Default)
  @js.native
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSImport("docx-templates/lib/main", JSImport.Default)
  @js.native
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
  
  @JSImport("docx-templates/lib/main", "getMainDoc")
  @js.native
  def getMainDoc(contentTypes: NonTextNode): String = js.native
  
  @JSImport("docx-templates/lib/main", "getMetadata")
  @js.native
  def getMetadata(template: Buffer): js.Promise[Category] = js.native
  
  @JSImport("docx-templates/lib/main", "listCommands")
  @js.native
  def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = js.native
  @JSImport("docx-templates/lib/main", "listCommands")
  @js.native
  def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = js.native
  @JSImport("docx-templates/lib/main", "listCommands")
  @js.native
  def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = js.native
  
  @JSImport("docx-templates/lib/main", "readContentTypes")
  @js.native
  def readContentTypes(zip: JSZip): js.Promise[NonTextNode] = js.native
}
