package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The designation to be included
  */
@js.native
trait ExpansionProfileDesignationIncludeDesignation extends BackboneElement {
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Human language of the designation to be included
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * What kind of Designation to include
    */
  var use: js.UndefOr[Coding] = js.native
}
object ExpansionProfileDesignationIncludeDesignation {
  
  @scala.inline
  def apply(): ExpansionProfileDesignationIncludeDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationIncludeDesignation]
  }
  
  @scala.inline
  implicit class ExpansionProfileDesignationIncludeDesignationMutableBuilder[Self <: ExpansionProfileDesignationIncludeDesignation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setUse(value: Coding): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
  }
}
