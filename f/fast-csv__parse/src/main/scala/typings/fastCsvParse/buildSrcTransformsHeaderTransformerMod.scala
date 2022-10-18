package typings.fastCsvParse

import typings.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typings.fastCsvParse.buildSrcTypesMod.HeaderArray
import typings.fastCsvParse.buildSrcTypesMod.Row
import typings.fastCsvParse.buildSrcTypesMod.RowArray
import typings.fastCsvParse.buildSrcTypesMod.RowValidatorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransformsHeaderTransformerMod {
  
  @JSImport("@fast-csv/parse/build/src/transforms/HeaderTransformer", "HeaderTransformer")
  @js.native
  open class HeaderTransformer[O /* <: Row[Any] */] protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    var headers: HeaderArray | Null = js.native
    
    /* private */ var headersLength: Any = js.native
    
    /* private */ val headersTransform: Any = js.native
    
    /* private */ var mapHeaders: Any = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    /* private */ var processRow: Any = js.native
    
    /* private */ var processedFirstRow: Any = js.native
    
    /* private */ var receivedHeaders: Any = js.native
    
    /* private */ var setHeaders: Any = js.native
    
    /* private */ var shouldMapRow: Any = js.native
    
    /* private */ val shouldUseFirstRow: Any = js.native
    
    def transform(row: RowArray[Any], cb: RowValidatorCallback[O]): Unit = js.native
  }
}
