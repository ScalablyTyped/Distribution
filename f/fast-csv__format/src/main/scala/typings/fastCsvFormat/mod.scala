package typings.fastCsvFormat

import typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptionsArgs
import typings.fastCsvFormat.buildSrcTypesMod.Row
import typings.fastCsvFormat.buildSrcTypesMod.RowTransformFunction
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
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
  open class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @JSImport("@fast-csv/format", "FormatterOptions")
  @js.native
  open class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typings.fastCsvFormat.buildSrcFormatterOptionsMod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  inline def format[I /* <: Row */, O /* <: Row */](): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")().asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  inline def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fastCsvFormat.buildSrcCsvFormatterStreamMod.CsvFormatterStream[I, O]]
  
  inline def isSyncTransform[I /* <: Row */, O /* <: Row */](transform: RowTransformFunction[I, O]): /* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
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
