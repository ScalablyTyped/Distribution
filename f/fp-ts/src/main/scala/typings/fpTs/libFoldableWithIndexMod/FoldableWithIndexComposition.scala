package typings.fpTs.libFoldableWithIndexMod

import typings.fpTs.libFoldableMod.FoldableComposition
import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableWithIndexComposition[F, FI, G, GI]
  extends StObject
     with FoldableComposition[F, G] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, M], 
    M
  ]
  
  def reduceRightWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  
  def reduceWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}
object FoldableWithIndexComposition {
  
  inline def apply[F, FI, G, GI](
    foldMap: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
      /* f */ js.Function1[/* a */ Any, Any], 
      Any
    ],
    foldMapWithIndex: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, Any], 
      Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRightWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any,
    reduceWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
  ): FoldableWithIndexComposition[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), reduceRightWithIndex = js.Any.fromFunction3(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
    __obj.asInstanceOf[FoldableWithIndexComposition[F, FI, G, GI]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldableWithIndexComposition[?, ?, ?, ?], F, FI, G, GI] (val x: Self & (FoldableWithIndexComposition[F, FI, G, GI])) extends AnyVal {
    
    inline def setFoldMapWithIndex(
      value: Monoid[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
          /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, Any], 
          Any
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    inline def setReduceRightWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction3(value))
    
    inline def setReduceWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction3(value))
  }
}
