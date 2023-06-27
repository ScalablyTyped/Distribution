package typings.exponentialBackoff

import typings.exponentialBackoff.distDelayDelayDotinterfaceMod.IDelay
import typings.exponentialBackoff.distOptionsMod.IBackOffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelayDelayDotfactoryMod {
  
  @JSImport("exponential-backoff/dist/delay/delay.factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DelayFactory(options: IBackOffOptions, attempt: Double): IDelay = (^.asInstanceOf[js.Dynamic].applyDynamic("DelayFactory")(options.asInstanceOf[js.Any], attempt.asInstanceOf[js.Any])).asInstanceOf[IDelay]
}
