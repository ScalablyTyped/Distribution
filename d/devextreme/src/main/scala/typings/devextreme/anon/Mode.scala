package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: js.UndefOr[standard | virtual] = js.undefined
  
  var useNative: js.UndefOr[Boolean | auto] = js.undefined
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: standard | virtual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setUseNative(value: Boolean | auto): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
