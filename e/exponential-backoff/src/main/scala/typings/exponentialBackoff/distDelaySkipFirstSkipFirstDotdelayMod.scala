package typings.exponentialBackoff

import typings.exponentialBackoff.distDelayDelayDotbaseMod.Delay
import typings.exponentialBackoff.distOptionsMod.IBackOffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelaySkipFirstSkipFirstDotdelayMod {
  
  @JSImport("exponential-backoff/dist/delay/skip-first/skip-first.delay", "SkipFirstDelay")
  @js.native
  open class SkipFirstDelay protected () extends Delay {
    def this(options: IBackOffOptions) = this()
    
    /* private */ val isFirstAttempt: Any = js.native
  }
}
