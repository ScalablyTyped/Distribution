package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Links this graph makes rules about
  */
trait GraphDefinitionLink
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sliceName'.
    */
  var _sliceName: js.UndefOr[Element] = js.undefined
  
  /**
    * Why this link is specified
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum occurrences for this link
    */
  var max: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum occurrences for this link
    */
  var min: js.UndefOr[integer] = js.undefined
  
  /**
    * Path in the resource that contains the link
    */
  var path: String
  
  /**
    * Which slice (if profiled)
    */
  var sliceName: js.UndefOr[String] = js.undefined
  
  /**
    * Potential target for the link
    */
  var target: js.Array[GraphDefinitionLinkTarget]
}
object GraphDefinitionLink {
  
  @scala.inline
  def apply(path: String, target: js.Array[GraphDefinitionLinkTarget]): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLink]
  }
  
  @scala.inline
  implicit class GraphDefinitionLinkMutableBuilder[Self <: GraphDefinitionLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceName(value: String): Self = StObject.set(x, "sliceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceNameUndefined: Self = StObject.set(x, "sliceName", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Array[GraphDefinitionLinkTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: GraphDefinitionLinkTarget*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = StObject.set(x, "_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_minUndefined: Self = StObject.set(x, "_min", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    @scala.inline
    def set_sliceName(value: Element): Self = StObject.set(x, "_sliceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sliceNameUndefined: Self = StObject.set(x, "_sliceName", js.undefined)
  }
}
