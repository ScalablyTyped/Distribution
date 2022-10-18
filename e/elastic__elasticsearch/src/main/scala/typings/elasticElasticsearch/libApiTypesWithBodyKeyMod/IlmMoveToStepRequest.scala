package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Currentstep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmMoveToStepRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Currentstep] = js.undefined
  
  var index: IndexName
}
object IlmMoveToStepRequest {
  
  inline def apply(index: IndexName): IlmMoveToStepRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmMoveToStepRequest]
  }
  
  extension [Self <: IlmMoveToStepRequest](x: Self) {
    
    inline def setBody(value: Currentstep): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
