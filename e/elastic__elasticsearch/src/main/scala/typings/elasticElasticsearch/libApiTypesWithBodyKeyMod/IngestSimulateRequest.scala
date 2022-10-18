package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Docs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Docs] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object IngestSimulateRequest {
  
  inline def apply(): IngestSimulateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestSimulateRequest]
  }
  
  extension [Self <: IngestSimulateRequest](x: Self) {
    
    inline def setBody(value: Docs): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
