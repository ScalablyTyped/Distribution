package typings.fpTs.mod

import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.separatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separated {
  
  @JSImport("fp-ts", "separated")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "separated.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.separatedMod.URI] = js.native
  
  @JSImport("fp-ts", "separated.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.separatedMod.URI] = js.native
  
  @JSImport("fp-ts", "separated.URI")
  @js.native
  val URI: /* "Separated" */ String = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Separated_[E, A], Separated_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Separated_[E, A], Separated_[G, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Separated_[Any, js.Function1[/* a */ A, Any]], Separated_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Separated_[Any, js.Function1[/* a */ A, Any]], Separated_[Any, Any]]]
  
  inline def left[E, A](s: Separated_[E, A]): E = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(s.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Separated_[Any, A], Separated_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Separated_[Any, A], Separated_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Separated_[E, Any], Separated_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Separated_[E, Any], Separated_[G, Any]]]
  
  inline def right[E, A](s: Separated_[E, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(s.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def separated[E, A](left: E, right: A): Separated_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("separated")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Separated_[E, A]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
