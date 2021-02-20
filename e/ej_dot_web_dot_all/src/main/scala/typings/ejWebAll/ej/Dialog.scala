package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends Widget_ {
  
  /** Closes the dialog widget dynamically.
    * @returns {any}
    */
  def close(): js.Any = js.native
  
  /** Collapses the content area when it is expanded.
    * @returns {any}
    */
  def collapse(): js.Any = js.native
  
  var defaults: Model = js.native
  
  /** Expands the content area when it is collapsed.
    * @returns {any}
    */
  def expand(): js.Any = js.native
  
  /** Sets the focus on the Dialog widget.
    * @returns {any}
    */
  def focus(): js.Any = js.native
  
  /** Checks whether the Dialog widget is opened or not. This methods returns Boolean value.
    * @returns {boolean}
    */
  def isOpen(): Boolean = js.native
  
  /** Maximizes the Dialog widget.
    * @returns {any}
    */
  def maximize(): js.Any = js.native
  
  /** Minimizes the Dialog widget.
    * @returns {any}
    */
  def minimize(): js.Any = js.native
  
  @JSName("model")
  var model_Dialog: Model = js.native
  
  /** Opens the Dialog widget.
    * @returns {any}
    */
  def open(): js.Any = js.native
  
  /** Pins the dialog in its current position.
    * @returns {any}
    */
  def pin(): js.Any = js.native
  
  /** Refreshes the dialog content dynamically.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Restores the dialog.
    * @returns {any}
    */
  def restore(): js.Any = js.native
  
  /** Sets the content for the Dialog widget dynamically.
    * @param {string} The content for the dialog widget. It accepts both string and HTML string.
    * @returns {any}
    */
  def setContent(content: String): js.Any = js.native
  
  /** Sets the title for the Dialog widget.
    * @param {string} The title for the dialog widget.
    * @returns {any}
    */
  def setTitle(Title: String): js.Any = js.native
  
  /** Unpins the Dialog widget.
    * @returns {any}
    */
  def unpin(): js.Any = js.native
}
object Dialog {
  
  @js.native
  trait ActionButtonClickEventArgs extends StObject {
    
    /** Name of the event target attribute.
      */
    var buttonID: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Name of the event current target title.
      */
    var currentTarget: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var event: js.UndefOr[String] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionButtonClickEventArgs {
    
    @scala.inline
    def apply(): ActionButtonClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionButtonClickEventArgs]
    }
    
    @scala.inline
    implicit class ActionButtonClickEventArgsMutableBuilder[Self <: ActionButtonClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonID(value: String): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonIDUndefined: Self = StObject.set(x, "buttonID", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: String): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxErrorEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Error page content.
      */
    var responseText: js.UndefOr[String] = js.native
    
    /** Error code.
      */
    var status: js.UndefOr[Double] = js.native
    
    /** The corresponding error description.
      */
    var statusText: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxErrorEventArgs {
    
    @scala.inline
    def apply(): AjaxErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxErrorEventArgs]
    }
    
    @scala.inline
    implicit class AjaxErrorEventArgsMutableBuilder[Self <: AjaxErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** It specifies the page will be cached in the web browser.
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** It specifies the type of data is send in the query string.
      */
    var contentType: js.UndefOr[String] = js.native
    
    /** It specifies the data as an object, will be passed in the query string.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** It specifies the type of data that you're expecting back from the response.
      */
    var dataType: js.UndefOr[String] = js.native
    
    /** It specifies the HTTP request type.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSettings {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Dialog.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Dialog.AjaxSettings]
    }
    
    @scala.inline
    implicit class AjaxSettingsMutableBuilder[Self <: typings.ejWebAll.ej.Dialog.AjaxSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxSuccessEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Response content.
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSuccessEventArgs {
    
    @scala.inline
    def apply(): AjaxSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSuccessEventArgs]
    }
    
    @scala.inline
    implicit class AjaxSuccessEventArgsMutableBuilder[Self <: AjaxSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCloseEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns true when the dialog activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeCloseEventArgs {
    
    @scala.inline
    def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCloseEventArgsMutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeOpenEventArgsMutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns true when the Dialog activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CollapseEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns true when the Dialog activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CollapseEventArgs {
    
    @scala.inline
    def apply(): CollapseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseEventArgs]
    }
    
    @scala.inline
    implicit class CollapseEventArgsMutableBuilder[Self <: CollapseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ContentLoadEventArgs extends StObject {
    
    /** URL of the content.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Content type
      */
    var contentType: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ContentLoadEventArgs {
    
    @scala.inline
    def apply(): ContentLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentLoadEventArgs]
    }
    
