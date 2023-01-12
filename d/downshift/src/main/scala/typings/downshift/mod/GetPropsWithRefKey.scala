package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropsWithRefKey extends StObject {
  
  var refKey: js.UndefOr[String] = js.undefined
}
object GetPropsWithRefKey {
  
  inline def apply(): GetPropsWithRefKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsWithRefKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropsWithRefKey] (val x: Self) extends AnyVal {
    
    inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
    
    inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
  }
}
