package typings.exponentialBackoff

import typings.exponentialBackoff.distDelayDelayDotinterfaceMod.IDelay
import typings.exponentialBackoff.distOptionsMod.IBackOffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelayDelayDotbaseMod {
  
  /* note: abstract class */ @JSImport("exponential-backoff/dist/delay/delay.base", "Delay")
  @js.native
  open class Delay protected ()
    extends StObject
       with IDelay {
    def this(options: IBackOffOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(): js.Promise[Any] = js.native
    
    /* protected */ var attempt: Double = js.native
    
    /* private */ val delay: Any = js.native
    
    /* private */ val jitteredDelay: Any = js.native
    
    /* protected */ val numOfDelayedAttempts: Double = js.native
    
    /* private */ var options: Any = js.native
    
    /* CompleteClass */
    override def setAttemptNumber(attempt: Double): Unit = js.native
  }
}
