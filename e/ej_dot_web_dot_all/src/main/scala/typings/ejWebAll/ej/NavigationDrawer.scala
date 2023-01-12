package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDrawer
  extends StObject
     with Widget_ {
  
  /** To close the navigation drawer control
    * @returns {void}
    */
  def close(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To load AJAX content into NavigationDrawer container.
    * @returns {void}
    */
  def loadContent(): Unit = js.native
  
  @JSName("model")
  var model_NavigationDrawer: Model = js.native
  
  /** To open the navigation drawer control
    * @returns {void}
    */
  def open(): Unit = js.native
  
  /** To Toggle the navigation drawer control
    * @returns {void}
    */
  def toggle(): Unit = js.native
}
object NavigationDrawer {
  
  trait AjaxCompleteEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Response content.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxCompleteEventArgs {
    
    inline def apply(): AjaxCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait AjaxErrorEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Error page content.
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /** Error code.
      */
    var status: js.UndefOr[Double] = js.undefined
    
    /** The corresponding error description.
      */
    var statusText: js.UndefOr[String] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxErrorEventArgs {
    
    inline def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the page will be cached in the web browser.
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the type of data is send in the query string.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /** It specifies the data as an object, will be passed in the query string.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** It specifies the type of data that you're expecting back from the response.
      */
    var dataType: js.UndefOr[String] = js.undefined
    
    /** It specifies the HTTP request type.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxSettings {
    
    inline def apply(): typings.ejWebAll.ej.NavigationDrawer.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.NavigationDrawer.AjaxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.NavigationDrawer.AjaxSettings] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxSuccessEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Response content.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the navigation drawer model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxSuccessEventArgs {
    
    inline def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait BeforeCloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCloseEventArgs {
    
    inline def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Event triggers after the AJAX content loaded completely.
      */
    var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the AJAX request failed.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
    
    /** Specifies the ajaxSettings option to load the content to the NavigationDrawer control.
      * @Default {null}
      */
    var ajaxSettings: js.UndefOr[typings.ejWebAll.ej.NavigationDrawer.AjaxSettings] = js.undefined
    
    /** Event triggers after the AJAX content loaded successfully.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
    
    /** Event triggers before the control gets closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the contentId for navigation drawer, where the AJAX content need to updated
      * @Default {null}
      */
    var contentId: js.UndefOr[String] = js.undefined
    
    /** Sets the root class for NavigationDrawer theme. This cssClass API helps to use custom skinning option for NavigationDrawer control. By defining the root class using this API, we
      * need to include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Sets the Direction for the control. See Direction
      * @Default {left}
      */
    var direction: js.UndefOr[Direction | String] = js.undefined
    
    /** Sets the listview to be enabled or not
      * @Default {false}
      */
    var enableListView: js.UndefOr[Boolean] = js.undefined
    
    /** Navigation pane opened initially when isPaneOpen property is true.
      * @Default {false}
      */
    var isPaneOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the listview items as an array of object.
      * @Default {[]}
      */
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Sets all the properties of listview to render in navigation drawer
      */
    var listViewSettings: js.UndefOr[Any] = js.undefined
    
    /** Event triggers when the control open.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Specifies position whether it is in fixed or relative to the page. See Position
      * @Default {normal}
      */
    var position: js.UndefOr[String] = js.undefined
    
    /** Event triggers when the Swipe happens.
      */
    var swipe: js.UndefOr[js.Function1[/* e */ SwipeEventArgs, Unit]] = js.undefined
    
    /** Specifies the targetId for navigation drawer
      */
    var targetId: js.UndefOr[String] = js.undefined
    
    /** Sets the rendering type of the control. See Type
      * @Default {overlay}
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the control
      * @Default {auto}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.NavigationDrawer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.NavigationDrawer.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.NavigationDrawer.Model] (val x: Self) extends AnyVal {
      
      inline def setAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = StObject.set(x, "ajaxComplete", js.Any.fromFunction1(value))
      
      inline def setAjaxCompleteUndefined: Self = StObject.set(x, "ajaxComplete", js.undefined)
      
      inline def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxSettings(value: typings.ejWebAll.ej.NavigationDrawer.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      inline def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      inline def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDirection(value: Direction | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnableListView(value: Boolean): Self = StObject.set(x, "enableListView", value.asInstanceOf[js.Any])
      
      inline def setEnableListViewUndefined: Self = StObject.set(x, "enableListView", js.undefined)
      
      inline def setIsPaneOpen(value: Boolean): Self = StObject.set(x, "isPaneOpen", value.asInstanceOf[js.Any])
      
      inline def setIsPaneOpenUndefined: Self = StObject.set(x, "isPaneOpen", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setListViewSettings(value: Any): Self = StObject.set(x, "listViewSettings", value.asInstanceOf[js.Any])
      
      inline def setListViewSettingsUndefined: Self = StObject.set(x, "listViewSettings", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSwipe(value: /* e */ SwipeEventArgs => Unit): Self = StObject.set(x, "swipe", js.Any.fromFunction1(value))
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SwipeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Navigation Drawer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SwipeEventArgs {
    
    inline def apply(): SwipeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwipeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
