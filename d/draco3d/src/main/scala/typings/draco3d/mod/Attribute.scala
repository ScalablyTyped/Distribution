package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  def num_components(): Double
}
object Attribute {
  
  inline def apply(num_components: () => Double): Attribute = {
    val __obj = js.Dynamic.literal(num_components = js.Any.fromFunction0(num_components))
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setNum_components(value: () => Double): Self = StObject.set(x, "num_components", js.Any.fromFunction0(value))
  }
}
