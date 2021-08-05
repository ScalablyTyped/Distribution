package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def next(): DoneValue
}
object `8` {
  
  inline def apply(next: () => DoneValue): `8` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setNext(value: () => DoneValue): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
