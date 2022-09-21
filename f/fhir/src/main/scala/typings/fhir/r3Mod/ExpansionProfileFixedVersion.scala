package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`override`
import typings.fhir.fhirStrings.check
import typings.fhir.fhirStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionProfileFixedVersion
  extends StObject
     with BackboneElement {
  
  var _mode: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * How to manage the intersection between a fixed version in a value set, and this fixed version of the system in the expansion profile.
    */
  var mode: default | check | `override`
  
  /**
    * See ''Coding.system'' for further documentation.
    */
  var system: String
  
  /**
    * The version of the code system from which codes in the expansion should be included.
    */
  var version: String
}
object ExpansionProfileFixedVersion {
  
  inline def apply(mode: default | check | `override`, system: String, version: String): ExpansionProfileFixedVersion = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfileFixedVersion]
  }
  
  extension [Self <: ExpansionProfileFixedVersion](x: Self) {
    
    inline def setMode(value: default | check | `override`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def set_mode(value: Element): Self = StObject.set(x, "_mode", value.asInstanceOf[js.Any])
    
    inline def set_modeUndefined: Self = StObject.set(x, "_mode", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
