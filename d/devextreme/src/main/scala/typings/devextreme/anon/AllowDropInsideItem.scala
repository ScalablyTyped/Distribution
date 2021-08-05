package typings.devextreme.anon

import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDropInsideItem extends StObject {
  
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[String | typings.std.Element | JQuery] = js.undefined
  
  var container: js.UndefOr[String | typings.std.Element | JQuery] = js.undefined
  
  var cursorOffset: js.UndefOr[String | Y] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.undefined
  
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ ItemElement, 
      /* containerElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.undefined
  
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var onAdd: js.UndefOr[js.Function1[/* e */ DropInsideItem, js.Any]] = js.undefined
  
  var onDragChange: js.UndefOr[js.Function1[/* e */ FromComponent, js.Any]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ FromComponent, js.Any]] = js.undefined
  
  var onDragMove: js.UndefOr[js.Function1[/* e */ FromComponent, js.Any]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromData, js.Any]] = js.undefined
  
  var onRemove: js.UndefOr[js.Function1[/* e */ FromIndex, js.Any]] = js.undefined
  
  var onReorder: js.UndefOr[js.Function1[/* e */ ToComponent, js.Any]] = js.undefined
  
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  var showDragIcons: js.UndefOr[Boolean] = js.undefined
}
object AllowDropInsideItem {
  
  inline def apply(): AllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDropInsideItem]
  }
  
  extension [Self <: AllowDropInsideItem](x: Self) {
    
    inline def setAllowDropInsideItem(value: Boolean): Self = StObject.set(x, "allowDropInsideItem", value.asInstanceOf[js.Any])
    
    inline def setAllowDropInsideItemUndefined: Self = StObject.set(x, "allowDropInsideItem", js.undefined)
    
    inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
    
    inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setBoundary(value: String | typings.std.Element | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setContainer(value: String | typings.std.Element | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCursorOffset(value: String | Y): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    inline def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDragDirection(value: both | horizontal | vertical): Self = StObject.set(x, "dragDirection", value.asInstanceOf[js.Any])
    
    inline def setDragDirectionUndefined: Self = StObject.set(x, "dragDirection", js.undefined)
    
    inline def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ ItemElement, 
          /* containerElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
    
    inline def setDragTemplateFunction2(
      value: (/* dragInfo */ ItemElement, /* containerElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
    
    inline def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
    
    inline def setDropFeedbackMode(value: push | indicate): Self = StObject.set(x, "dropFeedbackMode", value.asInstanceOf[js.Any])
    
    inline def setDropFeedbackModeUndefined: Self = StObject.set(x, "dropFeedbackMode", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setOnAdd(value: /* e */ DropInsideItem => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnDragChange(value: /* e */ FromComponent => js.Any): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
    
    inline def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ FromComponent => js.Any): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ FromComponent => js.Any): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ FromData => js.Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnRemove(value: /* e */ FromIndex => js.Any): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnReorder(value: /* e */ ToComponent => js.Any): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
    
    inline def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setShowDragIcons(value: Boolean): Self = StObject.set(x, "showDragIcons", value.asInstanceOf[js.Any])
    
    inline def setShowDragIconsUndefined: Self = StObject.set(x, "showDragIcons", js.undefined)
  }
}
