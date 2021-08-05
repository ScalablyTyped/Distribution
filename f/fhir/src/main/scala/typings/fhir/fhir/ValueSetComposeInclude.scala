package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Include one or more codes from a code system or other value set(s)
  */
trait ValueSetComposeInclude
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * A concept defined in the system
    */
  var concept: js.UndefOr[js.Array[ValueSetComposeIncludeConcept]] = js.undefined
  
  /**
    * Select codes/concepts by their properties (including relationships)
    */
  var filter: js.UndefOr[js.Array[ValueSetComposeIncludeFilter]] = js.undefined
  
  /**
    * The system the codes come from
    */
  var system: js.UndefOr[uri] = js.undefined
  
  /**
    * Select only contents included in this value set
    */
  var valueSet: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetComposeInclude {
  
  inline def apply(): ValueSetComposeInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetComposeInclude]
  }
  
  extension [Self <: ValueSetComposeInclude](x: Self) {
    
    inline def setConcept(value: js.Array[ValueSetComposeIncludeConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: ValueSetComposeIncludeConcept*): Self = StObject.set(x, "concept", js.Array(value :_*))
    
    inline def setFilter(value: js.Array[ValueSetComposeIncludeFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: ValueSetComposeIncludeFilter*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setValueSet(value: js.Array[uri]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setValueSetVarargs(value: uri*): Self = StObject.set(x, "valueSet", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_valueSet(value: js.Array[Element]): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
    
    inline def set_valueSetVarargs(value: Element*): Self = StObject.set(x, "_valueSet", js.Array(value :_*))
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
