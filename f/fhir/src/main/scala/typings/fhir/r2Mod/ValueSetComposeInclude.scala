package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetComposeInclude
  extends StObject
     with BackboneElement {
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Specifies a concept to be included or excluded.
    */
  var concept: js.UndefOr[js.Array[ValueSetComposeIncludeConcept]] = js.undefined
  
  /**
    * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
    */
  var filter: js.UndefOr[js.Array[ValueSetComposeIncludeFilter]] = js.undefined
  
  /**
    * An absolute URI which is the code system from which the selected codes come from.
    */
  var system: String
  
  /**
    * The version of the code system that the codes are selected from.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetComposeInclude {
  
  inline def apply(system: String): ValueSetComposeInclude = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeInclude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSetComposeInclude] (val x: Self) extends AnyVal {
    
    inline def setConcept(value: js.Array[ValueSetComposeIncludeConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: ValueSetComposeIncludeConcept*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setFilter(value: js.Array[ValueSetComposeIncludeFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: ValueSetComposeIncludeFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
