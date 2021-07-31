package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.MessageDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: MessageDefinition
}
object `57` {
  
  @scala.inline
  def apply(id: String): `57` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "MessageDefinition")
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit class `57MutableBuilder`[Self <: `57`] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: MessageDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
