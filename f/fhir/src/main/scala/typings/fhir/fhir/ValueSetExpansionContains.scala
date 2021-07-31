package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Codes in the value set
  */
trait ValueSetExpansionContains
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * If user cannot select this entry
    */
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Code - if blank, this is not a selectable code
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  
  /**
    * Codes contained under this entry
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  
  /**
    * Additional representations for this item
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.undefined
  
  /**
    * User display for the concept
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * If concept is inactive in the code system
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * System value for the code
    */
  var system: js.UndefOr[uri] = js.undefined
  
  /**
    * Version in which this code/display is defined
    */
  var version: js.UndefOr[String] = js.undefined
}
object ValueSetExpansionContains {
  
  @scala.inline
  def apply(): ValueSetExpansionContains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetExpansionContains]
  }
  
  @scala.inline
  implicit class ValueSetExpansionContainsMutableBuilder[Self <: ValueSetExpansionContains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContains(value: js.Array[ValueSetExpansionContains]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setContainsVarargs(value: ValueSetExpansionContains*): Self = StObject.set(x, "contains", js.Array(value :_*))
    
    @scala.inline
    def setDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: ValueSetComposeIncludeConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_abstract(value: Element): Self = StObject.set(x, "_abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_abstractUndefined: Self = StObject.set(x, "_abstract", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    @scala.inline
    def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
