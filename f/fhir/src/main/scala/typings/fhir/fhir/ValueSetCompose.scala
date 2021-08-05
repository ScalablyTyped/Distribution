package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of the content of the value set (CLD)
  */
trait ValueSetCompose
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lockedDate'.
    */
  var _lockedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Explicitly exclude codes from a code system or other value sets
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
  
  /**
    * Whether inactive codes are in the value set
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include one or more codes from a code system or other value set(s)
    */
  var include: js.Array[ValueSetComposeInclude]
  
  /**
    * Fixed date for version-less references (transitive)
    */
  var lockedDate: js.UndefOr[date] = js.undefined
}
object ValueSetCompose {
  
  inline def apply(include: js.Array[ValueSetComposeInclude]): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
  
  extension [Self <: ValueSetCompose](x: Self) {
    
    inline def setExclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setInclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    inline def setLockedDate(value: date): Self = StObject.set(x, "lockedDate", value.asInstanceOf[js.Any])
    
    inline def setLockedDateUndefined: Self = StObject.set(x, "lockedDate", js.undefined)
    
    inline def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    inline def set_lockedDate(value: Element): Self = StObject.set(x, "_lockedDate", value.asInstanceOf[js.Any])
    
    inline def set_lockedDateUndefined: Self = StObject.set(x, "_lockedDate", js.undefined)
  }
}
