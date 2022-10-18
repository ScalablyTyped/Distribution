package typings.fpTs.libFoldableMod

import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Foldable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
  
  val URI: F
  
  val _E: E
  
  def foldMap[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, M], 
    M
  ]
  
  def reduce[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
  
  def reduceRight[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}
object Foldable2C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
    URI: F,
    _E: E,
    foldMap: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* f */ js.Function1[/* a */ Any, Any], 
      Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, Any, js.Function2[Any, Any, Any]) => Any
  ): Foldable2C[F, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight))
    __obj.asInstanceOf[Foldable2C[F, E]]
  }
  
  extension [Self <: Foldable2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Foldable2C[F, E])) {
    
    inline def setFoldMap(
      value: Monoid[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
          /* f */ js.Function1[/* a */ Any, Any], 
          Any
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, Any, js.Function2[Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
    
    inline def setReduceRight(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, Any, js.Function2[Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction3(value))
    
    inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
