package typings.fastSimplexNoise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-simplex-noise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNoise2D(): js.Function2[/* x */ Double, /* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise2D")().asInstanceOf[js.Function2[/* x */ Double, /* y */ Double, Double]]
  inline def makeNoise2D(random: js.Function0[Double]): js.Function2[/* x */ Double, /* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise2D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* x */ Double, /* y */ Double, Double]]
  
  inline def makeNoise3D(): js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise3D")().asInstanceOf[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double]]
  inline def makeNoise3D(random: js.Function0[Double]): js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise3D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Double]]
  
  inline def makeNoise4D(): js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise4D")().asInstanceOf[js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double]]
  inline def makeNoise4D(random: js.Function0[Double]): js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise4D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double]]
}
