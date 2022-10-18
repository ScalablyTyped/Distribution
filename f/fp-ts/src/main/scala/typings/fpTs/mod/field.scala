package typings.fpTs.mod

import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFieldMod.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object field {
  
  @JSImport("fp-ts", "field")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "field.fieldNumber")
  @js.native
  val fieldNumber: Field[Double] = js.native
  
  inline def gcd[A](E: Eq[A], field: Field[A]): js.Function2[/* x */ A, /* y */ A, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("gcd")(E.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
  
  inline def lcm[A](E: Eq[A], F: Field[A]): js.Function2[/* x */ A, /* y */ A, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lcm")(E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
}
