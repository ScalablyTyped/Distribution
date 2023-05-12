package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphDefinitionLink
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _params: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _sliceName: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  var _targetId: js.UndefOr[Element] = js.undefined
  
  /**
    * Compartment Consistency Rules.
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkCompartment]] = js.undefined
  
  /**
    * Information about why this link is of interest in this graph definition.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum occurrences for this link.
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum occurrences for this link.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * At least one of the parameters must have the value {ref} which identifies the focus resource.
    */
  var params: js.UndefOr[String] = js.undefined
  
  /**
    * The path expression cannot contain a resolve() function. If there is no path, the link is a reverse lookup, using target.params. If the path is "*" then this means all references in the resource.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Which slice (if profiled).
    */
  var sliceName: js.UndefOr[String] = js.undefined
  
  /**
    * The source node for this link.
    */
  var sourceId: String
  
  /**
    * The target node for this link.
    */
  var targetId: String
}
object GraphDefinitionLink {
  
  inline def apply(sourceId: String, targetId: String): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphDefinitionLink] (val x: Self) extends AnyVal {
    
    inline def setCompartment(value: js.Array[GraphDefinitionLinkCompartment]): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setCompartmentVarargs(value: GraphDefinitionLinkCompartment*): Self = StObject.set(x, "compartment", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSliceName(value: String): Self = StObject.set(x, "sliceName", value.asInstanceOf[js.Any])
    
    inline def setSliceNameUndefined: Self = StObject.set(x, "sliceName", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_params(value: Element): Self = StObject.set(x, "_params", value.asInstanceOf[js.Any])
    
    inline def set_paramsUndefined: Self = StObject.set(x, "_params", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_sliceName(value: Element): Self = StObject.set(x, "_sliceName", value.asInstanceOf[js.Any])
    
    inline def set_sliceNameUndefined: Self = StObject.set(x, "_sliceName", js.undefined)
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
    
    inline def set_targetId(value: Element): Self = StObject.set(x, "_targetId", value.asInstanceOf[js.Any])
    
    inline def set_targetIdUndefined: Self = StObject.set(x, "_targetId", js.undefined)
  }
}
