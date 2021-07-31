package typings.fpTs.pipeableMod

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFoldable3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] extends StObject {
  
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      M
    ]
  ]
  
  def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    B
  ]
  
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    B
  ]
}
object PipeableFoldable3C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
    foldMap: Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
        js.Any
      ]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ]
  ): PipeableFoldable3C[F, E] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight))
    __obj.asInstanceOf[PipeableFoldable3C[F, E]]
  }
  
  @scala.inline
  implicit class PipeableFoldable3CMutableBuilder[Self <: PipeableFoldable3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (PipeableFoldable3C[F, E])) extends AnyVal {
    
    @scala.inline
    def setFoldMap(
      value: Monoid[js.Any] => js.Function1[
          /* f */ js.Function1[/* a */ js.Any, js.Any], 
          js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
            js.Any
          ]
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReduceRight(
      value: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction2(value))
  }
}
