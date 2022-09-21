package typings.fastSimplexNoise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `2dMod` {
  
  @JSImport("fast-simplex-noise/lib/2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNoise2D(): js.Function2[/* x */ Double, /* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise2D")().asInstanceOf[js.Function2[/* x */ Double, /* y */ Double, Double]]
  inline def makeNoise2D(random: js.Function0[Double]): js.Function2[/* x */ Double, /* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise2D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ Double, /* y */ Double, Double]]
}
