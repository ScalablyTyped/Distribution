package typings.fpTs

import typings.fpTs.anon.Ap
import typings.fpTs.anon.Chain
import typings.fpTs.anon.Map
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theseTMod {
  
  @JSImport("fp-ts/lib/TheseT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTheseM[M](M: Monad[M]): TheseM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM[M]]
  inline def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M]): TheseM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM1[M]]
  inline def getTheseM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monad2[M]): TheseM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheseM")(M.asInstanceOf[js.Any]).asInstanceOf[TheseM2[M]]
  
  trait TheseM[M] extends StObject {
    
    def bimap[E, A, N, B](fa: TheseT[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT[M, N, B]
    
    def both[E, A](e: E, a: A): TheseT[M, E, A]
    
    def fold[E, A, R](
      fa: TheseT[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]
    ): js.Any
    
    def getMonad[E](S: Semigroup[E]): Ap[E, M]
    
    def left[E, A](e: E): TheseT[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any
    ): TheseT[M, E, A]
    
    def map[E, A, B](fa: TheseT[M, E, A], f: js.Function1[/* a */ A, B]): TheseT[M, E, B]
    
    def mapLeft[E, A, N](fa: TheseT[M, E, A], f: js.Function1[/* e */ E, N]): TheseT[M, N, A]
    
    def right[E, A](a: A): TheseT[M, E, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any
    ): TheseT[M, E, A]
    
    def swap[E, A](fa: TheseT[M, E, A]): TheseT[M, A, E]
    
    def toTuple[E, A](fa: TheseT[M, E, A], e: E, a: A): js.Any
  }
  object TheseM {
    
    inline def apply[M](
      bimap: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any],
      both: (js.Any, js.Any) => TheseT[M, js.Any, js.Any],
      fold: (TheseT[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ], js.Function2[
          js.Any, 
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
        ]) => js.Any,
      getMonad: Semigroup[js.Any] => Ap[js.Any, M],
      left: js.Any => TheseT[M, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any => TheseT[M, js.Any, js.Any],
      map: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any],
      mapLeft: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any],
      right: js.Any => TheseT[M, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => TheseT[M, js.Any, js.Any],
      swap: TheseT[M, js.Any, js.Any] => TheseT[M, js.Any, js.Any],
      toTuple: (TheseT[M, js.Any, js.Any], js.Any, js.Any) => js.Any
    ): TheseM[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM[M]]
    }
    
    extension [Self <: TheseM[?], M](x: Self & TheseM[M]) {
      
      inline def setBimap(
        value: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (js.Any, js.Any) => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ], js.Function2[
              js.Any, 
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[js.Any] => Ap[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: js.Any => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, E> */ js.Any => TheseT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(value: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(value: (TheseT[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: js.Any => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ js.Any => TheseT[M, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT[M, js.Any, js.Any] => TheseT[M, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT[M, js.Any, js.Any], js.Any, js.Any) => js.Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  trait TheseM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
    
    def bimap[E, A, N, B](fa: TheseT1[M, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT1[M, N, B]
    
    def both[E, A](e: E, a: A): TheseT1[M, E, A]
    
    def fold[E, A, R](
      fa: TheseT1[M, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]
    ): js.Any
    
    def getMonad[E](S: Semigroup[E]): Chain[E, M]
    
    def left[E, A](e: E): TheseT1[M, E, A]
    
    def leftM[E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any
    ): TheseT1[M, E, A]
    
    def map[E, A, B](fa: TheseT1[M, E, A], f: js.Function1[/* a */ A, B]): TheseT1[M, E, B]
    
    def mapLeft[E, A, N](fa: TheseT1[M, E, A], f: js.Function1[/* e */ E, N]): TheseT1[M, N, A]
    
    def right[E, A](a: A): TheseT1[M, E, A]
    
    def rightM[E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
    ): TheseT1[M, E, A]
    
    def swap[E, A](fa: TheseT1[M, E, A]): TheseT1[M, A, E]
    
    def toTuple[E, A](fa: TheseT1[M, E, A], e: E, a: A): js.Any
  }
  object TheseM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      bimap: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any],
      both: (js.Any, js.Any) => TheseT1[M, js.Any, js.Any],
      fold: (TheseT1[M, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ], js.Function2[
          js.Any, 
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
        ]) => js.Any,
      getMonad: Semigroup[js.Any] => Chain[js.Any, M],
      left: js.Any => TheseT1[M, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any => TheseT1[M, js.Any, js.Any],
      map: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any],
      mapLeft: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any],
      right: js.Any => TheseT1[M, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => TheseT1[M, js.Any, js.Any],
      swap: TheseT1[M, js.Any, js.Any] => TheseT1[M, js.Any, js.Any],
      toTuple: (TheseT1[M, js.Any, js.Any], js.Any, js.Any) => js.Any
    ): TheseM1[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM1[M]]
    }
    
    extension [Self <: TheseM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & TheseM1[M]) {
      
      inline def setBimap(
        value: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (js.Any, js.Any) => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT1[M, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ], js.Function2[
              js.Any, 
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, R> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[js.Any] => Chain[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: js.Any => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, E> */ js.Any => TheseT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(value: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(value: (TheseT1[M, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: js.Any => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any => TheseT1[M, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT1[M, js.Any, js.Any] => TheseT1[M, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT1[M, js.Any, js.Any], js.Any, js.Any) => js.Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  trait TheseM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
    
    def bimap[R, E, A, N, B](fa: TheseT2[M, R, E, A], f: js.Function1[/* e */ E, N], g: js.Function1[/* a */ A, B]): TheseT2[M, R, N, B]
    
    def both[R, E, A](e: E, a: A): TheseT2[M, R, E, A]
    
    def fold[R, E, A, B](
      fa: TheseT2[M, R, E, A],
      onLeft: js.Function1[
          /* e */ E, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ],
      onRight: js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ],
      onBoth: js.Function2[
          /* e */ E, 
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ]
    ): js.Any
    
    def getMonad[E](S: Semigroup[E]): Map[E, M]
    
    def left[R, E, A](e: E): TheseT2[M, R, E, A]
    
    def leftM[R, E, A](
      me: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any
    ): TheseT2[M, R, E, A]
    
    def map[R, E, A, B](fa: TheseT2[M, R, E, A], f: js.Function1[/* a */ A, B]): TheseT2[M, R, E, B]
    
    def mapLeft[R, E, A, N](fa: TheseT2[M, R, E, A], f: js.Function1[/* e */ E, N]): TheseT2[M, R, N, A]
    
    def right[R, E, A](a: A): TheseT2[M, R, E, A]
    
    def rightM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any
    ): TheseT2[M, R, E, A]
    
    def swap[R, E, A](fa: TheseT2[M, R, E, A]): TheseT2[M, R, A, E]
    
    def toTuple[R, E, A](fa: TheseT2[M, R, E, A], e: E, a: A): js.Any
  }
  object TheseM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      bimap: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any],
      both: (js.Any, js.Any) => TheseT2[M, js.Any, js.Any, js.Any],
      fold: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ], js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ], js.Function2[
          js.Any, 
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
        ]) => js.Any,
      getMonad: Semigroup[js.Any] => Map[js.Any, M],
      left: js.Any => TheseT2[M, js.Any, js.Any, js.Any],
      leftM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any => TheseT2[M, js.Any, js.Any, js.Any],
      map: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any],
      mapLeft: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any],
      right: js.Any => TheseT2[M, js.Any, js.Any, js.Any],
      rightM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any => TheseT2[M, js.Any, js.Any, js.Any],
      swap: TheseT2[M, js.Any, js.Any, js.Any] => TheseT2[M, js.Any, js.Any, js.Any],
      toTuple: (TheseT2[M, js.Any, js.Any, js.Any], js.Any, js.Any) => js.Any
    ): TheseM2[M] = {
      val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction3(bimap), both = js.Any.fromFunction2(both), fold = js.Any.fromFunction4(fold), getMonad = js.Any.fromFunction1(getMonad), left = js.Any.fromFunction1(left), leftM = js.Any.fromFunction1(leftM), map = js.Any.fromFunction2(map), mapLeft = js.Any.fromFunction2(mapLeft), right = js.Any.fromFunction1(right), rightM = js.Any.fromFunction1(rightM), swap = js.Any.fromFunction1(swap), toTuple = js.Any.fromFunction3(toTuple))
      __obj.asInstanceOf[TheseM2[M]]
    }
    
    extension [Self <: TheseM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & TheseM2[M]) {
      
      inline def setBimap(
        value: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setBoth(value: (js.Any, js.Any) => TheseT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "both", js.Any.fromFunction2(value))
      
      inline def setFold(
        value: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
            ], js.Function1[
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
            ], js.Function2[
              js.Any, 
              js.Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ js.Any
            ]) => js.Any
      ): Self = StObject.set(x, "fold", js.Any.fromFunction4(value))
      
      inline def setGetMonad(value: Semigroup[js.Any] => Map[js.Any, M]): Self = StObject.set(x, "getMonad", js.Any.fromFunction1(value))
      
      inline def setLeft(value: js.Any => TheseT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, E> */ js.Any => TheseT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "leftM", js.Any.fromFunction1(value))
      
      inline def setMap(
        value: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapLeft(
        value: (TheseT2[M, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => TheseT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setRight(value: js.Any => TheseT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ js.Any => TheseT2[M, js.Any, js.Any, js.Any]
      ): Self = StObject.set(x, "rightM", js.Any.fromFunction1(value))
      
      inline def setSwap(value: TheseT2[M, js.Any, js.Any, js.Any] => TheseT2[M, js.Any, js.Any, js.Any]): Self = StObject.set(x, "swap", js.Any.fromFunction1(value))
      
      inline def setToTuple(value: (TheseT2[M, js.Any, js.Any, js.Any], js.Any, js.Any) => js.Any): Self = StObject.set(x, "toTuple", js.Any.fromFunction3(value))
    }
  }
  
  type TheseT[M, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, These<E, A>> */ js.Any
  
  type TheseT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, These<E, A>> */ js.Any
  
  type TheseT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, R, E, A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, These<E, A>> */ js.Any
}
