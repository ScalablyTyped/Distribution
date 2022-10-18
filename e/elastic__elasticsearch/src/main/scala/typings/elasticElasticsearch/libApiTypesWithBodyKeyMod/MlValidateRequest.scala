package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Datadescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlValidateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Datadescription] = js.undefined
}
object MlValidateRequest {
  
  inline def apply(): MlValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlValidateRequest]
  }
  
  extension [Self <: MlValidateRequest](x: Self) {
    
    inline def setBody(value: Datadescription): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
