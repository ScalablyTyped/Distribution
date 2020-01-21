package typings.fastCsv

import typings.fastCsv.formatterOptionsMod.FormatterOptions
import typings.fastCsv.typesMod.Row
import typings.fastCsv.typesMod.RowTransformFunction
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/formatter/CsvFormatterStream", JSImport.Namespace)
@js.native
object csvFormatterStreamMod extends js.Object {
  @js.native
  trait CsvFormatterStream extends Transform {
    var formatterOptions: js.Any = js.native
    var hasWrittenBOM: js.Any = js.native
    var rowFormatter: js.Any = js.native
    def _transform(row: Row, encoding: String, cb: TransformCallback): Unit = js.native
    def transform(transformFunction: RowTransformFunction): CsvFormatterStream = js.native
  }
  
  @js.native
  class default protected () extends CsvFormatterStream {
    def this(formatterOptions: FormatterOptions) = this()
  }
  
}

