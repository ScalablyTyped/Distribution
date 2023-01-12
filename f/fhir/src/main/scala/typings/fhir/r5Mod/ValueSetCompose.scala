package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetCompose
  extends StObject
     with BackboneElement {
  
  var _inactive: js.UndefOr[Element] = js.undefined
  
  var _lockedDate: js.UndefOr[Element] = js.undefined
  
  var _property: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Usually this is used to selectively exclude codes that were included by subsumption in the inclusions. Any display names specified for the codes are ignored.
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
  
  /**
    * Note that in the FHIR terminology framework, "deprecated" does not mean inactive, but in some code systems, e.g. LOINC, "deprecated" does mean inactive. Code systems should define what codes are considered to be inactive. If this is not clearly defined (including in the FHIR code system resource), then all codes are assumed to be active.
    * The Value Set Definition specification defines an ActiveOnly element, which is the reverse of this element e.g. (ValueSet.compose.inactive=FALSE) is the same as (VSD.ActiveOnly=TRUE).
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * All the conditions in an include must be true. If a system is listed, all the codes from the system are listed. If one or more filters are listed, all of the filters must apply. If one or more value sets are listed, the codes must be in all the value sets. E.g. each include is 'include all the codes that meet all these conditions'.
    */
  var include: js.Array[ValueSetComposeInclude]
  
  /**
    * With a defined lockedDate the value set is considered "Locked". Otherwise, the value set may have different expansions as underlying code systems and/or value sets evolve.  The interpretation of lockedDate is often dependent on the context - e.g. a SNOMED CT derived value set with a lockedDate will have a different expansion in USA than in UK.  If a value set specifies a version for include and exclude statements, and also specifies a locked date, the specified versions need to be available that date, or the value set will not be usable.
    */
  var lockedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Note that property names can clash, so using a URI is recommended.
    */
  var property: js.UndefOr[js.Array[String]] = js.undefined
}
object ValueSetCompose {
  
  inline def apply(include: js.Array[ValueSetComposeInclude]): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSetCompose] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setInclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setLockedDate(value: String): Self = StObject.set(x, "lockedDate", value.asInstanceOf[js.Any])
    
    inline def setLockedDateUndefined: Self = StObject.set(x, "lockedDate", js.undefined)
    
    inline def setProperty(value: js.Array[String]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: String*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    inline def set_lockedDate(value: Element): Self = StObject.set(x, "_lockedDate", value.asInstanceOf[js.Any])
    
    inline def set_lockedDateUndefined: Self = StObject.set(x, "_lockedDate", js.undefined)
    
    inline def set_property(value: js.Array[Element]): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    inline def set_propertyUndefined: Self = StObject.set(x, "_property", js.undefined)
    
    inline def set_propertyVarargs(value: Element*): Self = StObject.set(x, "_property", js.Array(value*))
  }
}
