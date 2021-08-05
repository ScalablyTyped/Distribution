package typings.devextreme.anon

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontOffset extends StObject {
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}
object FontOffset {
  
  inline def apply(): FontOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOffset]
  }
  
  extension [Self <: FontOffset](x: Self) {
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextOverflow(value: ellipsis | hide | none): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWordWrap(value: normal | breakWord | none): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
