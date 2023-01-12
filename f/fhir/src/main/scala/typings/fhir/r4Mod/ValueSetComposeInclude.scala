package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetComposeInclude
  extends StObject
     with BackboneElement {
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * The list of concepts is considered ordered, though the order might not have any particular significance. Typically, the order of an expansion follows that defined in the compose element.
    */
  var concept: js.UndefOr[js.Array[ValueSetComposeIncludeConcept]] = js.undefined
  
  /**
    * Selecting codes by specifying filters based on properties is only possible where the underlying code system defines appropriate properties. Note that in some cases, the underlying code system defines the logical concepts but not the literal codes for the concepts. In such cases, the literal definitions may be provided by a third party.
    */
  var filter: js.UndefOr[js.Array[ValueSetComposeIncludeFilter]] = js.undefined
  
  /**
    * If there are no codes or filters, the entire code system is included. Note that the set of codes that are included may contain abstract codes. See ''Coding.system'' for further documentation about the correct value for the system element.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * The value set URI is either a logical reference to a defined value set such as a [SNOMED CT reference set](snomedct.html#implicit), or a direct reference to a value set definition using ValueSet.url. The reference might not refer to an actual FHIR ValueSet resource; in this case, whatever is referred to is an implicit definition of a value set that needs to be clear about how versions are resolved.
    */
  var valueSet: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This is used when selecting the descendants of a concept - they may change between versions. If no version is specified, then the exact contents of the value set might not be known until a context of use binds it to a particular version. The special value '*' means all versions; It is at server discretion regarding expansions and which versions must be supported.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetComposeInclude {
  
  inline def apply(): ValueSetComposeInclude = {
    val __obj = js.Dynamic.literal()
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
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setValueSet(value: js.Array[String]): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setValueSetVarargs(value: String*): Self = StObject.set(x, "valueSet", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_valueSet(value: js.Array[Element]): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
    
    inline def set_valueSetVarargs(value: Element*): Self = StObject.set(x, "_valueSet", js.Array(value*))
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
