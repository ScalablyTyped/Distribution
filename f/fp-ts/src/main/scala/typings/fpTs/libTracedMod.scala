package typings.fpTs

import typings.fpTs.libComonadMod.Comonad2C
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracedMod {
  
  @JSImport("fp-ts/lib/Traced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Traced", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libTracedMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Traced", "URI")
  @js.native
  val URI: /* "Traced" */ String = js.native
  type URI = /* "Traced" */ String
  
  inline def censor[P](f: js.Function1[/* p */ P, P]): js.Function1[/* wa */ Traced_[P, Any], Traced_[P, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, Any], Traced_[P, Any]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Traced_[Any, js.Function1[/* a */ A, Any]], Traced_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Traced_[Any, js.Function1[/* a */ A, Any]], Traced_[Any, Any]]]
  
  inline def getComonad[P](monoid: Monoid[P]): Comonad2C[typings.fpTs.libTracedMod.URI, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComonad")(monoid.asInstanceOf[js.Any]).asInstanceOf[Comonad2C[typings.fpTs.libTracedMod.URI, P]]
  
  inline def listen[P, A](wa: Traced_[P, A]): Traced_[P, js.Tuple2[A, P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(wa.asInstanceOf[js.Any]).asInstanceOf[Traced_[P, js.Tuple2[A, P]]]
  
  inline def listens[P, B](f: js.Function1[/* p */ P, B]): js.Function1[/* wa */ Traced_[P, Any], Traced_[P, js.Tuple2[Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, Any], Traced_[P, js.Tuple2[Any, B]]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Traced_[Any, A], Traced_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Traced_[Any, A], Traced_[Any, B]]]
  
  @JSImport("fp-ts/lib/Traced", "traced")
  @js.native
  val traced: Functor2[typings.fpTs.libTracedMod.URI] = js.native
  
  inline def tracks[P, A](M: Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ Traced_[P, A], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tracks")(M.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* wa */ Traced_[P, A], A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  type Traced_[P, A] = js.Function1[/* p */ P, A]
}
