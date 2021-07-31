package typings.fpTs

import typings.fpTs.heytingAlgebraMod.HeytingAlgebra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanAlgebraMod {
  
  @JSImport("fp-ts/lib/BooleanAlgebra", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/BooleanAlgebra", "booleanAlgebraBoolean")
  @js.native
  val booleanAlgebraBoolean: BooleanAlgebra[Boolean] = js.native
  
  @JSImport("fp-ts/lib/BooleanAlgebra", "booleanAlgebraVoid")
  @js.native
  val booleanAlgebraVoid: BooleanAlgebra[Unit] = js.native
  
  @scala.inline
  def getDualBooleanAlgebra[A](B: BooleanAlgebra[A]): BooleanAlgebra[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualBooleanAlgebra")(B.asInstanceOf[js.Any]).asInstanceOf[BooleanAlgebra[A]]
  
  @scala.inline
  def getFunctionBooleanAlgebra[B](B: BooleanAlgebra[B]): js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionBooleanAlgebra")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]]]
  
  type BooleanAlgebra[A] = HeytingAlgebra[A]
}
