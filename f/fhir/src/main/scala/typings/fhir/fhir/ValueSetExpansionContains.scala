package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Codes in the value set
  */
@js.native
trait ValueSetExpansionContains extends BackboneElement {
  
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * If user cannot select this entry
    */
  var `abstract`: js.UndefOr[Boolean] = js.native
  
  /**
    * Code - if blank, this is not a selectable code
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  
  /**
    * Codes contained under this entry
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.native
  
  /**
    * Additional representations for this item
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.native
  
  /**
    * User display for the concept
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * If concept is inactive in the code system
    */
  var inactive: js.UndefOr[Boolean] = js.native
  
  /**
    * System value for the code
    */
  var system: js.UndefOr[uri] = js.native
  
  /**
    * Version in which this code/display is defined
    */
  var version: js.UndefOr[String] = js.native
}
object ValueSetExpansionContains {
  
  @scala.inline
  def apply(): ValueSetExpansionContains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetExpansionContains]
  }
  
  @scala.inline
  implicit class ValueSetExpansionContainsOps[Self <: ValueSetExpansionContains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_abstract(value: Element): Self = this.set("_abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_abstract: Self = this.set("_abstract", js.undefined)
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    
    @scala.inline
    def set_inactive(value: Element): Self = this.set("_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_inactive: Self = this.set("_inactive", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbstract: Self = this.set("abstract", js.undefined)
    
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContainsVarargs(value: ValueSetExpansionContains*): Self = this.set("contains", js.Array(value :_*))
    
    @scala.inline
    def setContains(value: js.Array[ValueSetExpansionContains]): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: ValueSetComposeIncludeConceptDesignation*): Self = this.set("designation", js.Array(value :_*))
    
    @scala.inline
    def setDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = this.set("designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignation: Self = this.set("designation", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
