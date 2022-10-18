package typings.fpTs.anon

import typings.fpTs.libWriterTMod.WriterT3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EMap[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
  
  val _E: W
  
  def ap[R, E, A, B](mab: WriterT3[M, R, E, W, js.Function1[/* a */ A, B]], ma: WriterT3[M, R, E, W, A]): WriterT3[M, R, E, W, B]
  
  def chain[R, E, A, B](ma: WriterT3[M, R, E, W, A], f: js.Function1[/* a */ A, WriterT3[M, R, E, W, B]]): WriterT3[M, R, E, W, B]
  
  def map[R, E, A, B](ma: WriterT3[M, R, E, W, A], f: js.Function1[/* a */ A, B]): WriterT3[M, R, E, W, B]
  
  def of[R, E, A](a: A): WriterT3[M, R, E, W, A]
}
object EMap {
  
  inline def apply[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
    _E: W,
    ap: (WriterT3[M, Any, Any, W, js.Function1[Any, Any]], WriterT3[M, Any, Any, W, Any]) => WriterT3[M, Any, Any, W, Any],
    chain: (WriterT3[M, Any, Any, W, Any], js.Function1[Any, WriterT3[M, Any, Any, W, Any]]) => WriterT3[M, Any, Any, W, Any],
    map: (WriterT3[M, Any, Any, W, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, W, Any],
    of: Any => WriterT3[M, Any, Any, W, Any]
  ): EMap[W, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[EMap[W, M]]
  }
  
  extension [Self <: EMap[?, ?], W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & (EMap[W, M])) {
    
    inline def setAp(
      value: (WriterT3[M, Any, Any, W, js.Function1[Any, Any]], WriterT3[M, Any, Any, W, Any]) => WriterT3[M, Any, Any, W, Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(
      value: (WriterT3[M, Any, Any, W, Any], js.Function1[Any, WriterT3[M, Any, Any, W, Any]]) => WriterT3[M, Any, Any, W, Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (WriterT3[M, Any, Any, W, Any], js.Function1[Any, Any]) => WriterT3[M, Any, Any, W, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => WriterT3[M, Any, Any, W, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: W): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
