package typings.fpTs.foldableWithIndexMod

import typings.fpTs.foldableMod.Foldable3C
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableWithIndex3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E]
  extends StObject
     with Foldable3C[F, E] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  
  def reduceRightWithIndex[R, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
    b: B,
    f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]
  ): B
  
  def reduceWithIndex[R, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any,
    b: B,
    f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]
  ): B
}
object FoldableWithIndex3C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E](
    URI: F,
    _E: E,
    foldMap: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRightWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndex3C[F, I, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), reduceRightWithIndex = js.Any.fromFunction3(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
    __obj.asInstanceOf[FoldableWithIndex3C[F, I, E]]
  }
  
  @scala.inline
  implicit class FoldableWithIndex3CMutableBuilder[Self <: FoldableWithIndex3C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, I, E] (val x: Self & (FoldableWithIndex3C[F, I, E])) extends AnyVal {
    
    @scala.inline
    def setFoldMapWithIndex(
      value: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
          /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
          js.Any
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRightWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduceWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction3(value))
  }
}
