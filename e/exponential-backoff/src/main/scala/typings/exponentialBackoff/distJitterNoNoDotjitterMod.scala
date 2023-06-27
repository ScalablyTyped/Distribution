package typings.exponentialBackoff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJitterNoNoDotjitterMod {
  
  @JSImport("exponential-backoff/dist/jitter/no/no.jitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noJitter(delay: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("noJitter")(delay.asInstanceOf[js.Any]).asInstanceOf[Double]
}
