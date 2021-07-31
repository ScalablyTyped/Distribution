package typings.fpTs.pipeableMod

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFoldableWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E]
  extends StObject
     with PipeableFoldable2C[F, E] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      M
    ]
  ]
  
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    B
  ]
  
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    B
  ]
}
object PipeableFoldableWithIndex2C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E](
    foldMap: Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
        js.Any
      ]
    ],
    foldMapWithIndex: Monoid[js.Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
        js.Any
      ]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceRightWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      js.Any
    ]
  ): PipeableFoldableWithIndex2C[F, I, E] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
    __obj.asInstanceOf[PipeableFoldableWithIndex2C[F, I, E]]
  }
  
  @scala.inline
  implicit class PipeableFoldableWithIndex2CMutableBuilder[Self <: PipeableFoldableWithIndex2C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E] (val x: Self & (PipeableFoldableWithIndex2C[F, I, E])) extends AnyVal {
    
    @scala.inline
    def setFoldMapWithIndex(
      value: Monoid[js.Any] => js.Function1[
          /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
          js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
            js.Any
          ]
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRightWithIndex(
      value: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReduceWithIndex(
      value: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction2(value))
  }
}
