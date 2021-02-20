package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The assertion to perform
  */
@js.native
trait TestReportSetupActionAssert extends BackboneElement {
  
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'message'.
    */
  var _message: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.native
  
  /**
    * A link to further details on the result
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.native
  
  /**
    * pass | skip | fail | warning | error
    */
  var result: code = js.native
}
object TestReportSetupActionAssert {
  
  @scala.inline
  def apply(result: code): TestReportSetupActionAssert = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionAssert]
  }
  
  @scala.inline
  implicit class TestReportSetupActionAssertMutableBuilder[Self <: TestReportSetupActionAssert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setMessage(value: markdown): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setResult(value: code): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_detail(value: Element): Self = StObject.set(x, "_detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_detailUndefined: Self = StObject.set(x, "_detail", js.undefined)
    
    @scala.inline
    def set_message(value: Element): Self = StObject.set(x, "_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_messageUndefined: Self = StObject.set(x, "_message", js.undefined)
    
    @scala.inline
    def set_result(value: Element): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resultUndefined: Self = StObject.set(x, "_result", js.undefined)
  }
}
