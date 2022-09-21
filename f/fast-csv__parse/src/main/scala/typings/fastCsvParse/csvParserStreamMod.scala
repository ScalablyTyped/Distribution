package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csvParserStreamMod {
  
  @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream")
  @js.native
  open class CsvParserStream[I /* <: Row[Any] */, O /* <: Row[Any] */] protected () extends Transform {
    def this(parserOptions: ParserOptions) = this()
    
    def _transform(data: Buffer, encoding: String, done: TransformCallback): Unit = js.native
    
    /* private */ var checkAndEmitHeaders: Any = js.native
    
    /* private */ val decoder: Any = js.native
    
    def emit(event: String, rest: Any*): Boolean = js.native
    def emit(event: js.Symbol, rest: Any*): Boolean = js.native
    
    /* private */ var endEmitted: Any = js.native
    
    /* private */ def hasHitRowLimit: Any = js.native
    
    /* private */ val headerTransformer: Any = js.native
    
    /* private */ var headersEmitted: Any = js.native
    
    /* private */ var lines: Any = js.native
    
    /* private */ var parse: Any = js.native
    
    /* private */ var parsedLineCount: Any = js.native
    
    /* private */ var parsedRowCount: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    /* private */ var processRows: Any = js.native
    
    /* private */ var pushRow: Any = js.native
    
    /* private */ var rowCount: Any = js.native
    
    /* private */ val rowTransformerValidator: Any = js.native
    
    /* private */ def shouldEmitRows: Any = js.native
    
    /* private */ def shouldSkipLine: Any = js.native
    
    /* private */ var skipRow: Any = js.native
    
    def transform(transformFunction: RowTransformFunction[I, O]): CsvParserStream[I, O] = js.native
    
    /* private */ var transformRow: Any = js.native
    
    def validate(validateFunction: RowValidate[O]): CsvParserStream[I, O] = js.native
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: Any = js.native
    inline def wrapDoneCallback_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
}
