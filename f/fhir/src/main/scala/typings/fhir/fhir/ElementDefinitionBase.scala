package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base definition information for tools
  */
trait ElementDefinitionBase
  extends StObject
     with Element {
  
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
    * Max cardinality of the base element
    */
  var max: String
  
  /**
    * Min cardinality of the base element
    */
  var min: unsignedInt
  
  /**
    * Path that identifies the base element
    */
  var path: String
}
object ElementDefinitionBase {
  
  @scala.inline
  def apply(max: String, min: unsignedInt, path: String): ElementDefinitionBase = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBase]
  }
  
  @scala.inline
  implicit class ElementDefinitionBaseMutableBuilder[Self <: ElementDefinitionBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: unsignedInt): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
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
  }
}
