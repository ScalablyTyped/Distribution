package typings.fpTs.mod

import typings.fpTs.libEndomorphismMod.Endomorphism
import typings.fpTs.libMagmaMod.Magma
import typings.fpTs.libPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object magma {
  
  @JSImport("fp-ts", "magma")
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[A](M: Magma[A]): js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]]]
  
  inline def endo[A](f: Endomorphism[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endo")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def filterFirst[A](predicate: Predicate[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def filterSecond[A](predicate: Predicate[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSecond")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def reverse[A](M: Magma[A]): Magma[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(M.asInstanceOf[js.Any]).asInstanceOf[Magma[A]]
}
