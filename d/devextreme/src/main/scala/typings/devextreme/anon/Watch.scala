package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watch extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[js.Any] = js.undefined
  
  var watch: js.UndefOr[js.Function] = js.undefined
}
object Watch {
  
  inline def apply(): Watch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Watch]
  }
  
  extension [Self <: Watch](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
