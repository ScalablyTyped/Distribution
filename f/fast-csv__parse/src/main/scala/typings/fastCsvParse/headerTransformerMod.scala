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
  class HeaderTransformer[O /* <: Row[js.Any] */] protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    var headers: HeaderArray | Null = js.native
    
    /* private */ var headersLength: js.Any = js.native
    
    /* private */ val headersTransform: js.Any = js.native
    
    /* private */ var mapHeaders: js.Any = js.native
    
    /* private */ val parserOptions: js.Any = js.native
    
    /* private */ var processRow: js.Any = js.native
    
    /* private */ var processedFirstRow: js.Any = js.native
    
    /* private */ var receivedHeaders: js.Any = js.native
    
    /* private */ var setHeaders: js.Any = js.native
    
    /* private */ var shouldMapRow: js.Any = js.native
    
    /* private */ val shouldUseFirstRow: js.Any = js.native
    
    def transform(row: RowArray[js.Any], cb: RowValidatorCallback[O]): Unit = js.native
  }
}
