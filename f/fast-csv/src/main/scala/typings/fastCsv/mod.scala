package typings.fastCsv

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-csv", "CsvFormatterStream")
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.mod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("fast-csv", "CsvParserStream")
  @js.native
  class CsvParserStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */] protected ()
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
    def wrapDoneCallback: js.Any = js.native
    @scala.inline
    def wrapDoneCallback_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("fast-csv", "FormatterOptions")
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.mod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @JSImport("fast-csv", "ParserOptions")
  @js.native
  class ParserOptions ()
    extends typings.fastCsvParse.mod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @JSImport("fast-csv", "format")
  @js.native
  def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  @JSImport("fast-csv", "format")
  @js.native
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  @JSImport("fast-csv", "parse")
  @js.native
  def parse[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("fast-csv", "parse")
  @js.native
  def parse[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](args: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("fast-csv", "parseFile")
  @js.native
  def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](location: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("fast-csv", "parseFile")
  @js.native
  def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("fast-csv", "parseStream")
  @js.native
  def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("fast-csv", "parseStream")
  @js.native
  def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("fast-csv", "parseString")
  @js.native
  def parseString[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](string: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("fast-csv", "parseString")
  @js.native
  def parseString[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("fast-csv", "write")
  @js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  @JSImport("fast-csv", "write")
  @js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  @JSImport("fast-csv", "writeToBuffer")
  @js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = js.native
  @JSImport("fast-csv", "writeToBuffer")
  @js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = js.native
  
  @JSImport("fast-csv", "writeToPath")
  @js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = js.native
  @JSImport("fast-csv", "writeToPath")
  @js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = js.native
  
  @JSImport("fast-csv", "writeToStream")
  @js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = js.native
  @JSImport("fast-csv", "writeToStream")
  @js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = js.native
  
  @JSImport("fast-csv", "writeToString")
  @js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = js.native
  @JSImport("fast-csv", "writeToString")
  @js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = js.native
}
