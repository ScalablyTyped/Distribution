package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a parameter to a module
  */
@js.native
trait ParameterDefinition extends Element {
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  
  /**
    * A brief description of the parameter
    */
  var documentation: js.UndefOr[String] = js.native
  
  /**
    * Maximum cardinality (a number of *)
    */
  var max: js.UndefOr[String] = js.native
  
  /**
    * Minimum cardinality
    */
  var min: js.UndefOr[integer] = js.native
  
  /**
    * Name used to access the parameter value
    */
  var name: js.UndefOr[code] = js.native
  
  /**
    * What profile the value is expected to be
    */
  var profile: js.UndefOr[Reference] = js.native
  
  /**
    * What type of value
    */
  var `type`: code = js.native
  
  /**
    * in | out
    */
  var use: code = js.native
}
object ParameterDefinition {
  
  @scala.inline
  def apply(`type`: code, use: code): ParameterDefinition = {
    val __obj = js.Dynamic.literal(use = use.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
  
  @scala.inline
  implicit class ParameterDefinitionOps[Self <: ParameterDefinition] (val x: Self) extends AnyVal {
    
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
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    
    @scala.inline
    def set_max(value: Element): Self = this.set("_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_max: Self = this.set("_max", js.undefined)
    
    @scala.inline
    def set_min(value: Element): Self = this.set("_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_min: Self = this.set("_min", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: integer): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: code): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfile(value: Reference): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
}
