package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowTransformFunction
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fast-csv/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fast-csv/format", "CsvFormatterStream")
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("@fast-csv/format", "FormatterOptions")
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @scala.inline
  def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  @scala.inline
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  @scala.inline
  def isSyncTransform[I /* <: Row */, O /* <: Row */](transform: RowTransformFunction[I, O]): /* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
  @scala.inline
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  @scala.inline
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  @scala.inline
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToBuffer")(rows.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  @scala.inline
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToPath")(path.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  
  @scala.inline
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(ws.asInstanceOf[js.Any], rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToString")(rows.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
