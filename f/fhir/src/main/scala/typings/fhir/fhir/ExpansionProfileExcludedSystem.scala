package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class ExpansionProfileExcludedSystemMutableBuilder[Self <: ExpansionProfileExcludedSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
