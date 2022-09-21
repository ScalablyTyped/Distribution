package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnHide extends StObject {
  
  var onHide: js.UndefOr[Boolean] = js.undefined
}
object OnHide {
  
  inline def apply(): OnHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnHide]
  }
  
  extension [Self <: OnHide](x: Self) {
    
    inline def setOnHide(value: Boolean): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
  }
}
