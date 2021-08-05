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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csvParserStreamMod {
  
  @JSImport("@fast-csv/parse/build/src/CsvParserStream", "CsvParserStream")
  @js.native
  class CsvParserStream[I /* <: Row[js.Any] */, O /* <: Row[js.Any] */] protected () extends Transform {
    def this(parserOptions: ParserOptions) = this()
    
    def _transform(data: Buffer, encoding: String, done: TransformCallback): Unit = js.native
    
    /* private */ var checkAndEmitHeaders: js.Any = js.native
    
    /* private */ val decoder: js.Any = js.native
    
    /* private */ var endEmitted: js.Any = js.native
    
    /* private */ def hasHitRowLimit: js.Any = js.native
    
    /* private */ val headerTransformer: js.Any = js.native
    
    /* private */ var headersEmitted: js.Any = js.native
    
    /* private */ var lines: js.Any = js.native
    
    /* private */ var parse: js.Any = js.native
    
    /* private */ var parsedLineCount: js.Any = js.native
    
    /* private */ var parsedRowCount: js.Any = js.native
    
    /* private */ val parser: js.Any = js.native
    
    /* private */ val parserOptions: js.Any = js.native
    
    /* private */ var processRows: js.Any = js.native
    
    /* private */ var pushRow: js.Any = js.native
    
    /* private */ var rowCount: js.Any = js.native
    
    /* private */ val rowTransformerValidator: js.Any = js.native
    
    /* private */ def shouldEmitRows: js.Any = js.native
    
    /* private */ def shouldSkipLine: js.Any = js.native
    
    /* private */ var skipRow: js.Any = js.native
    
    def transform(transformFunction: RowTransformFunction[I, O]): CsvParserStream[I, O] = js.native
    
    /* private */ var transformRow: js.Any = js.native
    
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
    inline def wrapDoneCallback_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
}
