package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerType extends StObject {
  
  var pointerType: js.UndefOr[String] = js.undefined
}
object PointerType {
  
  inline def apply(): PointerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerType]
  }
  
  extension [Self <: PointerType](x: Self) {
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
  }
}
