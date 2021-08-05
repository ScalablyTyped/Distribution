package typings.esfxTypeModel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  def next(): Done
}
object Next {
  
  inline def apply(next: () => Done): Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setNext(value: () => Done): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
