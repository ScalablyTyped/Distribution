package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.anon.Y
import typings.devextreme.mod.DevExpress.common.DragDirection
import typings.devextreme.mod.DevExpress.common.DragHighlight
import typings.devextreme.mod.DevExpress.common.ReducedNativeEventInfo
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDragging[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
  
  /**
    * Allows users to drop a row inside another row.
    */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows row reordering using drag and drop gestures.
    */
  var allowReordering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables automatic scrolling while dragging a row beyond the viewport.
    */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a DOM element that limits the dragging area.
    */
  var boundary: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies a custom container in which the draggable row should be rendered.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies the cursor offset from the dragged row.
    */
  var cursorOffset: js.UndefOr[String | Y] = js.undefined
  
  /**
    * A container for custom data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the directions in which a row can be dragged.
    */
  var dragDirection: js.UndefOr[DragDirection] = js.undefined
  
  /**
    * Specifies custom markup to be shown instead of the item being dragged.
    */
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ RowDraggingTemplateData[TRowData], 
      /* containerElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies how to highlight the row&apos;s drop position.
    */
  var dropFeedbackMode: js.UndefOr[DragHighlight] = js.undefined
  
  /**
    * Specifies a CSS selector for draggable rows.
    * @deprecated 
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to group several UI components so that users can drag and drop rows between them.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a CSS selector (ID or class) for the element(s) that should act as the drag handle(s).
    */
  var handle: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is called when a new row is added.
    */
  var onAdd: js.UndefOr[
    js.Function1[
      /* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is called when the dragged row&apos;s position is changed.
    */
  var onDragChange: js.UndefOr[
    js.Function1[
      /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is called when the drag gesture is finished.
    */
  var onDragEnd: js.UndefOr[
    js.Function1[
      /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is called every time a draggable row is moved.
    */
  var onDragMove: js.UndefOr[
    js.Function1[
      /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is called when the drag gesture is initialized.
    */
  var onDragStart: js.UndefOr[
    js.Function1[
      /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & DragStartEventInfo[TRowData], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is called when a draggable row is removed.
    */
  var onRemove: js.UndefOr[
    js.Function1[/* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData], Unit]
  ] = js.undefined
  
  /**
    * A function that is called when the draggable rows are reordered.
    */
  var onReorder: js.UndefOr[
    js.Function1[
      /* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragReorderInfo, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Specifies the distance in pixels from the edge of viewport at which scrolling should start. Applies only if autoScroll is true.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the scrolling speed when dragging a row beyond the viewport. Applies only if autoScroll is true.
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Shows or hides row dragging icons.
    */
  var showDragIcons: js.UndefOr[Boolean] = js.undefined
}
object RowDragging {
  
  inline def apply[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): RowDragging[TComponent, TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDragging[TComponent, TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDragging[?, ?, ?], TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (RowDragging[TComponent, TRowData, TKey])) extends AnyVal {
    
    inline def setAllowDropInsideItem(value: Boolean): Self = StObject.set(x, "allowDropInsideItem", value.asInstanceOf[js.Any])
    
    inline def setAllowDropInsideItemUndefined: Self = StObject.set(x, "allowDropInsideItem", js.undefined)
    
    inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
    
    inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setBoundary(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCursorOffset(value: String | Y): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    inline def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDragDirection(value: DragDirection): Self = StObject.set(x, "dragDirection", value.asInstanceOf[js.Any])
    
    inline def setDragDirectionUndefined: Self = StObject.set(x, "dragDirection", js.undefined)
    
    inline def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ RowDraggingTemplateData[TRowData], 
          /* containerElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
    
    inline def setDragTemplateFunction2(
      value: (/* dragInfo */ RowDraggingTemplateData[TRowData], /* containerElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
    
    inline def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
    
    inline def setDropFeedbackMode(value: DragHighlight): Self = StObject.set(x, "dropFeedbackMode", value.asInstanceOf[js.Any])
    
    inline def setDropFeedbackModeUndefined: Self = StObject.set(x, "dropFeedbackMode", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setOnAdd(
      value: /* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo => Unit
    ): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnDragChange(
      value: /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo => Unit
    ): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
    
    inline def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
    
    inline def setOnDragEnd(
      value: /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo => Unit
    ): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(
      value: /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragDropInfo => Unit
    ): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(
      value: /* e */ Cancelable & ReducedNativeEventInfo[TComponent] & DragStartEventInfo[TRowData] => Unit
    ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnRemove(value: /* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnReorder(
      value: /* e */ ReducedNativeEventInfo[TComponent] & RowDraggingEventInfo[TRowData] & DragReorderInfo => Unit
    ): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
    
    inline def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
    
    inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
    
    inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
    
    inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
    
    inline def setShowDragIcons(value: Boolean): Self = StObject.set(x, "showDragIcons", value.asInstanceOf[js.Any])
    
    inline def setShowDragIconsUndefined: Self = StObject.set(x, "showDragIcons", js.undefined)
  }
}
