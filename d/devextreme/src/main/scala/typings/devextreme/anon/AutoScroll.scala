package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScroll extends StObject {
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var onAdd: js.UndefOr[js.Function1[/* e */ EventFromComponent, js.Any]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ CancelEvent, js.Any]] = js.undefined
  
  var onDragMove: js.UndefOr[js.Function1[/* e */ CancelEvent, js.Any]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataItemData, js.Any]] = js.undefined
  
  var onRemove: js.UndefOr[js.Function1[/* e */ FromComponentFromData, js.Any]] = js.undefined
  
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}
object AutoScroll {
  
  inline def apply(): AutoScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScroll]
  }
  
  extension [Self <: AutoScroll](x: Self) {
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setOnAdd(value: /* e */ EventFromComponent => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ CancelEvent => js.Any): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ CancelEvent => js.Any): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ FromDataItemData => js.Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnRemove(value: /* e */ FromComponentFromData => js.Any): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
  }
}
