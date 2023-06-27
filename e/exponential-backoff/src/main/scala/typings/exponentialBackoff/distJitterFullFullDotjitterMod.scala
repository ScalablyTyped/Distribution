package typings.exponentialBackoff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJitterFullFullDotjitterMod {
  
  @JSImport("exponential-backoff/dist/jitter/full/full.jitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fullJitter(delay: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fullJitter")(delay.asInstanceOf[js.Any]).asInstanceOf[Double]
}
