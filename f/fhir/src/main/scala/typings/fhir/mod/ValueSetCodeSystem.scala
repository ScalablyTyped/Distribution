package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetCodeSystem
  extends StObject
     with BackboneElement {
  
  var _caseSensitive: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * If code comparison is case sensitive when codes within this system are compared to each other.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are.
    */
  var concept: js.Array[ValueSetCodeSystemConcept]
  
  /**
    * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system.
    */
  var system: String
  
  /**
    * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetCodeSystem {
  
  inline def apply(concept: js.Array[ValueSetCodeSystemConcept], system: String): ValueSetCodeSystem = {
    val __obj = js.Dynamic.literal(concept = concept.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCodeSystem]
  }
  
  extension [Self <: ValueSetCodeSystem](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setConcept(value: js.Array[ValueSetCodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptVarargs(value: ValueSetCodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_caseSensitive(value: Element): Self = StObject.set(x, "_caseSensitive", value.asInstanceOf[js.Any])
    
    inline def set_caseSensitiveUndefined: Self = StObject.set(x, "_caseSensitive", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
