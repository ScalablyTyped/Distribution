package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The designation to be excluded
  */
@js.native
trait ExpansionProfileDesignationExcludeDesignation extends BackboneElement {
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Human language of the designation to be excluded
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * What kind of Designation to exclude
    */
  var use: js.UndefOr[Coding] = js.native
}
object ExpansionProfileDesignationExcludeDesignation {
  
  @scala.inline
  def apply(): ExpansionProfileDesignationExcludeDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExcludeDesignation]
  }
  
  @scala.inline
  implicit class ExpansionProfileDesignationExcludeDesignationOps[Self <: ExpansionProfileDesignationExcludeDesignation] (val x: Self) extends AnyVal {
    
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
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    
    @scala.inline
    def setLanguage(value: code): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setUse(value: Coding): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
