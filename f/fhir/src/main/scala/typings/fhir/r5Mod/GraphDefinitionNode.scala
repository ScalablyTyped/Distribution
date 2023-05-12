package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphDefinitionNode
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _nodeId: js.UndefOr[Element] = js.undefined
  
  var _profile: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Information about why this node is of interest in this graph definition.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Internal ID of node - target for link references.
    */
  var nodeId: String
  
  /**
    * Profile for the target resource.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource this link refers to.
    */
  var `type`: String
}
object GraphDefinitionNode {
  
  inline def apply(nodeId: String, `type`: String): GraphDefinitionNode = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphDefinitionNode] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_nodeId(value: Element): Self = StObject.set(x, "_nodeId", value.asInstanceOf[js.Any])
    
    inline def set_nodeIdUndefined: Self = StObject.set(x, "_nodeId", js.undefined)
    
    inline def set_profile(value: Element): Self = StObject.set(x, "_profile", value.asInstanceOf[js.Any])
    
    inline def set_profileUndefined: Self = StObject.set(x, "_profile", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
