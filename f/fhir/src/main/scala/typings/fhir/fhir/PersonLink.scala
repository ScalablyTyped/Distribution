package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Link to a resource that concerns the same actual person
  */
@js.native
trait PersonLink extends BackboneElement {
  
  /**
    * Contains extended information for property 'assurance'.
    */
  var _assurance: js.UndefOr[Element] = js.native
  
  /**
    * level1 | level2 | level3 | level4
    */
  var assurance: js.UndefOr[code] = js.native
  
  /**
    * The resource to which this actual person is associated
    */
  var target: Reference = js.native
}
object PersonLink {
  
  @scala.inline
  def apply(target: Reference): PersonLink = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonLink]
  }
  
  @scala.inline
  implicit class PersonLinkOps[Self <: PersonLink] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Reference): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_assurance(value: Element): Self = this.set("_assurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_assurance: Self = this.set("_assurance", js.undefined)
    
    @scala.inline
    def setAssurance(value: code): Self = this.set("assurance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssurance: Self = this.set("assurance", js.undefined)
  }
}
