package typings.fpTs

import typings.fpTs.applicativeMod.ApplicativeComposition12
import typings.fpTs.applicativeMod.ApplicativeComposition22
import typings.fpTs.applicativeMod.ApplicativeCompositionHKT2
import typings.fpTs.eitherMod.URI
import typings.fpTs.functionMod.Lazy
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherTMod {
  
  @JSImport("fp-ts/lib/EitherT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEitherM[M](M: Monad[M]): EitherM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM[M]]
  inline def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): EitherM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM1[M]]
  inline def getEitherM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): EitherM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEitherM")(M.asInstanceOf[js.Any]).asInstanceOf[EitherM2[M]]
  
  trait EitherM[M]
    extends StObject
       with ApplicativeCompositionHKT2[M, URI] {
    
    def alt[E, A](fa: EitherT[M, E, A], that: Lazy[EitherT[M, E, A]]): EitherT[M, E, A]
    
    def bimap[E, A, N, B](ma: EitherT[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT[M, N, B]
    
    def chain[E, A, B](ma: EitherT[M, E, A], f: js.Function1[/* a */ A, EitherT[M, E, B]]): EitherT[M, E, B]
    
    def fold[E, A, R](
      ma: EitherT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]
    ): js.Any
    
    def getOrElse[E, A](
      ma: EitherT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
        ]
    ): js.Any
    
    def left[E, A](e: E): EitherT[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any
    ): EitherT[M, E, A]
    
    def mapLeft[E, A, N](ma: EitherT[M, E, A], f: js.Function1[/* e */ E, N]): EitherT[M, N, A]
    
    def orElse[E, A, N](ma: EitherT[M, E, A], onLeft: js.Function1[/* e */ E, EitherT[M, N, A]]): EitherT[M, N, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
    ): EitherT[M, E, A]
    
    def swap[E, A](ma: EitherT[M, E, A]): EitherT[M, A, E]
  }
  object EitherM {
    
    inline def apply[M](
      alt: (EitherT[M, js.Any, js.Any], Lazy[EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any) => js.Any,
      bimap: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT[M, js.Any, js.Any],
      chain: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any],
      fold: (EitherT[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]) => js.Any,
      getOrElse: (EitherT[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
        ]) => js.Any,
      left: js.Any => EitherT[M, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any => EitherT[M, js.Any, js.Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      mapLeft: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT[M, js.Any, js.Any],
      of: js.Any => js.Any,
      orElse: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => EitherT[M, js.Any, js.Any],
      swap: EitherT[M, js.Any, js.Any] => EitherT[M, js.Any, js.Any]
    ): EitherM[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM[M]]
    }
    
    extension [Self <: EitherM[?], M](x: Self & EitherM[M]) {
      
      inline def setAlt(
        value: (EitherT[M, js.Any, js.Any], Lazy[EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(
        value: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: js.Any => EitherT[M, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(value: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT[M, js.Any, js.Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(
        value: (EitherT[M, js.Any, js.Any], js.Function1[js.Any, EitherT[M, js.Any, js.Any]]) => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => EitherT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT[M, js.Any, js.Any] => EitherT[M, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  trait EitherM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with ApplicativeComposition12[M, URI] {
    
    def alt[E, A](fa: EitherT1[M, E, A], that: Lazy[EitherT1[M, E, A]]): EitherT1[M, E, A]
    
    def bimap[E, A, N, B](ma: EitherT1[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT1[M, N, B]
    
    def chain[E, A, B](ma: EitherT1[M, E, A], f: js.Function1[/* a */ A, EitherT1[M, E, B]]): EitherT1[M, E, B]
    
    def fold[E, A, R](
      ma: EitherT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]
    ): js.Any
    
    def getOrElse[E, A](
      ma: EitherT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
        ]
    ): js.Any
    
    def left[E, A](e: E): EitherT1[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any
    ): EitherT1[M, E, A]
    
    def mapLeft[E, A, N](ma: EitherT1[M, E, A], f: js.Function1[/* e */ E, N]): EitherT1[M, N, A]
    
    def orElse[E, A, N](ma: EitherT1[M, E, A], onLeft: js.Function1[/* e */ E, EitherT1[M, N, A]]): EitherT1[M, N, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
    ): EitherT1[M, E, A]
    
    def swap[E, A](ma: EitherT1[M, E, A]): EitherT1[M, A, E]
  }
  object EitherM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      alt: (EitherT1[M, js.Any, js.Any], Lazy[EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any) => js.Any,
      bimap: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT1[M, js.Any, js.Any],
      chain: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any],
      fold: (EitherT1[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]) => js.Any,
      getOrElse: (EitherT1[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
        ]) => js.Any,
      left: js.Any => EitherT1[M, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any => EitherT1[M, js.Any, js.Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      mapLeft: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT1[M, js.Any, js.Any],
      of: js.Any => js.Any,
      orElse: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => EitherT1[M, js.Any, js.Any],
      swap: EitherT1[M, js.Any, js.Any] => EitherT1[M, js.Any, js.Any]
    ): EitherM1[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM1[M]]
    }
    
    extension [Self <: EitherM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & EitherM1[M]) {
      
      inline def setAlt(
        value: (EitherT1[M, js.Any, js.Any], Lazy[EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(
        value: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT1[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT1[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: js.Any => EitherT1[M, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(value: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT1[M, js.Any, js.Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(
        value: (EitherT1[M, js.Any, js.Any], js.Function1[js.Any, EitherT1[M, js.Any, js.Any]]) => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => EitherT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT1[M, js.Any, js.Any] => EitherT1[M, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  trait EitherM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with ApplicativeComposition22[M, URI] {
    
    def alt[R, E, A](fa: EitherT2[M, R, E, A], that: Lazy[EitherT2[M, R, E, A]]): EitherT2[M, R, E, A]
    
    def bimap[R, E, A, N, B](ma: EitherT2[M, R, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): EitherT2[M, R, N, B]
    
    def chain[R, E, A, B](ma: EitherT2[M, R, E, A], f: js.Function1[/* a */ A, EitherT2[M, R, E, B]]): EitherT2[M, R, E, B]
    
    def fold[R, E, A, B](
      ma: EitherT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ]
    ): js.Any
    
    def getOrElse[R, E, A](
      ma: EitherT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any
        ]
    ): js.Any
    
    def left[R, E, A](e: E): EitherT2[M, R, E, A]
    
    def leftM[R, E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any
    ): EitherT2[M, R, E, A]
    
    def mapLeft[R, E, A, N](ma: EitherT2[M, R, E, A], f: js.Function1[/* e */ E, N]): EitherT2[M, R, N, A]
    
    def orElse[R, E, A, F](ma: EitherT2[M, R, E, A], onLeft: js.Function1[/* e */ E, EitherT2[M, R, F, A]]): EitherT2[M, R, F, A]
    
    def rightM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any
    ): EitherT2[M, R, E, A]
    
    def swap[R, E, A](ma: EitherT2[M, R, E, A]): EitherT2[M, R, A, E]
  }
  object EitherM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      alt: (EitherT2[M, js.Any, js.Any, js.Any], Lazy[EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any],
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, (a : A): B>> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any) => js.Any,
      bimap: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT2[M, js.Any, js.Any, js.Any],
      chain: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any],
      fold: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ]) => js.Any,
      getOrElse: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any
        ]) => js.Any,
      left: js.Any => EitherT2[M, js.Any, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any => EitherT2[M, js.Any, js.Any, js.Any],
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      mapLeft: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT2[M, js.Any, js.Any, js.Any],
      of: js.Any => js.Any,
      orElse: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any => EitherT2[M, js.Any, js.Any, js.Any],
      swap: EitherT2[M, js.Any, js.Any, js.Any] => EitherT2[M, js.Any, js.Any, js.Any]
    ): EitherM2[M] = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction2(alt), ap = js.Any.fromFunction2(ap), bimap = js.Any.fromFunction3(bimap), chain = js.Any.fromFunction2(chain), fold = js.Any.fromFunction3(fold), getOrElse = js.Any.fromFunction2(getOrElse), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), of = js.Any.fromFunction1(of), orElse = js.Any.fromFunction2(orElse), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap))
      __obj.asInstanceOf[EitherM2[M]]
    }
    
    extension [Self <: EitherM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & EitherM2[M]) {
      
      inline def setAlt(
        value: (EitherT2[M, js.Any, js.Any, js.Any], Lazy[EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "alt", js.Any.fromFunction2(value))
      
      inline def setBimap(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setChain(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction3(value))
      
      inline def setGetOrElse(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "getOrElse", js.Any.fromFunction2(value))
      
      inline def setLeft(value: js.Any => EitherT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMapLeft(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setOrElse(
        value: (EitherT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, EitherT2[M, js.Any, js.Any, js.Any]]) => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "orElse", js.Any.fromFunction2(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any => EitherT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: EitherT2[M, js.Any, js.Any, js.Any] => EitherT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
    }
  }
  
  type EitherT[M, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, Either<E, A>> */ js.Any
  
  type EitherT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, Either<E, A>> */ js.Any
  
  type EitherT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, R, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, Either<E, A>> */ js.Any
}
