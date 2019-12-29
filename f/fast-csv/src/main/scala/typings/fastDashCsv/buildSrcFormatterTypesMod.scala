package typings.fastDashCsv

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/types", JSImport.Namespace)
@js.native
object buildSrcFormatterTypesMod extends js.Object {
  @js.native
  trait RowTransformFunction extends js.Object {
    def apply(row: Row): Row = js.native
    def apply(row: Row, callback: RowTransformCallback): Unit = js.native
  }
  
  type Row = RowArray | RowMap | RowHashArray
  type RowArray = js.Array[String]
  type RowHashArray = js.Array[js.Tuple2[String, js.Any]]
  type RowMap = StringDictionary[js.Any]
  type RowTransformCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* row */ js.UndefOr[Row], Unit]
}

