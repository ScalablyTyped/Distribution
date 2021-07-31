package typings.fpTs

import typings.fpTs.applicativeMod.ApplicativeComposition11
import typings.fpTs.applicativeMod.ApplicativeComposition21
import typings.fpTs.applicativeMod.ApplicativeComposition2C1
import typings.fpTs.applicativeMod.ApplicativeCompositionHKT1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.optionMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionTMod {
  
  @JSImport("fp-ts/lib/OptionT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getOptionM[M](M: Monad[M]): OptionM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM[M]]
  @scala.inline
  def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): OptionM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM1[M]]
  @scala.inline
  def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): OptionM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2[M]]
  @scala.inline
  def getOptionM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monad2C[M, E]): OptionM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionM")(M.asInstanceOf[js.Any]).asInstanceOf[OptionM2C[M, E]]
  
  trait OptionM[M]
    extends StObject
       with ApplicativeCompositionHKT1[M, URI] {
    
    def alt[A](fa: OptionT[M, A], that: Lazy[OptionT[M, A]]): OptionT[M, A]
    
    def chain[A, B](ma: OptionT[M, A], f: js.Function1[/* a */ A, OptionT[M, B]]): OptionT[M, B]
    
    def fold[A, R](
      ma: OptionT[M, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ],
      onSome: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]
    ): js.Any
    
    def fromM[A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
    ): OptionT[M, A]
    
    def getOrElse[A](
      ma: OptionT[M, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
        ]
    ): js.Any
    
    def none[A](): OptionT[M, A]
  }
  object OptionM {
    
    @scala.inline
    def apply[M](
      alt: (OptionT[M, js.Any], Lazy[OptionT[M, js.Any]]) => OptionT[M, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ js.Any) => js.Any,
      chain: (OptionT[M, js.Any], js.Function1[js.Any, OptionT[M, js.Any]]) => OptionT[M, js.Any],
      fold: (OptionT[M, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => OptionT[M, js.Any],
      getOrElse: (OptionT[M, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      none: () => OptionT[M, js.Any],
      of: js.Any => js.Any
    ): OptionM[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), fromM = js.Any.fromFunction1(fromM), getOrElse = js.Any.fromFunction2(getOrElse), map = js.Any.fromFunction2(map), none = js.Any.fromFunction0(none), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[OptionM[M]]
    }
    
    @scala.inline
    implicit class OptionMMutableBuilder[Self <: OptionM[?], M] (val x: Self & OptionM[M]) extends AnyVal {
      
      @scala.inline
      def setAlt(value: (OptionT[M, js.Any], Lazy[OptionT[M, js.Any]]) => OptionT[M, js.Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChain(value: (OptionT[M, js.Any], js.Function1[js.Any, OptionT[M, js.Any]]) => OptionT[M, js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFold(
        value: (OptionT[M, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => OptionT[M, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOrElse(
        value: (OptionT[M, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNone(value: () => OptionT[M, js.Any]): Self = StObject.set(x, "none", js.Any.fromFunction0(value))
    }
  }
  
  trait OptionM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with ApplicativeComposition11[M, URI] {
    
    def alt[A](fa: OptionT1[M, A], that: Lazy[OptionT1[M, A]]): OptionT1[M, A]
    
    def chain[A, B](ma: OptionT1[M, A], f: js.Function1[/* a */ A, OptionT1[M, B]]): OptionT1[M, B]
    
    def fold[A, R](
      ma: OptionT1[M, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ],
      onSome: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]
    ): js.Any
    
    def fromM[A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
    ): OptionT1[M, A]
    
    def getOrElse[A](
      ma: OptionT1[M, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
        ]
    ): js.Any
    
    def none[A](): OptionT1[M, A]
  }
  object OptionM1 {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      alt: (OptionT1[M, js.Any], Lazy[OptionT1[M, js.Any]]) => OptionT1[M, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any) => js.Any,
      chain: (OptionT1[M, js.Any], js.Function1[js.Any, OptionT1[M, js.Any]]) => OptionT1[M, js.Any],
      fold: (OptionT1[M, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => OptionT1[M, js.Any],
      getOrElse: (OptionT1[M, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      none: () => OptionT1[M, js.Any],
      of: js.Any => js.Any
    ): OptionM1[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), fromM = js.Any.fromFunction1(fromM), getOrElse = js.Any.fromFunction2(getOrElse), map = js.Any.fromFunction2(map), none = js.Any.fromFunction0(none), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[OptionM1[M]]
    }
    
    @scala.inline
    implicit class OptionM1MutableBuilder[Self <: OptionM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & OptionM1[M]) extends AnyVal {
      
      @scala.inline
      def setAlt(value: (OptionT1[M, js.Any], Lazy[OptionT1[M, js.Any]]) => OptionT1[M, js.Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChain(value: (OptionT1[M, js.Any], js.Function1[js.Any, OptionT1[M, js.Any]]) => OptionT1[M, js.Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFold(
        value: (OptionT1[M, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => OptionT1[M, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOrElse(
        value: (OptionT1[M, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNone(value: () => OptionT1[M, js.Any]): Self = StObject.set(x, "none", js.Any.fromFunction0(value))
    }
  }
  
  trait OptionM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with ApplicativeComposition21[M, URI] {
    
    def alt[E, A](fa: OptionT2[M, E, A], that: Lazy[OptionT2[M, E, A]]): OptionT2[M, E, A]
    
    def chain[E, A, B](ma: OptionT2[M, E, A], f: js.Function1[/* a */ A, OptionT2[M, E, B]]): OptionT2[M, E, B]
    
    def fold[E, A, R](
      ma: OptionT2[M, E, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ],
      onSome: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ]
    ): js.Any
    
    def fromM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
    ): OptionT2[M, E, A]
    
    def getOrElse[E, A](
      ma: OptionT2[M, E, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
        ]
    ): js.Any
    
    def none[E, A](): OptionT2[M, E, A]
  }
  object OptionM2 {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      alt: (OptionT2[M, js.Any, js.Any], Lazy[OptionT2[M, js.Any, js.Any]]) => OptionT2[M, js.Any, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any) => js.Any,
      chain: (OptionT2[M, js.Any, js.Any], js.Function1[js.Any, OptionT2[M, js.Any, js.Any]]) => OptionT2[M, js.Any, js.Any],
      fold: (OptionT2[M, js.Any, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ]) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => OptionT2[M, js.Any, js.Any],
      getOrElse: (OptionT2[M, js.Any, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      none: () => OptionT2[M, js.Any, js.Any],
      of: js.Any => js.Any
    ): OptionM2[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), fromM = js.Any.fromFunction1(fromM), getOrElse = js.Any.fromFunction2(getOrElse), map = js.Any.fromFunction2(map), none = js.Any.fromFunction0(none), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[OptionM2[M]]
    }
    
    @scala.inline
    implicit class OptionM2MutableBuilder[Self <: OptionM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & OptionM2[M]) extends AnyVal {
      
      @scala.inline
      def setAlt(
        value: (OptionT2[M, js.Any, js.Any], Lazy[OptionT2[M, js.Any, js.Any]]) => OptionT2[M, js.Any, js.Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChain(
        value: (OptionT2[M, js.Any, js.Any], js.Function1[js.Any, OptionT2[M, js.Any, js.Any]]) => OptionT2[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFold(
        value: (OptionT2[M, js.Any, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => OptionT2[M, js.Any, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOrElse(
        value: (OptionT2[M, js.Any, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNone(value: () => OptionT2[M, js.Any, js.Any]): Self = StObject.set(x, "none", js.Any.fromFunction0(value))
    }
  }
  
  trait OptionM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with ApplicativeComposition2C1[M, URI, E] {
    
    def alt[A](fa: OptionT2[M, E, A], that: Lazy[OptionT2[M, E, A]]): OptionT2[M, E, A]
    
    def chain[A, B](ma: OptionT2[M, E, A], f: js.Function1[/* a */ A, OptionT2[M, E, B]]): OptionT2[M, E, B]
    
    def fold[A, R](
      ma: OptionT2[M, E, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ],
      onSome: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ]
    ): js.Any
    
    def fromM[A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
    ): OptionT2[M, E, A]
    
    def getOrElse[A](
      ma: OptionT2[M, E, A],
      onNone: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
        ]
    ): js.Any
    
    def none[A](): OptionT2[M, E, A]
  }
  object OptionM2C {
    
    @scala.inline
    def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      alt: (OptionT2[M, E, js.Any], Lazy[OptionT2[M, E, js.Any]]) => OptionT2[M, E, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any) => js.Any,
      chain: (OptionT2[M, E, js.Any], js.Function1[js.Any, OptionT2[M, E, js.Any]]) => OptionT2[M, E, js.Any],
      fold: (OptionT2[M, E, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
        ]) => js.Any,
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => OptionT2[M, E, js.Any],
      getOrElse: (OptionT2[M, E, js.Any], Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
        ]) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      none: () => OptionT2[M, E, js.Any],
      of: js.Any => js.Any
    ): OptionM2C[M, E] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), fromM = js.Any.fromFunction1(fromM), getOrElse = js.Any.fromFunction2(getOrElse), map = js.Any.fromFunction2(map), none = js.Any.fromFunction0(none), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[OptionM2C[M, E]]
    }
    
    @scala.inline
    implicit class OptionM2CMutableBuilder[Self <: OptionM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (OptionM2C[M, E])) extends AnyVal {
      
      @scala.inline
      def setAlt(value: (OptionT2[M, E, js.Any], Lazy[OptionT2[M, E, js.Any]]) => OptionT2[M, E, js.Any]): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChain(
        value: (OptionT2[M, E, js.Any], js.Function1[js.Any, OptionT2[M, E, js.Any]]) => OptionT2[M, E, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFold(
        value: (OptionT2[M, E, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any => OptionT2[M, E, js.Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOrElse(
        value: (OptionT2[M, E, js.Any], Lazy[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNone(value: () => OptionT2[M, E, js.Any]): Self = StObject.set(x, "none", js.Any.fromFunction0(value))
    }
  }
  
  type OptionT[M, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Option<A>> */ js.Any
  
  type OptionT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Option<A>> */ js.Any
  
  type OptionT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, Option<A>> */ js.Any
}
