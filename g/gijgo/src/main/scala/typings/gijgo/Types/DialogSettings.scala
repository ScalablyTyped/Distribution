package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Dialog
@js.native
trait DialogSettings extends StObject {
  
  var autoOpen: js.UndefOr[Boolean] = js.native
  
  var closeButtonInHeader: js.UndefOr[Boolean] = js.native
  
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  //Events
  var closed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var closing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var dragStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var dragStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var opened: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var opening: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var resizeStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var resizeStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DialogSettings {
  
  @scala.inline
  def apply(): DialogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSettings]
  }
  
  @scala.inline
  implicit class DialogSettingsMutableBuilder[Self <: DialogSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    @scala.inline
    def setCloseButtonInHeader(value: Boolean): Self = StObject.set(x, "closeButtonInHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonInHeaderUndefined: Self = StObject.set(x, "closeButtonInHeader", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
    
    @scala.inline
    def setClosed(value: /* e */ js.Any => _): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setClosing(value: /* e */ js.Any => _): Self = StObject.set(x, "closing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClosingUndefined: Self = StObject.set(x, "closing", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ js.Any => _): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStart(value: /* e */ js.Any => _): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: /* e */ js.Any => _): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInitialized(value: /* e */ js.Any => _): Self = StObject.set(x, "initialized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setOpened(value: /* e */ js.Any => _): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setOpening(value: /* e */ js.Any => _): Self = StObject.set(x, "opening", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpeningUndefined: Self = StObject.set(x, "opening", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ js.Any => _): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeStart(value: /* e */ js.Any => _): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    @scala.inline
    def setResizeStop(value: /* e */ js.Any => _): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
