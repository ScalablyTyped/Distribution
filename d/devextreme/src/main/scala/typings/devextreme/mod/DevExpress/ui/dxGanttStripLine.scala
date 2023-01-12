package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttStripLine extends StObject {
  
  /**
    * Specifies the name of the cascading style sheet (CSS) class associated with the strip line.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the end point of the strip line.
    */
  var end: js.UndefOr[js.Date | Double | String | (js.Function0[js.Date | Double | String])] = js.undefined
  
  /**
    * Specifies the start point of the strip line.
    */
  var start: js.UndefOr[js.Date | Double | String | (js.Function0[js.Date | Double | String])] = js.undefined
  
  /**
    * Specifies the strip line&apos;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object dxGanttStripLine {
  
  inline def apply(): dxGanttStripLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttStripLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxGanttStripLine] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setEnd(value: js.Date | Double | String | (js.Function0[js.Date | Double | String])): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndFunction0(value: () => js.Date | Double | String): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: js.Date | Double | String | (js.Function0[js.Date | Double | String])): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartFunction0(value: () => js.Date | Double | String): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
