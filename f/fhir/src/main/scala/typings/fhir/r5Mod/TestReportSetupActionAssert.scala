package typings.fhir.r5Mod

import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.fail
import typings.fhir.fhirStrings.pass
import typings.fhir.fhirStrings.skip
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportSetupActionAssert
  extends StObject
     with BackboneElement {
  
  var _detail: js.UndefOr[Element] = js.undefined
  
  var _message: js.UndefOr[Element] = js.undefined
  
  var _result: js.UndefOr[Element] = js.undefined
  
  /**
    * A link to further details on the result.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * An explanatory message associated with the result.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * TestScript and TestReport instances are typically (and expected to be) based on known, defined test requirements and documentation. These links provide traceability from the executable/executed TestScript and TestReport tests to these requirements.
    */
  var requirement: js.UndefOr[js.Array[TestReportSetupActionAssertRequirement]] = js.undefined
  
  /**
    * The result of this assertion.
    */
  var result: pass | skip | fail | warning | error
}
object TestReportSetupActionAssert {
  
  inline def apply(result: pass | skip | fail | warning | error): TestReportSetupActionAssert = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionAssert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportSetupActionAssert] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRequirement(value: js.Array[TestReportSetupActionAssertRequirement]): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setRequirementUndefined: Self = StObject.set(x, "requirement", js.undefined)
    
    inline def setRequirementVarargs(value: TestReportSetupActionAssertRequirement*): Self = StObject.set(x, "requirement", js.Array(value*))
    
    inline def setResult(value: pass | skip | fail | warning | error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def set_detail(value: Element): Self = StObject.set(x, "_detail", value.asInstanceOf[js.Any])
    
    inline def set_detailUndefined: Self = StObject.set(x, "_detail", js.undefined)
    
    inline def set_message(value: Element): Self = StObject.set(x, "_message", value.asInstanceOf[js.Any])
    
    inline def set_messageUndefined: Self = StObject.set(x, "_message", js.undefined)
    
    inline def set_result(value: Element): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
    
    inline def set_resultUndefined: Self = StObject.set(x, "_result", js.undefined)
  }
}