    @scala.inline
    implicit class ContentLoadEventArgsMutableBuilder[Self <: ContentLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContentType(value: js.Any): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragEventArgs {
    
    @scala.inline
    def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    @scala.inline
    implicit class DragEventArgsMutableBuilder[Self <: DragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragStartEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragStartEventArgs {
    
    @scala.inline
    def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit class DragStartEventArgsMutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragStopEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragStopEventArgs {
    
    @scala.inline
    def apply(): DragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStopEventArgs]
    }
    
    @scala.inline
    implicit class DragStopEventArgsMutableBuilder[Self <: DragStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExpandEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns true when the Dialog activated by user interaction otherwise returns false
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ExpandEventArgs {
    
    @scala.inline
    def apply(): ExpandEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandEventArgs]
    }
    
    @scala.inline
    implicit class ExpandEventArgsMutableBuilder[Self <: ExpandEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggered when the custom action button clicked.
      */
    var actionButtonClick: js.UndefOr[js.Function1[/* e */ ActionButtonClickEventArgs, Unit]] = js.native
    
    /** Adds action buttons like close, minimize, pin, maximize in the dialog header.
      */
    var actionButtons: js.UndefOr[js.Array[String]] = js.native
    
    /** This event is triggered whenever the AJAX request fails to retrieve the dialog content.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** Specifies the ajaxSettings option to load the content to the Dialog control.
      * @Default {null}
      */
    var ajaxSettings: js.UndefOr[typings.ejWebAll.ej.Dialog.AjaxSettings] = js.native
    
    /** This event is triggered whenever the AJAX request to retrieve the dialog content, gets succeed.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Enables or disables draggable.
      */
    var allowDraggable: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables keyboard interaction.
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Customizes the Dialog widget animations. The Dialog widget can be animated while opening and closing the dialog. In order to customize animation effects, you need to set
      * â€œenableAnimationâ€ as true. It contains the following sub properties.
      */
    var animation: js.UndefOr[js.Any] = js.native
    
    /** To Enable or disable the scrolling for background element of the modal dialog. This will work only with modal dialog.
      */
    var backgroundScroll: js.UndefOr[Boolean] = js.native
    
    /** This event is triggered before the dialog widgets get closed.
      */
    var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
    
    /** This event is triggered before the dialog widgets gets open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
    
    /** This event is triggered after the dialog widget is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
    
    /** Closes the dialog widget on pressing the ESC key when it is set to true.
      */
    var closeOnEscape: js.UndefOr[Boolean] = js.native
    
    /** Triggered when the dialog content is collapsed.
      */
    var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.native
    
    /** The selector for the container element. If the property is set, then dialog will append to the selected element and it is restricted to move only within the specified container
      * element.
      */
    var containment: js.UndefOr[String] = js.native
    
    /** Triggered after the dialog content is loaded in DOM.
      */
    var contentLoad: js.UndefOr[js.Function1[/* e */ ContentLoadEventArgs, Unit]] = js.native
    
    /** The content type to load the dialog content at run time. The possible values are null, AJAX, iframe and image. When it is null (default value), the content inside dialog element
      * will be displayed as content and when it is not null, the content will be loaded from the URL specified in the contentUrl property.
      */
    var contentType: js.UndefOr[String] = js.native
    
    /** The URL to load the dialog content (such as AJAX, image, and iframe). In order to load content from URL, you need to set contentType as â€˜ajaxâ€™ or â€˜iframeâ€™ or â€˜imageâ€™.
      */
    var contentUrl: js.UndefOr[String] = js.native
    
    /** Triggered after the dialog is created successfully
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** The root class for the Dialog widget to customize the existing theme.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Triggered after the dialog widget is destroyed successfully
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Triggered while the dialog is dragged.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
    
    /** Triggered when the user starts dragging the dialog.
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
    
    /** Triggered when the user stops dragging the dialog.
      */
    var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
    
    /** Enable or disables animation when the dialog is opened or closed.
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Enable or disables modal dialog. The modal dialog acts like a child window that is displayed on top of the main window/screen and disables the main window interaction until it is
      * closed.
      */
    var enableModal: js.UndefOr[Boolean] = js.native
    
    /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Displays dialog content from right to left when set to true.
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Allows the dialog to be resized. The dialog cannot be resized less than the minimum height, width values and greater than the maximum height and width.
      */
    var enableResize: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the Dialog widget.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Triggered when the dialog content is expanded.
      */
    var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.native
    
    /** The CSS class name to display the favicon in the dialog header. In order to display favicon, you need to set showHeader as true since the favicon will be displayed in the dialog
      * header.
      */
    var faviconCSS: js.UndefOr[String] = js.native
    
    /** Sets the FooterTemplate for the Dialog widget.
      */
    var footerTemplateId: js.UndefOr[String] = js.native
    
    /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
      * â€œ100â€, â€œ500â€ as integer type.
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Specifies the HTML Attributes of the Dialog.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Enable or disables responsive behavior.
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Default Value:{:.param}â€œen-USâ€
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Sets the maximum height for the dialog widget.
      */
    var maxHeight: js.UndefOr[String | Double] = js.native
    
    /** Sets the maximum width for the dialog widget.
      */
    var maxWidth: js.UndefOr[String | Double] = js.native
    
    /** Sets the minimum height for the dialog widget.
      */
    var minHeight: js.UndefOr[String | Double] = js.native
    
    /** Sets the minimum width for the dialog widget.
      */
    var minWidth: js.UndefOr[String | Double] = js.native
    
    /** Triggered after the dialog is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Displays the Dialog widget at the given X and Y position.
      */
    var position: js.UndefOr[js.Any] = js.native
    
    /** Triggered while the dialog is resized.
      */
    var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
    
    /** Triggered when the user starts resizing the dialog.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
    
    /** Triggered when the user stops resizing the dialog.
      */
    var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
    
    /** Sets the Footer for the Dialog widget.
      */
    var showFooter: js.UndefOr[Boolean] = js.native
    
    /** Shows or hides the dialog header.
      */
    var showHeader: js.UndefOr[Boolean] = js.native
    
    /** The Dialog widget can be opened by default i.e. on initialization, when it is set to true.
      */
    var showOnInit: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the rounder corner.
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** The selector for the container element. If this property is set, the dialog will be displayed (positioned) based on its container.
      */
    var target: js.UndefOr[String] = js.native
    
    /** The title text to be displayed in the dialog header. In order to set title, you need to set showHeader as true since the title will be displayed in the dialog header.
      */
    var title: js.UndefOr[String] = js.native
    
    /** Add or configure the tooltip text for actionButtons in the dialog header.
      */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
      * â€œ100â€, â€œ500â€ as integer type.
      */
    var width: js.UndefOr[String | Double] = js.native
    
    /** Sets the z-index value for the Dialog widget.
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Dialog.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Dialog.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Dialog.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionButtonClick(value: /* e */ ActionButtonClickEventArgs => Unit): Self = StObject.set(x, "actionButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionButtonClickUndefined: Self = StObject.set(x, "actionButtonClick", js.undefined)
      
      @scala.inline
      def setActionButtons(value: js.Array[String]): Self = StObject.set(x, "actionButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionButtonsUndefined: Self = StObject.set(x, "actionButtons", js.undefined)
      
      @scala.inline
      def setActionButtonsVarargs(value: String*): Self = StObject.set(x, "actionButtons", js.Array(value :_*))
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: typings.ejWebAll.ej.Dialog.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setAllowDraggable(value: Boolean): Self = StObject.set(x, "allowDraggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDraggableUndefined: Self = StObject.set(x, "allowDraggable", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBackgroundScroll(value: Boolean): Self = StObject.set(x, "backgroundScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundScrollUndefined: Self = StObject.set(x, "backgroundScroll", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCollapse(value: /* e */ CollapseEventArgs => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      @scala.inline
      def setContentLoad(value: /* e */ ContentLoadEventArgs => Unit): Self = StObject.set(x, "contentLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentLoadUndefined: Self = StObject.set(x, "contentLoad", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      @scala.inline
      def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableModal(value: Boolean): Self = StObject.set(x, "enableModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableModalUndefined: Self = StObject.set(x, "enableModal", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExpand(value: /* e */ ExpandEventArgs => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setFaviconCSS(value: String): Self = StObject.set(x, "faviconCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconCSSUndefined: Self = StObject.set(x, "faviconCSS", js.undefined)
      
      @scala.inline
      def setFooterTemplateId(value: String): Self = StObject.set(x, "footerTemplateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplateIdUndefined: Self = StObject.set(x, "footerTemplateId", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setResize(value: /* e */ ResizeEventArgs => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      @scala.inline
      def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setShowOnInit(value: Boolean): Self = StObject.set(x, "showOnInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnInitUndefined: Self = StObject.set(x, "showOnInit", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeEventArgs {
    
    @scala.inline
    def apply(): ResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventArgs]
    }
    
    @scala.inline
    implicit class ResizeEventArgsMutableBuilder[Self <: ResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeStartEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeStartEventArgs {
    
    @scala.inline
    def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    @scala.inline
    implicit class ResizeStartEventArgsMutableBuilder[Self <: ResizeStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeStopEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Current event object.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Instance of the dialog model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeStopEventArgs {
    
    @scala.inline
    def apply(): ResizeStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStopEventArgs]
    }
    
    @scala.inline
    implicit class ResizeStopEventArgsMutableBuilder[Self <: ResizeStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
