package typings.fpTs

import typings.fpTs.comonadMod.Comonad2C
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracedMod {
  
  @JSImport("fp-ts/lib/Traced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Traced", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.tracedMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Traced", "URI")
  @js.native
  val URI: /* "Traced" */ String = js.native
  type URI = /* "Traced" */ String
  
  inline def censor[P](f: js.Function1[/* p */ P, P]): js.Function1[/* wa */ Traced_[P, js.Any], Traced_[P, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("censor")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, js.Any], Traced_[P, js.Any]]]
  
  inline def getComonad[P](monoid: Monoid[P]): Comonad2C[typings.fpTs.tracedMod.URI, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComonad")(monoid.asInstanceOf[js.Any]).asInstanceOf[Comonad2C[typings.fpTs.tracedMod.URI, P]]
  
  inline def listen[P, A](wa: Traced_[P, A]): Traced_[P, js.Tuple2[A, P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(wa.asInstanceOf[js.Any]).asInstanceOf[Traced_[P, js.Tuple2[A, P]]]
  
  inline def listens[P, B](f: js.Function1[/* p */ P, B]): js.Function1[/* wa */ Traced_[P, js.Any], Traced_[P, js.Tuple2[js.Any, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listens")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Traced_[P, js.Any], Traced_[P, js.Tuple2[js.Any, B]]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Traced_[js.Any, A], Traced_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Traced_[js.Any, A], Traced_[js.Any, B]]]
  
  @JSImport("fp-ts/lib/Traced", "traced")
  @js.native
  val traced: Functor2[typings.fpTs.tracedMod.URI] = js.native
  
  inline def tracks[P, A](M: Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ Traced_[P, A], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tracks")(M.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* wa */ Traced_[P, A], A]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type Traced_[P, A] = js.Function1[/* p */ P, A]
}
