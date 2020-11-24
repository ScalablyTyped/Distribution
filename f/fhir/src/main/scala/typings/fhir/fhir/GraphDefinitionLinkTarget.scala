package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Potential target for the link
  */
@js.native
trait GraphDefinitionLinkTarget extends BackboneElement {
  
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Compartment Consistency Rules
    */
  var compartment: js.UndefOr[js.Array[GraphDefinitionLinkTargetCompartment]] = js.native
  
  /**
    * Additional links from target resource
    */
  var link: js.UndefOr[js.Array[GraphDefinitionLink]] = js.native
  
  /**
    * Profile for the target resource
    */
  var profile: js.UndefOr[uri] = js.native
  
  /**
    * Type of resource this link refers to
    */
  var `type`: code = js.native
}
object GraphDefinitionLinkTarget {
  
  @scala.inline
  def apply(`type`: code): GraphDefinitionLinkTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTarget]
  }
  
  @scala.inline
  implicit class GraphDefinitionLinkTargetOps[Self <: GraphDefinitionLinkTarget] (val x: Self) extends AnyVal {
    
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_profile(value: Element): Self = this.set("_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_profile: Self = this.set("_profile", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setCompartmentVarargs(value: GraphDefinitionLinkTargetCompartment*): Self = this.set("compartment", js.Array(value :_*))
    
    @scala.inline
    def setCompartment(value: js.Array[GraphDefinitionLinkTargetCompartment]): Self = this.set("compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompartment: Self = this.set("compartment", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: GraphDefinitionLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[GraphDefinitionLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setProfile(value: uri): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
}
