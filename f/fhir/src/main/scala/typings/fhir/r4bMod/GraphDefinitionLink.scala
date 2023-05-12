package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphDefinitionLink
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _sliceName: js.UndefOr[Element] = js.undefined
  
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
    * The path expression cannot contain a resolve() function. If there is no path, the link is a reverse lookup, using target.params. If the path is "*" then this means all references in the resource.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Which slice (if profiled).
    */
  var sliceName: js.UndefOr[String] = js.undefined
  
  /**
    * Potential target for the link.
    */
  var target: js.UndefOr[js.Array[GraphDefinitionLinkTarget]] = js.undefined
}
object GraphDefinitionLink {
  
  inline def apply(): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphDefinitionLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphDefinitionLink] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSliceName(value: String): Self = StObject.set(x, "sliceName", value.asInstanceOf[js.Any])
    
    inline def setSliceNameUndefined: Self = StObject.set(x, "sliceName", js.undefined)
    
    inline def setTarget(value: js.Array[GraphDefinitionLinkTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: GraphDefinitionLinkTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_sliceName(value: Element): Self = StObject.set(x, "_sliceName", value.asInstanceOf[js.Any])
    
    inline def set_sliceNameUndefined: Self = StObject.set(x, "_sliceName", js.undefined)
  }
}
