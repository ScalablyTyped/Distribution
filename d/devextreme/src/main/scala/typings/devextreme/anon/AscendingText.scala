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
  
  @scala.inline
  def apply(): AscendingText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingText]
  }
  
  @scala.inline
  implicit class AscendingTextMutableBuilder[Self <: AscendingText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscendingText(value: String): Self = StObject.set(x, "ascendingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingTextUndefined: Self = StObject.set(x, "ascendingText", js.undefined)
    
    @scala.inline
    def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    @scala.inline
    def setDescendingText(value: String): Self = StObject.set(x, "descendingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingTextUndefined: Self = StObject.set(x, "descendingText", js.undefined)
    
    @scala.inline
    def setMode(value: multiple | none | single_): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setShowSortIndexes(value: Boolean): Self = StObject.set(x, "showSortIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSortIndexesUndefined: Self = StObject.set(x, "showSortIndexes", js.undefined)
  }
}
