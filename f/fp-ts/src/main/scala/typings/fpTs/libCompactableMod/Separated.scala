package typings.fpTs.libCompactableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Separated[A, B] extends StObject {
  
  val left: A
  
  val right: B
}
object Separated {
  
  inline def apply[A, B](left: A, right: B): Separated[A, B] = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separated[A, B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Separated[?, ?], A, B] (val x: Self & (Separated[A, B])) extends AnyVal {
    
    inline def setLeft(value: A): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: B): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
