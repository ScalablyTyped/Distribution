package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchDeadlineSeconds extends StObject {
  
  /**
    * The deadline for requests sent to the worker. If the worker does not respond by this deadline
    * then the request is cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure.
    * Cloud Tasks will retry the task according to the `RetryConfig`.
    * The default is 10 minutes. The deadline must be in the range of 15 seconds and 30 minutes.
    */
  var dispatchDeadlineSeconds: js.UndefOr[Double] = js.undefined
}
object DispatchDeadlineSeconds {
  
  inline def apply(): DispatchDeadlineSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchDeadlineSeconds]
  }
  
  extension [Self <: DispatchDeadlineSeconds](x: Self) {
    
    inline def setDispatchDeadlineSeconds(value: Double): Self = StObject.set(x, "dispatchDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setDispatchDeadlineSecondsUndefined: Self = StObject.set(x, "dispatchDeadlineSeconds", js.undefined)
  }
}
