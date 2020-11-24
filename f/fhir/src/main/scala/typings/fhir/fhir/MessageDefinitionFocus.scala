package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource(s) that are the subject of the event
  */
@js.native
trait MessageDefinitionFocus extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  
  /**
    * Type of resource
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Maximum number of focuses of this type
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * Minimum number of focuses of this type
    */
  var min: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Profile that must be adhered to by focus
    */
  var profile: js.UndefOr[Reference] = js.native
}
object MessageDefinitionFocus {
  
  @scala.inline
  def apply(code: code): MessageDefinitionFocus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionFocus]
  }
  
  @scala.inline
  implicit class MessageDefinitionFocusOps[Self <: MessageDefinitionFocus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: unsignedInt): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setProfile(value: Reference): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
}
