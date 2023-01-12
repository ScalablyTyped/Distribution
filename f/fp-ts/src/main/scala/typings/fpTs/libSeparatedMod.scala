package typings.fpTs

import typings.fpTs.libBifunctorMod.Bifunctor2
import typings.fpTs.libFunctorMod.Functor2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSeparatedMod {
  
  @JSImport("fp-ts/lib/Separated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Separated", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.libSeparatedMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Separated", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libSeparatedMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Separated", "URI")
  @js.native
  val URI: /* "Separated" */ String = js.native
  type URI = /* "Separated" */ String
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Separated_[E, A], Separated_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Separated_[E, A], Separated_[G, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Separated_[Any, js.Function1[/* a */ A, Any]], Separated_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Separated_[Any, js.Function1[/* a */ A, Any]], Separated_[Any, Any]]]
  
  inline def left[E, A](s: Separated_[E, A]): E = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(s.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Separated_[Any, A], Separated_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Separated_[Any, A], Separated_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ Separated_[E, Any], Separated_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Separated_[E, Any], Separated_[G, Any]]]
  
  inline def right[E, A](s: Separated_[E, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(s.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def separated[E, A](left: E, right: A): Separated_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("separated")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Separated_[E, A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  trait Separated_[E, A] extends StObject {
    
    val left: E
    
    val right: A
  }
  object Separated_ {
    
    inline def apply[E, A](left: E, right: A): Separated_[E, A] = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Separated_[E, A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Separated_[?, ?], E, A] (val x: Self & (Separated_[E, A])) extends AnyVal {
      
      inline def setLeft(value: E): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: A): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
