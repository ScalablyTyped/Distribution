package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetup
  extends StObject
     with BackboneElement {
  
  /**
    * Action would contain either an operation or an assertion.
    */
  var action: js.Array[TestScriptSetupAction]
  
  /**
    * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
    */
  var metadata: js.UndefOr[TestScriptMetadata] = js.undefined
}
object TestScriptSetup {
  
  inline def apply(action: js.Array[TestScriptSetupAction]): TestScriptSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetup]
  }
  
  extension [Self <: TestScriptSetup](x: Self) {
    
    inline def setAction(value: js.Array[TestScriptSetupAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: TestScriptSetupAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setMetadata(value: TestScriptMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
