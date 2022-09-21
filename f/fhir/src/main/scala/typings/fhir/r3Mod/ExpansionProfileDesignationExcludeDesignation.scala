package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionProfileDesignationExcludeDesignation
  extends StObject
     with BackboneElement {
  
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * In the absence of a language, all designations are excluded which match the designation.use parameter for this exclude.designation element.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * In the absence of a use, all designations are retained which match the designation.language parameter for this exclude.designation element.
    */
  var use: js.UndefOr[Coding] = js.undefined
}
object ExpansionProfileDesignationExcludeDesignation {
  
  inline def apply(): ExpansionProfileDesignationExcludeDesignation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExcludeDesignation]
  }
  
  extension [Self <: ExpansionProfileDesignationExcludeDesignation](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setUse(value: Coding): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
  }
}
