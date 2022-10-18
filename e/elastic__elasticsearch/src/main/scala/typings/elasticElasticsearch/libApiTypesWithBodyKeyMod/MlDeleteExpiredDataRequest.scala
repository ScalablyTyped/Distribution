package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Requestspersecond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteExpiredDataRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Requestspersecond] = js.undefined
  
  var job_id: js.UndefOr[Id] = js.undefined
}
object MlDeleteExpiredDataRequest {
  
  inline def apply(): MlDeleteExpiredDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDeleteExpiredDataRequest]
  }
  
  extension [Self <: MlDeleteExpiredDataRequest](x: Self) {
    
    inline def setBody(value: Requestspersecond): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
  }
}
