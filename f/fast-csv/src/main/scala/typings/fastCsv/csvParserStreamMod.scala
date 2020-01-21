package typings.fastCsv

import typings.fastCsv.parserOptionsMod.ParserOptions
import typings.fastCsv.parserTypesMod.RowTransformFunction
import typings.fastCsv.parserTypesMod.RowValidate
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/CsvParserStream", JSImport.Namespace)
@js.native
object csvParserStreamMod extends js.Object {
  @js.native
  trait CsvParserStream extends Transform {
    val decoder: js.Any = js.native
    var endEmitted: js.Any = js.native
    val headerTransformer: js.Any = js.native
    var lines: js.Any = js.native
    var parse: js.Any = js.native
    var parsedLineCount: js.Any = js.native
    var parsedRowCount: js.Any = js.native
    val parser: js.Any = js.native
    val parserOptions: js.Any = js.native
    var processRows: js.Any = js.native
    var pushRow: js.Any = js.native
    var rowCount: js.Any = js.native
    val rowTransformerValidator: js.Any = js.native
    var transformRow: js.Any = js.native
    def _transform(data: Buffer, encoding: String, done: TransformCallback): Unit = js.native
    /* private */ def hasHitRowLimit(): js.Any = js.native
    /* private */ def shouldEmitRows(): js.Any = js.native
    /* private */ def shouldSkipLine(): js.Any = js.native
    def transform(transformFunction: RowTransformFunction): CsvParserStream = js.native
    def validate(validateFunction: RowValidate): CsvParserStream = js.native
  }
  
  @js.native
  class default protected () extends CsvParserStream {
    def this(parserOptions: ParserOptions) = this()
  }
  
}

