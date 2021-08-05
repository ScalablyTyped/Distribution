package typings.fpTs

import typings.fpTs.anon.AA
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.booleanAlgebraMod.BooleanAlgebra
import typings.fpTs.boundedMod.Bounded
import typings.fpTs.contravariantMod.Contravariant2
import typings.fpTs.eqMod.Eq
import typings.fpTs.functorMod.Functor2
import typings.fpTs.heytingAlgebraMod.HeytingAlgebra
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.ordMod.Ord_
import typings.fpTs.ringMod.Ring
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.semiringMod.Semiring
import typings.fpTs.showMod.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod {
  
  @JSImport("fp-ts/lib/Const", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Const", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.constMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Const", "Contravariant")
  @js.native
  val Contravariant: Contravariant2[typings.fpTs.constMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Const", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.constMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Const", "URI")
  @js.native
  val URI: /* "Const" */ String = js.native
  type URI = /* "Const" */ String
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Const_[E, A], Const_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Const_[E, A], Const_[G, B]]]
  
  @JSImport("fp-ts/lib/Const", "const_")
  @js.native
  val const: Functor2[typings.fpTs.constMod.URI] & Contravariant2[typings.fpTs.constMod.URI] & Bifunctor2[typings.fpTs.constMod.URI] = js.native
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Const_[js.Any, A], Const_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[js.Any, A], Const_[js.Any, B]]]
  
  inline def getApplicative[E](M: Monoid[E]): Applicative2C[typings.fpTs.constMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(M.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.constMod.URI, E]]
  
  inline def getApply[E](S: Semigroup[E]): Apply2C[typings.fpTs.constMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[typings.fpTs.constMod.URI, E]]
  
  inline def getBooleanAlgebra[E, A](H: BooleanAlgebra[E]): BooleanAlgebra[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanAlgebra")(H.asInstanceOf[js.Any]).asInstanceOf[BooleanAlgebra[Const_[E, A]]]
  
  inline def getBounded[E, A](B: Bounded[E]): Bounded[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounded")(B.asInstanceOf[js.Any]).asInstanceOf[Bounded[Const_[E, A]]]
  
  inline def getEq[E, A](E: Eq[E]): Eq[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(E.asInstanceOf[js.Any]).asInstanceOf[Eq[Const_[E, A]]]
  
  inline def getHeytingAlgebra[E, A](H: HeytingAlgebra[E]): HeytingAlgebra[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeytingAlgebra")(H.asInstanceOf[js.Any]).asInstanceOf[HeytingAlgebra[Const_[E, A]]]
  
  inline def getMonoid[E, A](M: Monoid[E]): Monoid[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Const_[E, A]]]
  
  inline def getOrd[E, A](O: Ord_[E]): Ord_[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrd")(O.asInstanceOf[js.Any]).asInstanceOf[Ord_[Const_[E, A]]]
  
  inline def getRing[E, A](S: Ring[E]): Ring[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRing")(S.asInstanceOf[js.Any]).asInstanceOf[Ring[Const_[E, A]]]
  
  inline def getSemigroup[E, A](S: Semigroup[E]): Semigroup[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Const_[E, A]]]
  
  inline def getSemiring[E, A](S: Semiring[E]): Semiring[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[Const_[E, A]]]
  
  inline def getShow[E, A](S: Show[E]): Show[Const_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(S.asInstanceOf[js.Any]).asInstanceOf[Show[Const_[E, A]]]
  
  inline def make[E, A](e: E): Const_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(e.asInstanceOf[js.Any]).asInstanceOf[Const_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Const_[js.Any, A], Const_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[js.Any, A], Const_[js.Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Const_[E, js.Any], Const_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Const_[E, js.Any], Const_[G, js.Any]]]
  
  type Const_[E, A] = E & AA[A]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
