package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphDefinitionLinkTarget
  extends StObject
     with BackboneElement {
  
  var _params: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Compartment Consistency Rules.
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.undefined
  
  /**
    * Additional links from target resource.
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.undefined
  
  /**
    * At least one of the parameters must have the value {ref} which identifies the focus resource.
    */
  var params: js.UndefOr[String] = js.undefined
  
  /**
    * Profile for the target resource.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource this link refers to.
    */
  var `type`: String
}
object GraphDefinitionLinkTarget {
  
  inline def apply(`type`: String): GraphDefinitionLinkTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphDefinitionLinkTarget] (val x: Self) extends AnyVal {
    
    inline def setCompartment(value: js.Array[GraphDefinitionLinkTargetCompartment]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: GraphDefinitionLinkTargetCompartment*): Self = StObject.set(x, "compartment", js.Array(value*))
    
    inline def setLink(value: js.Array[GraphDefinitionLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: GraphDefinitionLink*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_params(value: Element): Self = StObject.set(x, "_params", value.asInstanceOf[js.Any])
    
    inline def set_paramsUndefined: Self = StObject.set(x, "_params", js.undefined)
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
