package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTopicNotificationShape
  extends StObject
     with BackboneElement {
  
  var _include: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _revInclude: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Search-style _include directives, rooted in the resource for this shape. Servers SHOULD include resources listed here, if they exist and the user is authorized to receive them.  Clients SHOULD be prepared to receive these additional resources, but SHALL function properly without them.
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * URL of the Resource that is the type used in this shape. Relative URLs are relative to the StructureDefinition root of the implemented FHIR version (e.g., http://hl7.org/fhir/StructureDefinition). For example, "Patient" maps to http://hl7.org/fhir/StructureDefinition/Patient. For more information, see <a href="elementdefinition-definitions.html#ElementDefinition.type.code">ElementDefinition.type.code</a>.
    */
  var resource: String
  
  /**
    * Search-style _revinclude directives, rooted in the resource for this shape. Servers SHOULD include resources listed here, if they exist and the user is authorized to receive them.  Clients SHOULD be prepared to receive these additional resources, but SHALL function properly without them.
    */
  var revInclude: js.UndefOr[js.Array[String]] = js.undefined
}
object SubscriptionTopicNotificationShape {
  
  inline def apply(resource: String): SubscriptionTopicNotificationShape = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTopicNotificationShape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionTopicNotificationShape] (val x: Self) extends AnyVal {
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRevInclude(value: js.Array[String]): Self = StObject.set(x, "revInclude", value.asInstanceOf[js.Any])
    
    inline def setRevIncludeUndefined: Self = StObject.set(x, "revInclude", js.undefined)
    
    inline def setRevIncludeVarargs(value: String*): Self = StObject.set(x, "revInclude", js.Array(value*))
    
    inline def set_include(value: js.Array[Element]): Self = StObject.set(x, "_include", value.asInstanceOf[js.Any])
    
    inline def set_includeUndefined: Self = StObject.set(x, "_include", js.undefined)
    
    inline def set_includeVarargs(value: Element*): Self = StObject.set(x, "_include", js.Array(value*))
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_revInclude(value: js.Array[Element]): Self = StObject.set(x, "_revInclude", value.asInstanceOf[js.Any])
    
    inline def set_revIncludeUndefined: Self = StObject.set(x, "_revInclude", js.undefined)
    
    inline def set_revIncludeVarargs(value: Element*): Self = StObject.set(x, "_revInclude", js.Array(value*))
  }
}
