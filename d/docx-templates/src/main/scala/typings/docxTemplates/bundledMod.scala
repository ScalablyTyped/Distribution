package typings.docxTemplates

import typings.docxTemplates.anon.Category
import typings.docxTemplates.anon.Ctx
import typings.docxTemplates.anon.Dictkey
import typings.docxTemplates.anon.ModifiedSandbox
import typings.docxTemplates.docxTemplatesBooleans.`false`
import typings.docxTemplates.docxTemplatesBooleans.`true`
import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.std.ArrayBufferLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bundledMod {
  
  @JSImport("docx-templates/lib/bundled", JSImport.Namespace)
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
  inline def default(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  @JSImport("docx-templates/lib/bundled", "CommandExecutionError")
  @js.native
  open class CommandExecutionError protected ()
    extends StObject
       with Error {
    def this(err: js.Error, command: String) = this()
    
    var command: String = js.native
    
    var err: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/bundled", "CommandSyntaxError")
  @js.native
  open class CommandSyntaxError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/bundled", "ImageError")
  @js.native
  open class ImageError protected () extends CommandExecutionError {
    def this(err: js.Error, command: String) = this()
  }
  
  @JSImport("docx-templates/lib/bundled", "InternalError")
  @js.native
  open class InternalError protected ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/bundled", "InvalidCommandError")
  @js.native
  open class InvalidCommandError protected ()
    extends StObject
       with Error {
    def this(msg: String, command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Thrown when `rejectNullish` is set to `true` and a command returns `null` or `undefined`.
    */
  @JSImport("docx-templates/lib/bundled", "NullishCommandResultError")
  @js.native
  open class NullishCommandResultError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Thrown when the result of an `INS` command is an `Object`. This ensures you don't accidentally put `'[object Object]'` in your report.
    */
  @JSImport("docx-templates/lib/bundled", "ObjectCommandResultError")
  @js.native
  open class ObjectCommandResultError protected ()
    extends StObject
       with Error {
    def this(command: String) = this()
    
    var command: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("docx-templates/lib/bundled", "TemplateParseError")
  @js.native
  open class TemplateParseError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
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
  inline def createReport(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def createReport_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def createReport_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Extract metadata from a document, such as the number of pages or words.
    * @param template the docx template as a Buffer-like object
    */
  inline def getMetadata(template: Buffer): js.Promise[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Category]]
  
  /**
    * Lists all the commands in a docx template.
    *
    * example:
    * ```js
    * const template_buffer = fs.readFileSync('template.docx');
    * const commands = await listCommands(template_buffer, ['{', '}']);
    * // `commands` will contain something like:
    * [
    *    { raw: 'INS some_variable', code: 'some_variable', type: 'INS' },
    *    { raw: 'IMAGE svgImgFile()', code: 'svgImgFile()', type: 'IMAGE' },
    * ]
    * ```
    *
    * @param template the docx template as a Buffer-like object
    * @param delimiter the command delimiter (defaults to ['+++', '+++'])
    */
  inline def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  
  trait BaseNode extends StObject {
    
    var _children: js.Array[Node]
    
    var _ifName: js.UndefOr[String] = js.undefined
    
    var _parent: js.UndefOr[Node] = js.undefined
  }
  object BaseNode {
    
    inline def apply(_children: js.Array[Node]): BaseNode = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseNode]
    }
    
    extension [Self <: BaseNode](x: Self) {
      
      inline def set_children(value: js.Array[Node]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
      
      inline def set_childrenVarargs(value: Node*): Self = StObject.set(x, "_children", js.Array(value*))
      
      inline def set_ifName(value: String): Self = StObject.set(x, "_ifName", value.asInstanceOf[js.Any])
      
      inline def set_ifNameUndefined: Self = StObject.set(x, "_ifName", js.undefined)
      
      inline def set_parent(value: Node): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
      
      inline def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
    }
  }
  
  type Buffer = ArrayBufferLike
  
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.docxTemplatesStrings.QUERY
    - typings.docxTemplates.docxTemplatesStrings.CMD_NODE
    - typings.docxTemplates.docxTemplatesStrings.ALIAS
    - typings.docxTemplates.docxTemplatesStrings.FOR
    - typings.docxTemplates.docxTemplatesStrings.`END-FOR`
    - typings.docxTemplates.docxTemplatesStrings.IF
    - typings.docxTemplates.docxTemplatesStrings.`END-IF`
    - typings.docxTemplates.docxTemplatesStrings.INS
    - typings.docxTemplates.docxTemplatesStrings.EXEC
    - typings.docxTemplates.docxTemplatesStrings.IMAGE
    - typings.docxTemplates.docxTemplatesStrings.LINK
    - typings.docxTemplates.docxTemplatesStrings.HTML
  */
  trait BuiltInCommand extends StObject
  
  trait CommandSummary extends StObject {
    
    var code: String
    
    var raw: String
    
    var `type`: BuiltInCommand
  }
  object CommandSummary {
    
    inline def apply(code: String, raw: String, `type`: BuiltInCommand): CommandSummary = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandSummary]
    }
    
    extension [Self <: CommandSummary](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setType(value: BuiltInCommand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorHandler = js.Function2[/* e */ js.Error, /* raw_code */ js.UndefOr[String], Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.bundledMod.TextNode
    - typings.docxTemplates.bundledMod.NonTextNode
  */
  trait Node extends StObject
  object Node {
    
    inline def NonTextNode(_attrs: Dictkey, _children: js.Array[Node], _tag: String): typings.docxTemplates.bundledMod.NonTextNode = {
      val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = false, _tag = _tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.docxTemplates.bundledMod.NonTextNode]
    }
    
    inline def TextNode(_children: js.Array[Node], _text: String): typings.docxTemplates.bundledMod.TextNode = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = true, _text = _text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.docxTemplates.bundledMod.TextNode]
    }
  }
  
  trait NonTextNode
    extends StObject
       with BaseNode
       with Node {
    
    var _attrs: Dictkey
    
    var _fTextNode: `false`
    
    var _tag: String
  }
  object NonTextNode {
    
    inline def apply(_attrs: Dictkey, _children: js.Array[Node], _tag: String): NonTextNode = {
      val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = false, _tag = _tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonTextNode]
    }
    
    extension [Self <: NonTextNode](x: Self) {
      
      inline def set_attrs(value: Dictkey): Self = StObject.set(x, "_attrs", value.asInstanceOf[js.Any])
      
      inline def set_fTextNode(value: `false`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: String): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait QualifiedAttribute
    extends StObject
       with QualifiedName {
    
    var value: String
  }
  object QualifiedAttribute {
    
    inline def apply(local: String, name: String, prefix: String, uri: String, value: String): QualifiedAttribute = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedAttribute]
    }
    
    extension [Self <: QualifiedAttribute](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait QualifiedName extends StObject {
    
    var local: String
    
    var name: String
    
    var prefix: String
    
    var uri: String
  }
  object QualifiedName {
    
    inline def apply(local: String, name: String, prefix: String, uri: String): QualifiedName = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QualifiedName]
    }
    
    extension [Self <: QualifiedName](x: Self) {
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryResolver = js.Function2[
    /* query */ js.UndefOr[String], 
    /* queryVars */ Any, 
    ReportData | js.Promise[ReportData]
  ]
  
  type ReportData = Any
  
  type RunJSFunc = js.Function1[/* o */ Ctx, ModifiedSandbox]
  
  trait TextNode
    extends StObject
       with BaseNode
       with Node {
    
    var _fTextNode: `true`
    
    var _text: String
  }
  object TextNode {
    
    inline def apply(_children: js.Array[Node], _text: String): TextNode = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = true, _text = _text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextNode]
    }
    
    extension [Self <: TextNode](x: Self) {
      
      inline def set_fTextNode(value: `true`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
      
      inline def set_text(value: String): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserOptions extends StObject {
    
    /**
      * Add functions or other static data to this option to have access to it in your commands.
      *
      * ```js
      * additionalJsContext: {
      *   qrCode: url => {
      *     const dataUrl = createQrImage(url, { size: 500 });
      *     const data = dataUrl.slice('data:image/gif;base64,'.length);
      *     return { width: 6, height: 6, data, extension: '.gif' };
      *   },
      * }
      * ```
      */
    var additionalJsContext: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Defines a custom command delimiter. This can be a String e.g. '+++' or an Array of Strings with length 2: ['{', '}'] in which the first element serves as the start delimiter and the second as the end delimiter.
      */
    var cmdDelimiter: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
    
    /**
      * Object of data to be injected or a (async) function that resolves to the data. The function gets as an argument the contents of the QUERY command as a string.
      */
    var data: js.UndefOr[ReportData | QueryResolver] = js.undefined
    
    /**
      * Custom error handler to catch any errors that may occur evaluating commands in the template. The value returned from this handler will be inserted into the template instead.
      */
    var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
    
    /**
      * Whether to fail on the first error encountered in the template. Defaults to true. Can be used to collect all errors in a template (e.g. misspelled commands) before failing.
      */
    var failFast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * MS Word usually autocorrects JS string literal quotes with unicode 'smart' quotes ('curly' quotes). E.g. 'aubergine' -> ‘aubergine’.
      * This causes an error when evaluating commands containing these smart quotes, as they are not valid JavaScript.
      * If you set fixSmartQuotes to 'true', these smart quotes will automatically get replaced with straight quotes (') before command evaluation.
      * Defaults to false.
      */
    var fixSmartQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be used to change the delimiter in generated XML.
      */
    var literalXmlDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * INSECURE: Set this option to true to disable running all commands in a new JS-VM. USE ONLY WITH TRUSTED TEMPLATES. Beware of arbitrary code injection risks. Can slightly improve performance on complex templates.
      */
    var noSandbox: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Handle linebreaks in result of commands as actual linebreaks (Default: true)
      */
    var processLineBreaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets injected into data function as second argument.
      */
    var queryVars: js.UndefOr[Any] = js.undefined
    
    /**
      * When set to `true`, this setting ensures `createReport` throws a `NullishCommandResultError` when the result of an INS, HTML, IMAGE, or LINK command is `null` or `undefined`. This is useful as nullish return values usually indicate a mistake in the template or the invoking code. Defaults to `false`.
      */
    var rejectNullish: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom sandbox. See documentation for details.
      */
    var runJs: js.UndefOr[RunJSFunc] = js.undefined
    
    /**
      * Docx file template as a NodeJS Buffer or Buffer-like object in Browsers.
      */
    var template: Buffer
  }
  object UserOptions {
    
    inline def apply(template: Buffer): UserOptions = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserOptions]
    }
    
    extension [Self <: UserOptions](x: Self) {
      
      inline def setAdditionalJsContext(value: js.Object): Self = StObject.set(x, "additionalJsContext", value.asInstanceOf[js.Any])
      
      inline def setAdditionalJsContextUndefined: Self = StObject.set(x, "additionalJsContext", js.undefined)
      
      inline def setCmdDelimiter(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "cmdDelimiter", value.asInstanceOf[js.Any])
      
      inline def setCmdDelimiterUndefined: Self = StObject.set(x, "cmdDelimiter", js.undefined)
      
      inline def setData(value: ReportData | QueryResolver): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataFunction2(
        value: (/* query */ js.UndefOr[String], /* queryVars */ Any) => ReportData | js.Promise[ReportData]
      ): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErrorHandler(value: (/* e */ js.Error, /* raw_code */ js.UndefOr[String]) => Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
      
      inline def setFixSmartQuotes(value: Boolean): Self = StObject.set(x, "fixSmartQuotes", value.asInstanceOf[js.Any])
      
      inline def setFixSmartQuotesUndefined: Self = StObject.set(x, "fixSmartQuotes", js.undefined)
      
      inline def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
      
      inline def setLiteralXmlDelimiterUndefined: Self = StObject.set(x, "literalXmlDelimiter", js.undefined)
      
      inline def setNoSandbox(value: Boolean): Self = StObject.set(x, "noSandbox", value.asInstanceOf[js.Any])
      
      inline def setNoSandboxUndefined: Self = StObject.set(x, "noSandbox", js.undefined)
      
      inline def setProcessLineBreaks(value: Boolean): Self = StObject.set(x, "processLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setProcessLineBreaksUndefined: Self = StObject.set(x, "processLineBreaks", js.undefined)
      
      inline def setQueryVars(value: Any): Self = StObject.set(x, "queryVars", value.asInstanceOf[js.Any])
      
      inline def setQueryVarsUndefined: Self = StObject.set(x, "queryVars", js.undefined)
      
      inline def setRejectNullish(value: Boolean): Self = StObject.set(x, "rejectNullish", value.asInstanceOf[js.Any])
      
      inline def setRejectNullishUndefined: Self = StObject.set(x, "rejectNullish", js.undefined)
      
      inline def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = StObject.set(x, "runJs", js.Any.fromFunction1(value))
      
      inline def setRunJsUndefined: Self = StObject.set(x, "runJs", js.undefined)
      
      inline def setTemplate(value: Buffer): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
