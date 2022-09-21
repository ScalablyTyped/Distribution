package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetExpansionContains
  extends StObject
     with BackboneElement {
  
  var _abstract: js.UndefOr[Element] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _inactive: js.UndefOr[Element] = js.undefined
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * This should not be understood to exclude its use for searching (e.g. by subsumption testing). The client should know whether it is appropriate for the user to select an abstract code or not.
    */
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * If the expansion uses this element, there is  no implication about the logical relationship between them, and the  structure cannot be used for logical inferencing. The structure  exists to provide navigational assistance for helping human users to  locate codes in the expansion.
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  
  /**
    * The designations provided must be based on the value set and code system definitions.
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.undefined
  
  /**
    * The recommended display for this item in the expansion.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * This should only have a value if the concept is inactive.
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An absolute URI which is the code system in which the code for this item in the expansion is defined.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * The exact value of the version string is specified by the system from which the code is derived.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetExpansionContains {
  
  inline def apply(): ValueSetExpansionContains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetExpansionContains]
  }
  
  extension [Self <: ValueSetExpansionContains](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContains(value: js.Array[ValueSetExpansionContains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContainsVarargs(value: ValueSetExpansionContains*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: ValueSetComposeIncludeConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_abstract(value: Element): Self = StObject.set(x, "_abstract", value.asInstanceOf[js.Any])
    
    inline def set_abstractUndefined: Self = StObject.set(x, "_abstract", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
