package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootPropsOptions extends StObject {
  
  var refKey: js.UndefOr[String] = js.undefined
}
object GetRootPropsOptions {
  
  inline def apply(): GetRootPropsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRootPropsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRootPropsOptions] (val x: Self) extends AnyVal {
    
    inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
    
    inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
  }
}
