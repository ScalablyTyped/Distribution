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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowDropInsideItem extends StObject {
  
  var allowDropInsideItem: js.UndefOr[Boolean] = js.native
  
  var allowReordering: js.UndefOr[Boolean] = js.native
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[String | typings.std.Element | JQuery] = js.native
  
  var container: js.UndefOr[String | typings.std.Element | JQuery] = js.native
  
  var cursorOffset: js.UndefOr[String | Y] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.native
  
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ ItemElement, 
      /* containerElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var onAdd: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.native
  
  var onDragChange: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  
  var onDragMove: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromData, _]] = js.native
  
  var onRemove: js.UndefOr[js.Function1[/* e */ FromIndex, _]] = js.native
  
  var onReorder: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.native
  
  var scrollSensitivity: js.UndefOr[Double] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  var showDragIcons: js.UndefOr[Boolean] = js.native
}
object AllowDropInsideItem {
  
  @scala.inline
  def apply(): AllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDropInsideItem]
  }
  
  @scala.inline
  implicit class AllowDropInsideItemMutableBuilder[Self <: AllowDropInsideItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDropInsideItem(value: Boolean): Self = StObject.set(x, "allowDropInsideItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDropInsideItemUndefined: Self = StObject.set(x, "allowDropInsideItem", js.undefined)
    
    @scala.inline
    def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setBoundary(value: String | typings.std.Element | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    @scala.inline
    def setContainer(value: String | typings.std.Element | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCursorOffset(value: String | Y): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDragDirection(value: both | horizontal | vertical): Self = StObject.set(x, "dragDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDirectionUndefined: Self = StObject.set(x, "dragDirection", js.undefined)
    
    @scala.inline
    def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ ItemElement, 
          /* containerElement */ dxElement, 
          String | typings.std.Element | JQuery
        ])
    ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragTemplateFunction2(
      value: (/* dragInfo */ ItemElement, /* containerElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
    
    @scala.inline
    def setDropFeedbackMode(value: push | indicate): Self = StObject.set(x, "dropFeedbackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropFeedbackModeUndefined: Self = StObject.set(x, "dropFeedbackMode", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* e */ DropInsideItem => _): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    @scala.inline
    def setOnDragChange(value: /* e */ FromComponent => _): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* e */ FromComponent => _): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* e */ FromComponent => _): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* e */ FromData => _): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* e */ FromIndex => _): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    @scala.inline
    def setOnReorder(value: /* e */ ToComponent => _): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
    
    @scala.inline
    def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    @scala.inline
    def setShowDragIcons(value: Boolean): Self = StObject.set(x, "showDragIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDragIconsUndefined: Self = StObject.set(x, "showDragIcons", js.undefined)
  }
}
