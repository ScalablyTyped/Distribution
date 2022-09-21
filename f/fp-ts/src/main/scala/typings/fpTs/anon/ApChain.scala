package typings.fpTs.anon

import typings.fpTs.writerTMod.WriterT2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApChain[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
  
  val _E: W
  
  def ap[E, A, B](mab: WriterT2[M, E, W, js.Function1[/* a */ A, B]], ma: WriterT2[M, E, W, A]): WriterT2[M, E, W, B]
  
  def chain[E, A, B](ma: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, WriterT2[M, E, W, B]]): WriterT2[M, E, W, B]
  
  def map[E, A, B](ma: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
  
  def of[E, A](a: A): WriterT2[M, E, W, A]
}
object ApChain {
  
  inline def apply[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    _E: W,
    ap: (WriterT2[M, Any, W, js.Function1[Any, Any]], WriterT2[M, Any, W, Any]) => WriterT2[M, Any, W, Any],
    chain: (WriterT2[M, Any, W, Any], js.Function1[Any, WriterT2[M, Any, W, Any]]) => WriterT2[M, Any, W, Any],
    map: (WriterT2[M, Any, W, Any], js.Function1[Any, Any]) => WriterT2[M, Any, W, Any],
    of: Any => WriterT2[M, Any, W, Any]
  ): ApChain[W, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ApChain[W, M]]
  }
  
  extension [Self <: ApChain[?, ?], W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (ApChain[W, M])) {
    
    inline def setAp(
      value: (WriterT2[M, Any, W, js.Function1[Any, Any]], WriterT2[M, Any, W, Any]) => WriterT2[M, Any, W, Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(
      value: (WriterT2[M, Any, W, Any], js.Function1[Any, WriterT2[M, Any, W, Any]]) => WriterT2[M, Any, W, Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (WriterT2[M, Any, W, Any], js.Function1[Any, Any]) => WriterT2[M, Any, W, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => WriterT2[M, Any, W, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: W): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
