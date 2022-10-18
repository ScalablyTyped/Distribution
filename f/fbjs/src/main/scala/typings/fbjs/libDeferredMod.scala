package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDeferredMod {
  
  @JSImport("fbjs/lib/Deferred", JSImport.Namespace)
  @js.native
  open class ^[Tvalue, Treason] ()
    extends StObject
       with Deferred[Tvalue, Treason]
  
  @js.native
  trait Deferred[Tvalue, Treason] extends StObject {
    
    def `catch`(): js.Promise[Any] = js.native
    def `catch`(onReject: js.Function1[/* error */ Any, Any]): js.Promise[Any] = js.native
    
    def done(): Unit = js.native
    def done(onFulfill: js.Function1[/* value */ Any, Any]): Unit = js.native
    def done(onFulfill: js.Function1[/* value */ Any, Any], onReject: js.Function1[/* error */ Any, Any]): Unit = js.native
    def done(onFulfill: Null, onReject: js.Function1[/* error */ Any, Any]): Unit = js.native
    def done(onFulfill: Unit, onReject: js.Function1[/* error */ Any, Any]): Unit = js.native
    
    def getPromise(): js.Promise[Any] = js.native
    
    def isSettled(): Boolean = js.native
    
    def reject(reason: Treason): Unit = js.native
    
    def resolve(value: Tvalue): Unit = js.native
    
    def `then`(): js.Promise[Any] = js.native
    def `then`(onFulfill: js.Function1[/* value */ Any, Any]): js.Promise[Any] = js.native
    def `then`(onFulfill: js.Function1[/* value */ Any, Any], onReject: js.Function1[/* error */ Any, Any]): js.Promise[Any] = js.native
    def `then`(onFulfill: Null, onReject: js.Function1[/* error */ Any, Any]): js.Promise[Any] = js.native
    def `then`(onFulfill: Unit, onReject: js.Function1[/* error */ Any, Any]): js.Promise[Any] = js.native
  }
}
