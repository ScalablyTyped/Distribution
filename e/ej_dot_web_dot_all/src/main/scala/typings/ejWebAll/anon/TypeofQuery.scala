package typings.ejWebAll.anon

import typings.ejWebAll.ej.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuery extends StObject {
  
  /* static member */
  def extend(prototype: js.Any): Query
  
  /* static member */
  var fn: Query
}
object TypeofQuery {
  
  inline def apply(extend: js.Any => Query, fn: Query): TypeofQuery = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuery]
  }
  
  extension [Self <: TypeofQuery](x: Self) {
    
    inline def setExtend(value: js.Any => Query): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Query): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
