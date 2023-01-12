package typings.fpTs.anon

import typings.fpTs.libTheseTMod.TheseT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ap[E, M] extends StObject {
  
  val _E: E
  
  def ap[A, B](mab: TheseT[M, E, js.Function1[/* a */ A, B]], ma: TheseT[M, E, A]): TheseT[M, E, B]
  
  def chain[A, B](ma: TheseT[M, E, A], f: js.Function1[/* a */ A, TheseT[M, E, B]]): TheseT[M, E, B]
  
  def map[A, B](ma: TheseT[M, E, A], f: js.Function1[/* a */ A, B]): TheseT[M, E, B]
  
  def of[A](a: A): TheseT[M, E, A]
}
object Ap {
  
  inline def apply[E, M](
    _E: E,
    ap: (TheseT[M, E, js.Function1[Any, Any]], TheseT[M, E, Any]) => TheseT[M, E, Any],
    chain: (TheseT[M, E, Any], js.Function1[Any, TheseT[M, E, Any]]) => TheseT[M, E, Any],
    map: (TheseT[M, E, Any], js.Function1[Any, Any]) => TheseT[M, E, Any],
    of: Any => TheseT[M, E, Any]
  ): Ap[E, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Ap[E, M]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ap[?, ?], E, M] (val x: Self & (Ap[E, M])) extends AnyVal {
    
    inline def setAp(value: (TheseT[M, E, js.Function1[Any, Any]], TheseT[M, E, Any]) => TheseT[M, E, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(value: (TheseT[M, E, Any], js.Function1[Any, TheseT[M, E, Any]]) => TheseT[M, E, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (TheseT[M, E, Any], js.Function1[Any, Any]) => TheseT[M, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => TheseT[M, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
