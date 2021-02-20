package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csvParserStreamMod {
  
  @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream")
  @js.native
  class CsvParserStream[I /* <: Row[_] */, O /* <: Row[_] */] protected () extends Transform {
    def this(parserOptions: ParserOptions) = this()
    
    def _transform(data: Buffer, encoding: String, done: TransformCallback): Unit = js.native
    
    var checkAndEmitHeaders: js.Any = js.native
    
    val decoder: js.Any = js.native
    
    var endEmitted: js.Any = js.native
    
    /* private */ def hasHitRowLimit: js.Any = js.native
    
    val headerTransformer: js.Any = js.native
    
    var headersEmitted: js.Any = js.native
    
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
    
    /* private */ def shouldEmitRows: js.Any = js.native
    
    /* private */ def shouldSkipLine: js.Any = js.native
    
    var skipRow: js.Any = js.native
    
    def transform(transformFunction: RowTransformFunction[I, O]): CsvParserStream[I, O] = js.native
    
    var transformRow: js.Any = js.native
    
    def validate(validateFunction: RowValidate[O]): CsvParserStream[I, O] = js.native
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: js.Any = js.native
    @scala.inline
    def wrapDoneCallback_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
}
