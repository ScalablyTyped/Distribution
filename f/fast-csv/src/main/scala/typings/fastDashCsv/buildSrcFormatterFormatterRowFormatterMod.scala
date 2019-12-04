package typings.fastDashCsv

import typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod.FormatterOptions
import typings.fastDashCsv.buildSrcFormatterFormatterRowFormatterMod.RowFormatter
import typings.fastDashCsv.buildSrcFormatterFormatterRowFormatterMod.RowFormatterCallback
import typings.fastDashCsv.buildSrcFormatterTypesMod.Row
import typings.fastDashCsv.buildSrcFormatterTypesMod.RowTransformCallback
import typings.fastDashCsv.buildSrcFormatterTypesMod.RowTransformFunction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/formatter/RowFormatter", JSImport.Namespace)
@js.native
object buildSrcFormatterFormatterRowFormatterMod extends js.Object {
  @js.native
  trait RowFormatter extends js.Object {
    var _rowTransform: js.UndefOr[js.Any] = js.native
    var callTransformer: js.Any = js.native
    var checkHeaders: js.Any = js.native
    val fieldFormatter: js.Any = js.native
    var formatColumns: js.Any = js.native
    val formatterOptions: js.Any = js.native
    var gatherColumns: js.Any = js.native
    var hasWrittenHeaders: js.Any = js.native
    var headers: js.Any = js.native
    var rowCount: js.Any = js.native
    @JSName("rowTransform")
    var rowTransform_Original: RowTransformFunction = js.native
    var shouldWriteHeaders: js.Any = js.native
    def format(row: Row, cb: RowFormatterCallback): Unit = js.native
    def rowTransform(row: Row): Row = js.native
    def rowTransform(row: Row, callback: RowTransformCallback): Unit = js.native
  }
  
  @js.native
  class default protected () extends RowFormatter {
    def this(formatterOptions: FormatterOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var createTransform: js.Any = js.native
    var gatherHeaders: js.Any = js.native
    var isHashArray: js.Any = js.native
  }
  
  type RowFormatterCallback = js.Function2[/* error */ Error | Null, /* data */ js.UndefOr[js.Array[String]], Unit]
}

