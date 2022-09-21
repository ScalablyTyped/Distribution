package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePropWhenValueIsNull extends StObject {
  
  var removePropWhenValueIsNull: js.UndefOr[Boolean] = js.undefined
}
object RemovePropWhenValueIsNull {
  
  inline def apply(): RemovePropWhenValueIsNull = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemovePropWhenValueIsNull]
  }
  
  extension [Self <: RemovePropWhenValueIsNull](x: Self) {
    
    inline def setRemovePropWhenValueIsNull(value: Boolean): Self = StObject.set(x, "removePropWhenValueIsNull", value.asInstanceOf[js.Any])
    
    inline def setRemovePropWhenValueIsNullUndefined: Self = StObject.set(x, "removePropWhenValueIsNull", js.undefined)
  }
}
