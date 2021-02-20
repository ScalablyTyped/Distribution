package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional representations for this concept
  */
@js.native
trait ValueSetComposeIncludeConceptDesignation extends BackboneElement {
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * Human language of the designation
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * Details how this designation would be used
    */
  var use: js.UndefOr[Coding] = js.native
  
  /**
    * The text value for this designation
    */
  var value: String = js.native
}
object ValueSetComposeIncludeConceptDesignation {
  
  @scala.inline
  def apply(value: String): ValueSetComposeIncludeConceptDesignation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeConceptDesignation]
  }
  
  @scala.inline
  implicit class ValueSetComposeIncludeConceptDesignationMutableBuilder[Self <: ValueSetComposeIncludeConceptDesignation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setUse(value: Coding): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
