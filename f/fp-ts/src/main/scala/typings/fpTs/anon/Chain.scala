package typings.fpTs.anon

import typings.fpTs.theseTMod.TheseT1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] extends StObject {
  
  val _E: E
  
  def ap[A, B](mab: TheseT1[M, E, js.Function1[/* a */ A, B]], ma: TheseT1[M, E, A]): TheseT1[M, E, B]
  
  def chain[A, B](ma: TheseT1[M, E, A], f: js.Function1[/* a */ A, TheseT1[M, E, B]]): TheseT1[M, E, B]
  
  def map[A, B](ma: TheseT1[M, E, A], f: js.Function1[/* a */ A, B]): TheseT1[M, E, B]
  
  def of[A](a: A): TheseT1[M, E, A]
}
object Chain {
  
  @scala.inline
  def apply[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
    _E: E,
    ap: (TheseT1[M, E, js.Function1[js.Any, js.Any]], TheseT1[M, E, js.Any]) => TheseT1[M, E, js.Any],
    chain: (TheseT1[M, E, js.Any], js.Function1[js.Any, TheseT1[M, E, js.Any]]) => TheseT1[M, E, js.Any],
    map: (TheseT1[M, E, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, E, js.Any],
    of: js.Any => TheseT1[M, E, js.Any]
  ): Chain[E, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Chain[E, M]]
  }
  
  @scala.inline
  implicit class ChainMutableBuilder[Self <: Chain[?, ?], E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */] (val x: Self & (Chain[E, M])) extends AnyVal {
    
    @scala.inline
    def setAp(
      value: (TheseT1[M, E, js.Function1[js.Any, js.Any]], TheseT1[M, E, js.Any]) => TheseT1[M, E, js.Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChain(
      value: (TheseT1[M, E, js.Any], js.Function1[js.Any, TheseT1[M, E, js.Any]]) => TheseT1[M, E, js.Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMap(value: (TheseT1[M, E, js.Any], js.Function1[js.Any, js.Any]) => TheseT1[M, E, js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOf(value: js.Any => TheseT1[M, E, js.Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
