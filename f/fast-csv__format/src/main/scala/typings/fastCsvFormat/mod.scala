package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowTransformFunction
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def isSyncTransform[I /* <: Row */, O /* <: Row */](transform: RowTransformFunction[I, O]): /* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
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
}

