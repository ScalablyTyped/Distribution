package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.SupplyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: SupplyRequest
}
object `97` {
  
  @scala.inline
  def apply(id: String): `97` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "SupplyRequest")
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit class `97MutableBuilder`[Self <: `97`] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: SupplyRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
