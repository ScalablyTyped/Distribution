package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.typesMod.HeaderArray
import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowArray
import typings.fastCsvParse.typesMod.RowValidatorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerTransformerMod {
  
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
