package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportTestAction
  extends StObject
     with BackboneElement {
  
  /**
    * The results of the assertion performed on the previous operations.
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.undefined
  
  /**
    * An operation would involve a REST request to a server.
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.undefined
}
object TestReportTestAction {
  
  inline def apply(): TestReportTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportTestAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestReportTestAction] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: TestReportSetupActionAssert): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
    
    inline def setOperation(value: TestReportSetupActionOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
