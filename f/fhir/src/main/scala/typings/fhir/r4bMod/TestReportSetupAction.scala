package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportSetupAction
  extends StObject
     with BackboneElement {
  
  /**
    * The results of the assertion performed on the previous operations.
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.undefined
  
  /**
    * The operation performed.
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.undefined
}
object TestReportSetupAction {
  
  inline def apply(): TestReportSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportSetupAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportSetupAction] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: TestReportSetupActionAssert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
