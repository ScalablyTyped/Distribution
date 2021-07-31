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
  
  @scala.inline
  def apply(include: js.Array[ValueSetComposeInclude]): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
  
  @scala.inline
  implicit class ValueSetComposeMutableBuilder[Self <: ValueSetCompose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setLockedDate(value: date): Self = StObject.set(x, "lockedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedDateUndefined: Self = StObject.set(x, "lockedDate", js.undefined)
    
    @scala.inline
    def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    @scala.inline
    def set_lockedDate(value: Element): Self = StObject.set(x, "_lockedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lockedDateUndefined: Self = StObject.set(x, "_lockedDate", js.undefined)
  }
}
