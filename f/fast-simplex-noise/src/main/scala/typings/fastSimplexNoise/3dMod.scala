package typings.fastSimplexNoise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3dMod` {
  
  @JSImport("fast-simplex-noise/lib/3d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNoise3D(): js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise3D")().asInstanceOf[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double]]
  inline def makeNoise3D(random: js.Function0[Double]): js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise3D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double]]
}
