package typings.devextreme.anon

import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
