package typings.fpTs.anon

import typings.fpTs.writerTMod.WriterT1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Of[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
  
  val _E: W
  
  def ap[A, B](mab: WriterT1[M, W, js.Function1[/* a */ A, B]], ma: WriterT1[M, W, A]): WriterT1[M, W, B]
  
  def chain[A, B](ma: WriterT1[M, W, A], f: js.Function1[/* a */ A, WriterT1[M, W, B]]): WriterT1[M, W, B]
  
  def map[A, B](ma: WriterT1[M, W, A], f: js.Function1[/* a */ A, B]): WriterT1[M, W, B]
  
  def of[A](a: A): WriterT1[M, W, A]
}
object Of {
  
  inline def apply[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
    _E: W,
    ap: (WriterT1[M, W, js.Function1[js.Any, js.Any]], WriterT1[M, W, js.Any]) => WriterT1[M, W, js.Any],
    chain: (WriterT1[M, W, js.Any], js.Function1[js.Any, WriterT1[M, W, js.Any]]) => WriterT1[M, W, js.Any],
    map: (WriterT1[M, W, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, W, js.Any],
    of: js.Any => WriterT1[M, W, js.Any]
  ): Of[W, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Of[W, M]]
  }
  
  extension [Self <: Of[?, ?], W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & (Of[W, M])) {
    
    inline def setAp(
      value: (WriterT1[M, W, js.Function1[js.Any, js.Any]], WriterT1[M, W, js.Any]) => WriterT1[M, W, js.Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(
      value: (WriterT1[M, W, js.Any], js.Function1[js.Any, WriterT1[M, W, js.Any]]) => WriterT1[M, W, js.Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (WriterT1[M, W, js.Any], js.Function1[js.Any, js.Any]) => WriterT1[M, W, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: js.Any => WriterT1[M, W, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: W): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
