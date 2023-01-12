package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDraggable.DragEndEvent
import typings.devextreme.mod.DevExpress.ui.dxDraggable.DragMoveEvent
import typings.devextreme.mod.DevExpress.ui.dxDraggable.DragStartEvent
import typings.devextreme.mod.DevExpress.ui.dxDraggable.DragTemplateData
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDraggableOptions
  extends StObject
     with DraggableBaseOptions[dxDraggable] {
  
  /**
    * Allows a user to drag clones of items instead of actual items.
    */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies custom markup to be shown instead of the item being dragged.
    */
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ DragTemplateData, 
      /* containerElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A function that is called when drag gesture is finished.
    */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DragEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is called every time a draggable item is moved.
    */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DragMoveEvent, Unit]] = js.undefined
  
  /**
    * A function that is called when the drag gesture is initialized.
    */
  var onDragStart: js.UndefOr[js.Function1[/* e */ DragStartEvent, Unit]] = js.undefined
}
object dxDraggableOptions {
  
  inline def apply(): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDraggableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDraggableOptions] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ DragTemplateData, 
          /* containerElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
    
    inline def setDragTemplateFunction2(
      value: (/* dragInfo */ DragTemplateData, /* containerElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
    
    inline def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
    
    inline def setOnDragEnd(value: /* e */ DragEndEvent => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragMove(value: /* e */ DragMoveEvent => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
    
    inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
    
    inline def setOnDragStart(value: /* e */ DragStartEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
  }
}
