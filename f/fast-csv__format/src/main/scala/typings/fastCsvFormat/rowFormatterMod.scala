package typings.fastCsvFormat

import typings.fastCsvFormat.formatterOptionsMod.FormatterOptions
import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowArray
import typings.fastCsvFormat.typesMod.RowTransformFunction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/format/build/src/formatter/RowFormatter", JSImport.Namespace)
@js.native
object rowFormatterMod extends js.Object {
  @js.native
  class RowFormatter[I /* <: Row */, O /* <: Row */] protected () extends js.Object {
    def this(formatterOptions: FormatterOptions[I, O]) = this()
    var _rowTransform: js.Any = js.native
    var callTransformer: js.Any = js.native
    var checkHeaders: js.Any = js.native
    val fieldFormatter: js.Any = js.native
    var formatColumns: js.Any = js.native
    val formatterOptions: js.Any = js.native
    var gatherColumns: js.Any = js.native
    var hasWrittenHeaders: js.Any = js.native
    var headers: js.Any = js.native
    var rowCount: js.Any = js.native
    val shouldWriteHeaders: js.Any = js.native
    def finish(cb: RowFormatterCallback): Unit = js.native
    def format(row: I, cb: RowFormatterCallback): Unit = js.native
    def rowTransform_=(transformFunction: RowTransformFunction[I, O]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object RowFormatter extends js.Object {
    var createTransform: js.Any = js.native
    var gatherHeaders: js.Any = js.native
    var isHashArray: js.Any = js.native
  }
  
  type RowFormatterCallback = js.Function2[/* error */ Error | Null, /* data */ js.UndefOr[RowArray], Unit]
}

