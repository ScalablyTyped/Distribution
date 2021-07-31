package typings.fpTs

import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.eqMod.Eq
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.fpTsStrings.Both
import typings.fpTs.functorMod.Functor2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.showMod.Show
import typings.fpTs.traversableMod.PipeableTraverse2
import typings.fpTs.traversableMod.Sequence2
import typings.fpTs.traversableMod.Traversable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theseMod {
  
  @JSImport("fp-ts/lib/These", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/These", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.theseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/These", "Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.theseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/These", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.theseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/These", "Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.theseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/These", "URI")
  @js.native
  val URI: /* "These" */ String = js.native
  type URI = /* "These" */ String
  
  @scala.inline
  def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[E, A], These_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], These_[G, B]]]
  
  @scala.inline
  def both[E, A](left: E, right: A): These_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[These_[E, A]]
  
  @scala.inline
  def fold[E, A, B](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ These_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B]]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ These_[js.Any, js.Any], M]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* fa */ These_[js.Any, js.Any], M]
  ]]
  
  @scala.inline
  def fromOptions[E, A](fe: Option_[E], fa: Option_[A]): Option_[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(fe.asInstanceOf[js.Any], fa.asInstanceOf[js.Any])).asInstanceOf[Option_[These_[E, A]]]
  
  @scala.inline
  def getApplicative[E](SE: Semigroup[E]): Applicative2C[typings.fpTs.theseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(SE.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.theseMod.URI, E]]
  
  @scala.inline
  def getEq[E, A](EE: Eq[E], EA: Eq[A]): Eq[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[Eq[These_[E, A]]]
  
  @scala.inline
  def getLeft[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  @scala.inline
  def getLeftOnly[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeftOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  @scala.inline
  def getMonad[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.theseMod.URI, E]) & (MonadThrow2C[typings.fpTs.theseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.theseMod.URI, E]) & (MonadThrow2C[typings.fpTs.theseMod.URI, E])]
  
  @scala.inline
  def getRight[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @scala.inline
  def getRightOnly[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRightOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  @scala.inline
  def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[These_[E, A]]]
  
  @scala.inline
  def getShow[E, A](SE: Show[E], SA: Show[A]): Show[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[These_[E, A]]]
  
  @scala.inline
  def isBoth[E, A](fa: These_[E, A]): /* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoth")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean]
  
  @scala.inline
  def isLeft[E, A](fa: These_[E, A]): /* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean]
  
  @scala.inline
  def isRight[E, A](fa: These_[E, A]): /* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRight")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean]
  
  @scala.inline
  def left[E, A](left: E): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(left.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  @scala.inline
  def leftOrBoth[E](e: E): js.Function1[/* ma */ Option_[js.Any], These_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftOrBoth")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], These_[E, js.Any]]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[js.Any, A], These_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[js.Any, A], These_[js.Any, B]]]
  
  @scala.inline
  def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ These_[E, js.Any], These_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[E, js.Any], These_[G, js.Any]]]
  
  @scala.inline
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ These_[js.Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[js.Any, A], B]]
  
  @scala.inline
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ These_[js.Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[js.Any, A], B]]
  
  @scala.inline
  def right[E, A](right: A): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(right.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  @scala.inline
  def rightOrBoth[A](a: A): js.Function1[/* me */ Option_[js.Any], These_[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightOrBoth")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Option_[js.Any], These_[js.Any, A]]]
  
  @JSImport("fp-ts/lib/These", "sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.theseMod.URI] = js.native
  
  @scala.inline
  def swap[E, A](fa: These_[E, A]): These_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[These_[A, E]]
  
  @JSImport("fp-ts/lib/These", "these")
  @js.native
  val these: Functor2[typings.fpTs.theseMod.URI] & Bifunctor2[typings.fpTs.theseMod.URI] & Foldable2[typings.fpTs.theseMod.URI] & Traversable2[typings.fpTs.theseMod.URI] = js.native
  
  @scala.inline
  def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]]]
  
  @JSImport("fp-ts/lib/These", "traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.theseMod.URI] = js.native
  
  trait Both_[E, A]
    extends StObject
       with These_[E, A] {
    
    val _tag: Both
    
    val left: E
    
    val right: A
  }
  object Both_ {
    
    @scala.inline
    def apply[E, A](left: E, right: A): Both_[E, A] = {
      val __obj = js.Dynamic.literal(_tag = "Both", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Both_[E, A]]
    }
    
    @scala.inline
    implicit class Both_MutableBuilder[Self <: Both_[?, ?], E, A] (val x: Self & (Both_[E, A])) extends AnyVal {
      
      @scala.inline
      def setLeft(value: E): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: A): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tag(value: Both): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fpTs.eitherMod.Either_[E, A]
    - typings.fpTs.theseMod.Both_[E, A]
  */
  trait These_[E, A] extends StObject
  object These_ {
    
    @scala.inline
    def Both_[E, A](left: E, right: A): typings.fpTs.theseMod.Both_[E, A] = {
      val __obj = js.Dynamic.literal(_tag = "Both", left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.theseMod.Both_[E, A]]
    }
    
    @scala.inline
    def Left_[E](left: E): typings.fpTs.eitherMod.Left_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Left", left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.eitherMod.Left_[E]]
    }
    
    @scala.inline
    def Right_[A](right: A): typings.fpTs.eitherMod.Right_[A] = {
      val __obj = js.Dynamic.literal(_tag = "Right", right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fpTs.eitherMod.Right_[A]]
    }
  }
}
