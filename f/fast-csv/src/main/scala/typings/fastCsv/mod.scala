package typings.fastCsv

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.WriteStream
import typings.std.ReadableStream
import typings.std.WritableStream
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
    def this(formatterOptions: typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("fast-csv", "CsvParserStream")
  @js.native
  open class CsvParserStream[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */] protected ()
    extends typings.fastCsvParse.mod.CsvParserStream[I, O] {
    def this(parserOptions: typings.fastCsvParse.parserOptionsMod.ParserOptions) = this()
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
  
  inline def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  inline def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  inline def parse[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  inline def parse[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](args: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(args.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](location: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  inline def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](stream: ReadableStream[Any]): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  inline def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](stream: ReadableStream[Any], options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStream")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  inline def parseString[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](string: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  inline def parseString[I /* <: typings.fastCsvParse.typesMod.Row[Any] */, O /* <: typings.fastCsvParse.typesMod.Row[Any] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O]]
  
  inline def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  inline def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  inline def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  inline def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  
  inline def writeToStream[T /* <: WritableStream[Any] */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def writeToStream[T /* <: WritableStream[Any] */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
