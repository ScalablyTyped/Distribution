package typings.extjs.Ext.dd

import typings.extjs.Ext.Array
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDragZone
  extends StObject
     with IDragSource {
  
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Called when a mousedown occurs in this container
    * @param e Event The mouse down event
    * @returns Object The dragData
    */
  @JSName("getDragData")
  var getDragData_IDragZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], js.Any]] = js.undefined
  
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
    * @param e Event The mouse up event
    * @returns Number[] The xy location (e.g. [100, 200])
    */
  var getRepairXY: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.undefined
  
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
    * @param x Number The x position of the click on the dragged object
    * @param y Number The y position of the click on the dragged object
    * @returns Boolean true to continue the drag, false to cancel
    */
  var onInitDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.dom.Element) */
  var scrollEl: js.UndefOr[js.Any] = js.undefined
}
object IDragZone {
  
  inline def apply(): IDragZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragZone]
  }
  
  extension [Self <: IDragZone](x: Self) {
    
    inline def setContainerScroll(value: js.Any): Self = StObject.set(x, "containerScroll", value.asInstanceOf[js.Any])
    
    inline def setContainerScrollUndefined: Self = StObject.set(x, "containerScroll", js.undefined)
    
    inline def setGetDragData(value: /* e */ js.UndefOr[Event] => js.Any): Self = StObject.set(x, "getDragData", js.Any.fromFunction1(value))
    
    inline def setGetDragDataUndefined: Self = StObject.set(x, "getDragData", js.undefined)
    
    inline def setGetRepairXY(value: /* e */ js.UndefOr[Event] => Array): Self = StObject.set(x, "getRepairXY", js.Any.fromFunction1(value))
    
    inline def setGetRepairXYUndefined: Self = StObject.set(x, "getRepairXY", js.undefined)
    
    inline def setOnInitDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "onInitDrag", js.Any.fromFunction2(value))
    
    inline def setOnInitDragUndefined: Self = StObject.set(x, "onInitDrag", js.undefined)
    
    inline def setScrollEl(value: js.Any): Self = StObject.set(x, "scrollEl", value.asInstanceOf[js.Any])
    
    inline def setScrollElUndefined: Self = StObject.set(x, "scrollEl", js.undefined)
  }
}
