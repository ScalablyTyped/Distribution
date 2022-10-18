package typings.emotionNative.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: js.UndefOr[ElementType[Any]] = js.undefined
  
  var theme: js.UndefOr[typings.emotionReact.mod.Theme] = js.undefined
}
object As {
  
  inline def apply(): As = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setTheme(value: typings.emotionReact.mod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
