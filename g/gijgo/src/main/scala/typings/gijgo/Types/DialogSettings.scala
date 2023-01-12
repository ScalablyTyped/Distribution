package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Dialog
trait DialogSettings extends StObject {
  
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  
  var closeButtonInHeader: js.UndefOr[Boolean] = js.undefined
  
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  
  //Events
  var closed: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var closing: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dragStop: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var initialized: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var opened: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var opening: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var resizeStart: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var resizeStop: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DialogSettings {
  
  inline def apply(): DialogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogSettings] (val x: Self) extends AnyVal {
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    inline def setCloseButtonInHeader(value: Boolean): Self = StObject.set(x, "closeButtonInHeader", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonInHeaderUndefined: Self = StObject.set(x, "closeButtonInHeader", js.undefined)
    
    inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
    
    inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
    
    inline def setClosed(value: /* e */ Any => Any): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setClosing(value: /* e */ Any => Any): Self = StObject.set(x, "closing", js.Any.fromFunction1(value))
    
    inline def setClosingUndefined: Self = StObject.set(x, "closing", js.undefined)
    
    inline def setDrag(value: /* e */ Any => Any): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragStart(value: /* e */ Any => Any): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragStop(value: /* e */ Any => Any): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
    
    inline def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInitialized(value: /* e */ Any => Any): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setOpened(value: /* e */ Any => Any): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
    
    inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    inline def setOpening(value: /* e */ Any => Any): Self = StObject.set(x, "opening", js.Any.fromFunction1(value))
    
    inline def setOpeningUndefined: Self = StObject.set(x, "opening", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setResize(value: /* e */ Any => Any): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeStart(value: /* e */ Any => Any): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
    
    inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    inline def setResizeStop(value: /* e */ Any => Any): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
    
    inline def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
