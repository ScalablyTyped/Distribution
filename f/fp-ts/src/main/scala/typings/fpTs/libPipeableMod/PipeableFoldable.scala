package typings.fpTs.libPipeableMod

import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFoldable[F] extends StObject {
  
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      M
    ]
  ]
  
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    B
  ]
  
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    B
  ]
}
object PipeableFoldable {
  
  inline def apply[F](
    foldMap: Monoid[Any] => js.Function1[
      /* f */ js.Function1[/* a */ Any, Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
        Any
      ]
    ],
    reduce: (Any, js.Function2[Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      Any
    ],
    reduceRight: (Any, js.Function2[Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      Any
    ]
  ): PipeableFoldable[F] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight))
    __obj.asInstanceOf[PipeableFoldable[F]]
  }
  
  extension [Self <: PipeableFoldable[?], F](x: Self & PipeableFoldable[F]) {
    
    inline def setFoldMap(
      value: Monoid[Any] => js.Function1[
          /* f */ js.Function1[/* a */ Any, Any], 
          js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
            Any
          ]
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: (Any, js.Function2[Any, Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
          Any
        ]
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
    
    inline def setReduceRight(
      value: (Any, js.Function2[Any, Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
          Any
        ]
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction2(value))
  }
}
