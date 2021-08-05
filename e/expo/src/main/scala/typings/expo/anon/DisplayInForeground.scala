package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayInForeground extends StObject {
  
  var _displayInForeground: js.UndefOr[Boolean] = js.undefined
  
  var sound: js.UndefOr[Boolean] = js.undefined
}
object DisplayInForeground {
  
  inline def apply(): DisplayInForeground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayInForeground]
  }
  
  extension [Self <: DisplayInForeground](x: Self) {
    
    inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def set_displayInForeground(value: Boolean): Self = StObject.set(x, "_displayInForeground", value.asInstanceOf[js.Any])
    
    inline def set_displayInForegroundUndefined: Self = StObject.set(x, "_displayInForeground", js.undefined)
  }
}
