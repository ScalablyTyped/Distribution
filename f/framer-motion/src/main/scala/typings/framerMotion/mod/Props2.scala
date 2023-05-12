package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props2 extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var inherit: js.UndefOr[InheritOption] = js.undefined
}
object Props2 {
  
  inline def apply(): Props2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props2] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInherit(value: InheritOption): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
  }
}
