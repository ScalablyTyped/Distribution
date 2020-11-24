package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Links this graph makes rules about
  */
@js.native
trait GraphDefinitionLink extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sliceName'.
    */
  var _sliceName: js.UndefOr[Element] = js.native
  
  /**
    * Why this link is specified
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Maximum occurrences for this link
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * Minimum occurrences for this link
    */
  var min: js.UndefOr[integer] = js.native
  
  /**
    * Path in the resource that contains the link
    */
  var path: String = js.native
  
  /**
    * Which slice (if profiled)
    */
  var sliceName: js.UndefOr[String] = js.native
  
  /**
    * Potential target for the link
    */
  var target: js.Array[GraphDefinitionLinkTarget] = js.native
}
object GraphDefinitionLink {
  
  @scala.inline
  def apply(path: String, target: js.Array[GraphDefinitionLinkTarget]): GraphDefinitionLink = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLink]
  }
  
  @scala.inline
  implicit class GraphDefinitionLinkOps[Self <: GraphDefinitionLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: GraphDefinitionLinkTarget*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[GraphDefinitionLinkTarget]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    
    @scala.inline
    def set_sliceName(value: Element): Self = this.set("_sliceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sliceName: Self = this.set("_sliceName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setSliceName(value: String): Self = this.set("sliceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliceName: Self = this.set("sliceName", js.undefined)
  }
}
