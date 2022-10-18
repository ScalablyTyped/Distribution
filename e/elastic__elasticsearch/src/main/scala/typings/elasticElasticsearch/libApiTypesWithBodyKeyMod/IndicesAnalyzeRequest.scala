package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Analyzer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Analyzer] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
}
object IndicesAnalyzeRequest {
  
  inline def apply(): IndicesAnalyzeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyzeRequest]
  }
  
  extension [Self <: IndicesAnalyzeRequest](x: Self) {
    
    inline def setBody(value: Analyzer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
