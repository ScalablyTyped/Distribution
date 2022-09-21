package typings.fastSimplexNoise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `4dMod` {
  
  @JSImport("fast-simplex-noise/lib/4d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNoise4D(): js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise4D")().asInstanceOf[js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double]]
  inline def makeNoise4D(random: js.Function0[Double]): js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNoise4D")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Double]]
}
