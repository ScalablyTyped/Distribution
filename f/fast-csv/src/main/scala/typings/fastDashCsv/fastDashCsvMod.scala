package typings.fastDashCsv

import typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptionsArgs
import typings.fastDashCsv.buildSrcFormatterMod.CsvFormatterStream
import typings.fastDashCsv.buildSrcFormatterTypesMod.Row
import typings.fastDashCsv.buildSrcParserMod.CsvParserStream
import typings.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptionsArgs
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv", JSImport.Namespace)
@js.native
object fastDashCsvMod extends js.Object {
  def format(): CsvFormatterStream = js.native
  def format(options: FormatterOptionsArgs): CsvFormatterStream = js.native
  def fromPath(location: String): CsvParserStream = js.native
  def fromPath(location: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromStream(stream: ReadableStream): CsvParserStream = js.native
  def fromStream(stream: ReadableStream, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromString(string: String): CsvParserStream = js.native
  def fromString(string: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def parse(): CsvParserStream = js.native
  def parse(args: ParserOptionsArgs): CsvParserStream = js.native
  def parseFile(location: String): CsvParserStream = js.native
  def parseFile(location: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def parseStream(stream: ReadableStream): CsvParserStream = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): CsvParserStream = js.native
  def parseString(string: String): CsvParserStream = js.native
  def parseString(string: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def write(rows: js.Array[Row]): CsvFormatterStream = js.native
  def write(rows: js.Array[Row], options: FormatterOptionsArgs): CsvFormatterStream = js.native
  def writeToBuffer(rows: js.Array[Row]): js.Promise[Buffer] = js.native
  def writeToBuffer(rows: js.Array[Row], opts: FormatterOptionsArgs): js.Promise[Buffer] = js.native
  def writeToPath(path: String, rows: js.Array[Row]): WriteStream = js.native
  def writeToPath(path: String, rows: js.Array[Row], options: FormatterOptionsArgs): WriteStream = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row]): T = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row], options: FormatterOptionsArgs): T = js.native
  def writeToString(rows: js.Array[Row]): js.Promise[String] = js.native
  def writeToString(rows: js.Array[Row], options: FormatterOptionsArgs): js.Promise[String] = js.native
}

