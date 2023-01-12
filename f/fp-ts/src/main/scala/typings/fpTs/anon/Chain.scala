package typings.fpTs.anon

import typings.fpTs.libTheseTMod.TheseT1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
  
  val _E: E
  
  def ap[A, B](mab: TheseT1[M, E, js.Function1[/* a */ A, B]], ma: TheseT1[M, E, A]): TheseT1[M, E, B]
  
  def chain[A, B](ma: TheseT1[M, E, A], f: js.Function1[/* a */ A, TheseT1[M, E, B]]): TheseT1[M, E, B]
  
  def map[A, B](ma: TheseT1[M, E, A], f: js.Function1[/* a */ A, B]): TheseT1[M, E, B]
  
  def of[A](a: A): TheseT1[M, E, A]
}
object Chain {
  
  inline def apply[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
    _E: E,
    ap: (TheseT1[M, E, js.Function1[Any, Any]], TheseT1[M, E, Any]) => TheseT1[M, E, Any],
    chain: (TheseT1[M, E, Any], js.Function1[Any, TheseT1[M, E, Any]]) => TheseT1[M, E, Any],
    map: (TheseT1[M, E, Any], js.Function1[Any, Any]) => TheseT1[M, E, Any],
    of: Any => TheseT1[M, E, Any]
  ): Chain[E, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Chain[E, M]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chain[?, ?], E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] (val x: Self & (Chain[E, M])) extends AnyVal {
    
    inline def setAp(value: (TheseT1[M, E, js.Function1[Any, Any]], TheseT1[M, E, Any]) => TheseT1[M, E, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(value: (TheseT1[M, E, Any], js.Function1[Any, TheseT1[M, E, Any]]) => TheseT1[M, E, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (TheseT1[M, E, Any], js.Function1[Any, Any]) => TheseT1[M, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => TheseT1[M, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
