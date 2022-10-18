package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePostStartBasicRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
}
object LicensePostStartBasicRequest {
  
  inline def apply(): LicensePostStartBasicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasicRequest]
  }
  
  extension [Self <: LicensePostStartBasicRequest](x: Self) {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
  }
}
