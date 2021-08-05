package typings.fpTs

import typings.fpTs.categoryMod.Category
import typings.fpTs.categoryMod.Category2
import typings.fpTs.categoryMod.Category3
import typings.fpTs.profunctorMod.Profunctor
import typings.fpTs.profunctorMod.Profunctor2
import typings.fpTs.profunctorMod.Profunctor3
import typings.fpTs.profunctorMod.Profunctor4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceMod {
  
  @JSImport("fp-ts/lib/Choice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ js.Any
  ]]
  inline def fanin[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ js.Any
  ]]
  inline def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ js.Any
  ]]
  
  inline def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ js.Any
  ]]
  inline def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ js.Any
  ]]
  inline def splitChoice[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ js.Any
  ]]
  
  trait Choice[F]
    extends StObject
       with Profunctor[F] {
    
    def left[A, B, C](
      pab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any
    ): js.Any
    
    def right[A, B, C](
      pbc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any
    ): js.Any
  }
  object Choice {
    
    inline def apply[F](
      URI: F,
      left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any,
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any => js.Any
    ): Choice[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[Choice[F]]
    }
    
    extension [Self <: Choice[?], F](x: Self & Choice[F]) {
      
      inline def setLeft(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ js.Any => js.Any
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ js.Any => js.Any
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
  
  trait Choice2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Profunctor2[F] {
    
    def left[A, B, C](
      pab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any
    ): js.Any
    
    def right[A, B, C](
      pbc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any
    ): js.Any
  }
  object Choice2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any,
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any => js.Any
    ): Choice2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[Choice2[F]]
    }
    
    extension [Self <: Choice2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & Choice2[F]) {
      
      inline def setLeft(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ js.Any => js.Any
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ js.Any => js.Any
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
  
  trait Choice3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Profunctor3[F] {
    
    def left[R, A, B, C](
      pab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any
    ): js.Any
    
    def right[R, A, B, C](
      pbc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any
    ): js.Any
  }
  object Choice3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any,
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any => js.Any
    ): Choice3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[Choice3[F]]
    }
    
    extension [Self <: Choice3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & Choice3[F]) {
      
      inline def setLeft(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ js.Any => js.Any
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ js.Any => js.Any
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
  
  trait Choice4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Profunctor4[F] {
    
    def left[S, R, A, B, C](
      pab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any
    ): js.Any
    
    def right[S, R, A, B, C](
      pbc: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any
    ): js.Any
  }
  object Choice4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      promap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Any,
      right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any => js.Any
    ): Choice4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[Choice4[F]]
    }
    
    extension [Self <: Choice4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](x: Self & Choice4[F]) {
      
      inline def setLeft(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ js.Any => js.Any
      ): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ js.Any => js.Any
      ): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
}
