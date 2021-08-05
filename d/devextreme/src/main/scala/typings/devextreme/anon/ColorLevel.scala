package typings.devextreme.anon

import typings.devextreme.devextremeStrings.close
import typings.devextreme.devextremeStrings.high
import typings.devextreme.devextremeStrings.low
import typings.devextreme.devextremeStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorLevel extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[close | high | low | open] = js.undefined
}
object ColorLevel {
  
  inline def apply(): ColorLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorLevel]
  }
  
  extension [Self <: ColorLevel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLevel(value: close | high | low | open): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
