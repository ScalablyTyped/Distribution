package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Potential target for the link
  */
trait GraphDefinitionLinkTarget
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Compartment Consistency Rules
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.undefined
  
  /**
    * Additional links from target resource
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.undefined
  
  /**
    * Profile for the target resource
    */
  var profile: js.UndefOr[uri] = js.undefined
  
  /**
    * Type of resource this link refers to
    */
  var `type`: code
}
object GraphDefinitionLinkTarget {
  
  inline def apply(`type`: code): GraphDefinitionLinkTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTarget]
  }
  
  extension [Self <: GraphDefinitionLinkTarget](x: Self) {
    
    inline def setCompartment(value: js.Array[GraphDefinitionLinkTargetCompartment]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: GraphDefinitionLinkTargetCompartment*): Self = StObject.set(x, "compartment", js.Array(value :_*))
    
    inline def setLink(value: js.Array[GraphDefinitionLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: GraphDefinitionLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    inline def setProfile(value: uri): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
