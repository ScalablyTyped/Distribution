package typings.fpTs

import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBooleanMod {
  
  @JSImport("fp-ts/lib/boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/boolean", "BooleanAlgebra")
  @js.native
  val BooleanAlgebra: typings.fpTs.libBooleanAlgebraMod.BooleanAlgebra[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "Eq")
  @js.native
  val Eq: typings.fpTs.libEqMod.Eq[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "MonoidAll")
  @js.native
  val MonoidAll: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "MonoidAny")
  @js.native
  val MonoidAny: Monoid[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "Ord")
  @js.native
  val Ord: Ord_[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "SemigroupAll")
  @js.native
  val SemigroupAll: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "SemigroupAny")
  @js.native
  val SemigroupAny: Semigroup[Boolean] = js.native
  
  @JSImport("fp-ts/lib/boolean", "Show")
  @js.native
  val Show: typings.fpTs.libShowMod.Show[Boolean] = js.native
  
  inline def fold[A](onFalse: LazyArg[A], onTrue: LazyArg[A]): js.Function1[/* value */ Boolean, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A]]
  
  inline def foldW[A, B](onFalse: LazyArg[A], onTrue: LazyArg[B]): js.Function1[/* value */ Boolean, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A | B]]
  
  @JSImport("fp-ts/lib/boolean", "isBoolean")
  @js.native
  val isBoolean: Refinement[Any, Boolean] = js.native
  
  inline def `match`[A](onFalse: LazyArg[A], onTrue: LazyArg[A]): js.Function1[/* value */ Boolean, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A]]
  
  inline def matchW[A, B](onFalse: LazyArg[A], onTrue: LazyArg[B]): js.Function1[/* value */ Boolean, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A | B]]
}
