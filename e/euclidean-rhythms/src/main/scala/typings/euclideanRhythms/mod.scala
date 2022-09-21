package typings.euclideanRhythms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("euclidean-rhythms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPattern(pulses: Double, steps: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPattern")(pulses.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
