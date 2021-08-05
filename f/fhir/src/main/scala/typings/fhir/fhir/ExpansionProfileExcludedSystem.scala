package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems/Versions to be exclude
  */
trait ExpansionProfileExcludedSystem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The specific code system to be excluded
    */
  var system: uri
  
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.undefined
}
object ExpansionProfileExcludedSystem {
  
  inline def apply(system: uri): ExpansionProfileExcludedSystem = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfileExcludedSystem]
  }
  
  extension [Self <: ExpansionProfileExcludedSystem](x: Self) {
    
    inline def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
