package typings.firebaseAppCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProactiveRefreshMod {
  
  @JSImport("@firebase/app-check/dist/src/proactive-refresh", "Refresher")
  @js.native
  open class Refresher protected () extends StObject {
    def this(
      operation: js.Function0[js.Promise[Any]],
      retryPolicy: js.Function1[/* error */ Any, Boolean],
      getWaitDuration: js.Function0[Double],
      lowerBound: Double,
      upperBound: Double
    ) = this()
    
    /* private */ var getNextRun: Any = js.native
    
    /* private */ val getWaitDuration: Any = js.native
    
    def isRunning(): Boolean = js.native
    
    /* private */ val lowerBound: Any = js.native
    
    /* private */ var nextErrorWaitInterval: Any = js.native
    
    /* private */ val operation: Any = js.native
    
    /* private */ var pending: Any = js.native
    
    /* private */ var process: Any = js.native
    
    /* private */ val retryPolicy: Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ val upperBound: Any = js.native
  }
}
