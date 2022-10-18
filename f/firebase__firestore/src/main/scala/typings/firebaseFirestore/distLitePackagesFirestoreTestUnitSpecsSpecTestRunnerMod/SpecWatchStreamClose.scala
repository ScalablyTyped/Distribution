package typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecWatchStreamClose extends StObject {
  
  var error: SpecError
  
  var runBackoffTimer: Boolean
}
object SpecWatchStreamClose {
  
  inline def apply(error: SpecError, runBackoffTimer: Boolean): SpecWatchStreamClose = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchStreamClose]
  }
  
  extension [Self <: SpecWatchStreamClose](x: Self) {
    
    inline def setError(value: SpecError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setRunBackoffTimer(value: Boolean): Self = StObject.set(x, "runBackoffTimer", value.asInstanceOf[js.Any])
  }
}
