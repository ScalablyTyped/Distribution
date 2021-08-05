package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeText[T] extends StObject {
  
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterValue[T], String]] = js.undefined
  
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  
  var texts: js.UndefOr[ClearFilter] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object CustomizeText {
  
  inline def apply[T](): CustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeText[T]]
  }
  
  extension [Self <: CustomizeText[?], T](x: Self & CustomizeText[T]) {
    
    inline def setCustomizeText(value: /* e */ FilterValue[T] => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
    
    inline def setTexts(value: ClearFilter): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
