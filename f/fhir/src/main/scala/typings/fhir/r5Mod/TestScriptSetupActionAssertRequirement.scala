package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssertRequirement
  extends StObject
     with BackboneElement {
  
  var _linkCanonical: js.UndefOr[Element] = js.undefined
  
  var _linkUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Link or reference providing traceability to the testing requirement for this test.
    */
  var linkCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Link or reference providing traceability to the testing requirement for this test.
    */
  var linkUri: js.UndefOr[String] = js.undefined
}
object TestScriptSetupActionAssertRequirement {
  
  inline def apply(): TestScriptSetupActionAssertRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionAssertRequirement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupActionAssertRequirement] (val x: Self) extends AnyVal {
    
    inline def setLinkCanonical(value: String): Self = StObject.set(x, "linkCanonical", value.asInstanceOf[js.Any])
    
    inline def setLinkCanonicalUndefined: Self = StObject.set(x, "linkCanonical", js.undefined)
    
    inline def setLinkUri(value: String): Self = StObject.set(x, "linkUri", value.asInstanceOf[js.Any])
    
    inline def setLinkUriUndefined: Self = StObject.set(x, "linkUri", js.undefined)
    
    inline def set_linkCanonical(value: Element): Self = StObject.set(x, "_linkCanonical", value.asInstanceOf[js.Any])
    
    inline def set_linkCanonicalUndefined: Self = StObject.set(x, "_linkCanonical", js.undefined)
    
    inline def set_linkUri(value: Element): Self = StObject.set(x, "_linkUri", value.asInstanceOf[js.Any])
    
    inline def set_linkUriUndefined: Self = StObject.set(x, "_linkUri", js.undefined)
  }
}
