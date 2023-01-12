package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisible extends StObject {
  
  var isFocusVisible: Boolean
}
object IsFocusVisible {
  
  inline def apply(isFocusVisible: Boolean): IsFocusVisible = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsFocusVisible] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
  }
}
