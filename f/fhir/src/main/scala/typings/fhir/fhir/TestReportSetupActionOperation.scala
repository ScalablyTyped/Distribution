package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The operation to perform
  */
trait TestReportSetupActionOperation
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'message'.
    */
  var _message: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.undefined
  
  /**
    * A link to further details on the result
    */
  var detail: js.UndefOr[uri] = js.undefined
  
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.undefined
  
  /**
    * pass | skip | fail | warning | error
    */
  var result: code
}
object TestReportSetupActionOperation {
  
  @scala.inline
  def apply(result: code): TestReportSetupActionOperation = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionOperation]
  }
  
  @scala.inline
  implicit class TestReportSetupActionOperationMutableBuilder[Self <: TestReportSetupActionOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: uri): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
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
