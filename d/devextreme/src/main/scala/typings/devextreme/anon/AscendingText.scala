package typings.devextreme.anon

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AscendingText extends StObject {
  
  var ascendingText: js.UndefOr[String] = js.undefined
  
  var clearText: js.UndefOr[String] = js.undefined
  
  var descendingText: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[multiple | none | single_] = js.undefined
  
  var showSortIndexes: js.UndefOr[Boolean] = js.undefined
}
object AscendingText {
  
  inline def apply(): AscendingText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingText]
  }
  
  extension [Self <: AscendingText](x: Self) {
    
    inline def setAscendingText(value: String): Self = StObject.set(x, "ascendingText", value.asInstanceOf[js.Any])
    
    inline def setAscendingTextUndefined: Self = StObject.set(x, "ascendingText", js.undefined)
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setDescendingText(value: String): Self = StObject.set(x, "descendingText", value.asInstanceOf[js.Any])
    
    inline def setDescendingTextUndefined: Self = StObject.set(x, "descendingText", js.undefined)
    
    inline def setMode(value: multiple | none | single_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowSortIndexes(value: Boolean): Self = StObject.set(x, "showSortIndexes", value.asInstanceOf[js.Any])
    
    inline def setShowSortIndexesUndefined: Self = StObject.set(x, "showSortIndexes", js.undefined)
  }
}
