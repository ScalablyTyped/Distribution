package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartTrialRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
  
  var type_query_string: js.UndefOr[String] = js.undefined
}
object LicensePostStartTrialRequest {
  
  inline def apply(): LicensePostStartTrialRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartTrialRequest]
  }
  
  extension [Self <: LicensePostStartTrialRequest](x: Self) {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setType_query_string(value: String): Self = StObject.set(x, "type_query_string", value.asInstanceOf[js.Any])
    
    inline def setType_query_stringUndefined: Self = StObject.set(x, "type_query_string", js.undefined)
  }
}
