package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems/Versions to be exclude
  */
@js.native
trait ExpansionProfileExcludedSystem extends BackboneElement {
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * The specific code system to be excluded
    */
  var system: uri = js.native
  
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.native
}
object ExpansionProfileExcludedSystem {
  
  @scala.inline
  def apply(system: uri): ExpansionProfileExcludedSystem = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfileExcludedSystem]
  }
  
  @scala.inline
  implicit class ExpansionProfileExcludedSystemOps[Self <: ExpansionProfileExcludedSystem] (val x: Self) extends AnyVal {
    
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
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
