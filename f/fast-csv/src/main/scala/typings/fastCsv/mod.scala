package typings.fastCsv

import typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.buildSrcTypesMod.Row
import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptionsArgs
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-csv", "CsvFormatterStream")
  @js.native
  open class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.mod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("fast-csv", "CsvParserStream")
  @js.native
  open class CsvParserStream[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */] protected ()
    extends typings.fastCsvParse.mod.CsvParserStream[I, O] {
    def this(parserOptions: typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("fast-csv", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fast-csv", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: Any = js.native
    inline def wrapDoneCallback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("fast-csv", "FormatterOptions")
  @js.native
  open class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.mod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @JSImport("fast-csv", "ParserOptions")
  @js.native
  open class ParserOptions ()
    extends typings.fastCsvParse.mod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  inline def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  inline def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  inline def parse[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parse[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](args: ParserOptionsArgs): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseFile[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](location: String): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseFile[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseStream[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](stream: ReadableStream): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseStream[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](stream: ReadableStream, options: ParserOptionsArgs): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseString[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](string: String): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  inline def parseString[I /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */, O /* <: typings.fastCsvParse.buildSrcTypesMod.Row[Any] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.buildSrcCsvParserStreamMod.CsvParserStream[I, O]]
  
  inline def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  inline def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  inline def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  inline def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  
  inline def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
