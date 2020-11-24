package typings.fastCsv

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  def parse[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parse[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](args: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](location: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseString[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](string: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = js.native
  
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = js.native
  
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = js.native
  
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = js.native
  
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.mod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @js.native
  class CsvParserStream[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */] protected ()
    extends typings.fastCsvParse.mod.CsvParserStream[I, O] {
    def this(parserOptions: typings.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  @js.native
  object CsvParserStream extends js.Object {
    
    var wrapDoneCallback: js.Any = js.native
  }
  
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.mod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typings.fastCsvParse.mod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
}
