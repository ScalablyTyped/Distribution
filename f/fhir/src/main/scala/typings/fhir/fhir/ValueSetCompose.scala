package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of the content of the value set (CLD)
  */
@js.native
trait ValueSetCompose extends BackboneElement {
  
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lockedDate'.
    */
  var _lockedDate: js.UndefOr[Element] = js.native
  
  /**
    * Explicitly exclude codes from a code system or other value sets
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.native
  
  /**
    * Whether inactive codes are in the value set
    */
  var inactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Include one or more codes from a code system or other value set(s)
    */
  var include: js.Array[ValueSetComposeInclude] = js.native
  
  /**
    * Fixed date for version-less references (transitive)
    */
  var lockedDate: js.UndefOr[date] = js.native
}
object ValueSetCompose {
  
  @scala.inline
  def apply(include: js.Array[ValueSetComposeInclude]): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
  
  @scala.inline
  implicit class ValueSetComposeOps[Self <: ValueSetCompose] (val x: Self) extends AnyVal {
    
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
    def setIncludeVarargs(value: ValueSetComposeInclude*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[ValueSetComposeInclude]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inactive(value: Element): Self = this.set("_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_inactive: Self = this.set("_inactive", js.undefined)
    
    @scala.inline
    def set_lockedDate(value: Element): Self = this.set("_lockedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lockedDate: Self = this.set("_lockedDate", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: ValueSetComposeInclude*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[ValueSetComposeInclude]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setLockedDate(value: date): Self = this.set("lockedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedDate: Self = this.set("lockedDate", js.undefined)
  }
}
