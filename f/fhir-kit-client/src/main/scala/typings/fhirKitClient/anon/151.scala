package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: ImmunizationRecommendation
  
  var version: String
}
object `151` {
  
  @scala.inline
  def apply(id: String, version: String): `151` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "ImmunizationRecommendation", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  
  @scala.inline
  implicit class `151MutableBuilder`[Self <: `151`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: ImmunizationRecommendation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
