package typings.fpTs.anon

import typings.fpTs.writerTMod.WriterT2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainE[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
  
  val _E: W
  
  def ap[A, B](mab: WriterT2[M, E, W, js.Function1[/* a */ A, B]], ma: WriterT2[M, E, W, A]): WriterT2[M, E, W, B]
  
  def chain[A, B](ma: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, WriterT2[M, E, W, B]]): WriterT2[M, E, W, B]
  
  def map[A, B](ma: WriterT2[M, E, W, A], f: js.Function1[/* a */ A, B]): WriterT2[M, E, W, B]
  
  def of[A](a: A): WriterT2[M, E, W, A]
}
object ChainE {
  
  @scala.inline
  def apply[W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
    _E: W,
    ap: (WriterT2[M, E, W, js.Function1[js.Any, js.Any]], WriterT2[M, E, W, js.Any]) => WriterT2[M, E, W, js.Any],
    chain: (WriterT2[M, E, W, js.Any], js.Function1[js.Any, WriterT2[M, E, W, js.Any]]) => WriterT2[M, E, W, js.Any],
    map: (WriterT2[M, E, W, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, W, js.Any],
    of: js.Any => WriterT2[M, E, W, js.Any]
  ): ChainE[W, M, E] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[ChainE[W, M, E]]
  }
  
  @scala.inline
  implicit class ChainEMutableBuilder[Self <: ChainE[?, ?, ?], W, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (ChainE[W, M, E])) extends AnyVal {
    
    @scala.inline
    def setAp(
      value: (WriterT2[M, E, W, js.Function1[js.Any, js.Any]], WriterT2[M, E, W, js.Any]) => WriterT2[M, E, W, js.Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChain(
      value: (WriterT2[M, E, W, js.Any], js.Function1[js.Any, WriterT2[M, E, W, js.Any]]) => WriterT2[M, E, W, js.Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMap(value: (WriterT2[M, E, W, js.Any], js.Function1[js.Any, js.Any]) => WriterT2[M, E, W, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOf(value: js.Any => WriterT2[M, E, W, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_E(value: W): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
