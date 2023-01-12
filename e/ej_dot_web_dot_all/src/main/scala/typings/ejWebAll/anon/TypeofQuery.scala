package typings.ejWebAll.anon

import typings.ejWebAll.ej.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuery extends StObject {
  
  /* static member */
  def extend(prototype: Any): Query
  
  /* static member */
  var fn: Query
}
object TypeofQuery {
  
  inline def apply(extend: Any => Query, fn: Query): TypeofQuery = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofQuery] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: Any => Query): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Query): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
