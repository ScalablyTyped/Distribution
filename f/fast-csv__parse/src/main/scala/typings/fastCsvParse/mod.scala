package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CsvParserStream[I /* <: Row[_] */, O /* <: Row[_] */] protected ()
    extends typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] {
    def this(parserOptions: typings.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typings.fastCsvParse.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  def isSyncTransform[I /* <: Row[_] */, O /* <: Row[_] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
  def isSyncValidate[R /* <: Row[_] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](args: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String, options: ParserOptionsArgs): typings.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
}

