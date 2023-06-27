package typings.exponentialBackoff

import typings.exponentialBackoff.distOptionsMod.IBackOffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJitterJitterDotfactoryMod {
  
  @JSImport("exponential-backoff/dist/jitter/jitter.factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JitterFactory(options: IBackOffOptions): Jitter = ^.asInstanceOf[js.Dynamic].applyDynamic("JitterFactory")(options.asInstanceOf[js.Any]).asInstanceOf[Jitter]
  
  type Jitter = js.Function1[/* delay */ Double, Double]
}
