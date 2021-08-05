package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  def next(): DoneBoolean
}
object `13` {
  
  inline def apply(next: () => DoneBoolean): `13` = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setNext(value: () => DoneBoolean): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
