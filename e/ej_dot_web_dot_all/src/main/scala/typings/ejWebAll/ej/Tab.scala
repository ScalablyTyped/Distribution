package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends Widget_ {
  
  /** Add new tab items with given name, URL and given index position, if index null itâ€™s add last item.
    * @param {string} URL name / tab id.
    * @param {string} Tab Display name.
    * @param {number} Index position to placed , this is optional.
    * @param {string} specifies cssClass, this is optional.
    * @param {string} specifies id of tab, this is optional.
    * @returns {void}
    */
  def addItem(URL: String, displayLabel: String, index: Double, cssClass: String, id: String): Unit = js.native
  
  var defaults: Model = js.native
  
  /** To disable the tab control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the tab control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** This function get the number of tab rendered
    * @returns {number}
    */
  def getItemsCount(): Double = js.native
  
  /** This function hides the tab control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** This function hides the specified item tab in tab control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def hideItem(index: Double): Unit = js.native
  
  @JSName("model")
  var model_Tab: Model = js.native
  
  /** Remove the given index tab item.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
  
  /** This function is to show the tab control.
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** This function helps to show the specified hidden tab item in tab control.
    * @param {number} index of tab item.
    * @returns {void}
    */
  def showItem(index: Double): Unit = js.native
}
object Tab {
  
  @js.native
  sealed trait HeightAdjustMode extends StObject
  @JSGlobal("ej.Tab.HeightAdjustMode")
  @js.native
  object HeightAdjustMode extends StObject {
    
    ///string
    @js.native
    sealed trait Auto extends HeightAdjustMode
    
    ///string
    @js.native
    sealed trait Content extends HeightAdjustMode
    
    ///string
    @js.native
    sealed trait Fill extends HeightAdjustMode
    
    ///string
    @js.native
    sealed trait None extends HeightAdjustMode
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.Tab.Position")
  @js.native
  object Position extends StObject {
    
    ///Tab headers display to bottom position
    @js.native
    sealed trait Bottom extends Position
    
    ///Tab headers display to left position.
    @js.native
    sealed trait Left extends Position
    
    ///Tab headers display to right position.
    @js.native
    sealed trait Right extends Position
    
    ///Tab headers display to top position
    @js.native
    sealed trait Top extends Position
  }
  
  @js.native
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** returns the URL of AJAX request
      */
    var URL: js.UndefOr[String] = js.native
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxBeforeLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxBeforeLoadEventArgsMutableBuilder[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
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
      def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      @scala.inline
      def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
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
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns the URL of AJAX request.
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns AJAX data details.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
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
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  trait AjaxLoadEventArgs extends StObject {
    
    /** returns the URL of AJAX request
      */
    var URL: js.UndefOr[String] = js.native
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxLoadEventArgs {
    
    @scala.inline
    def apply(): AjaxLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxLoadEventArgs]
    }
    
    @scala.inline
    implicit class AjaxLoadEventArgsMutableBuilder[Self <: AjaxLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
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
      def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      @scala.inline
      def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
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
      * @Default {true}
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /** It specifies the page will be cached in the web browser.
      * @Default {false}
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** It specifies the type of data is send in the query string.
      * @Default {html}
      */
    var contentType: js.UndefOr[String] = js.native
    
    /** It specifies the data as an object, will be passed in the query string.
      * @Default {{}}
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** It specifies the type of data that you're expecting back from the response.
      * @Default {html}
      */
    var dataType: js.UndefOr[String] = js.native
    
    /** It specifies the HTTP request type.
      * @Default {get}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxSettings {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Tab.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tab.AjaxSettings]
    }
    
    @scala.inline
    implicit class AjaxSettingsMutableBuilder[Self <: typings.ejWebAll.ej.Tab.AjaxSettings] (val x: Self) extends AnyVal {
      
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
    
    /** returns AJAX URL
      */
    var URL: js.UndefOr[String] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns content of AJAX request.
      */
    var content: js.UndefOr[js.Any] = js.native
    
    /** return AJAX data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
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
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  trait BeforeActiveEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeActiveEventArgs {
    
    @scala.inline
    def apply(): BeforeActiveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeActiveEventArgs]
    }
    
    @scala.inline
    implicit class BeforeActiveEventArgsMutableBuilder[Self <: BeforeActiveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
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
      def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      @scala.inline
      def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeItemRemoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns current tab item index
      */
    var index: js.UndefOr[Double] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeItemRemoveEventArgs {
    
    @scala.inline
    def apply(): BeforeItemRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeItemRemoveEventArgs]
    }
    
    @scala.inline
    implicit class BeforeItemRemoveEventArgsMutableBuilder[Self <: BeforeItemRemoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
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
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
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
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
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
  trait ItemActiveEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ItemActiveEventArgs {
    
    @scala.inline
    def apply(): ItemActiveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemActiveEventArgs]
    }
    
    @scala.inline
    implicit class ItemActiveEventArgsMutableBuilder[Self <: ItemActiveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
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
      def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      @scala.inline
      def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ItemAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns new added tab content panel.
      */
    var tabContent: js.UndefOr[js.Any] = js.native
    
    /** returns new added tab header.
      */
    var tabHeader: js.UndefOr[HTMLElement] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ItemAddEventArgs {
    
    @scala.inline
    def apply(): ItemAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAddEventArgs]
    }
    
    @scala.inline
    implicit class ItemAddEventArgsMutableBuilder[Self <: ItemAddEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTabContent(value: js.Any): Self = StObject.set(x, "tabContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabContentUndefined: Self = StObject.set(x, "tabContent", js.undefined)
      
      @scala.inline
      def setTabHeader(value: HTMLElement): Self = StObject.set(x, "tabHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabHeaderUndefined: Self = StObject.set(x, "tabHeader", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ItemRemoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns removed tab header.
      */
    var removedTab: js.UndefOr[HTMLElement] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ItemRemoveEventArgs {
    
    @scala.inline
    def apply(): ItemRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemRemoveEventArgs]
    }
    
    @scala.inline
    implicit class ItemRemoveEventArgsMutableBuilder[Self <: ItemRemoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRemovedTab(value: HTMLElement): Self = StObject.set(x, "removedTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedTabUndefined: Self = StObject.set(x, "removedTab", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggered before AJAX content has been loaded.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
    
    /** Triggered if error occurs in AJAX request.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
    
    /** Triggered after AJAX content load action.
      */
    var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.native
    
    /** Specifies the ajaxSettings option to load the content to the Tab control.
      */
    var ajaxSettings: js.UndefOr[typings.ejWebAll.ej.Tab.AjaxSettings] = js.native
    
    /** Triggered after a tab item activated.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
    
    /** Tab items interaction with keyboard keys, like headers active navigation.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Triggered before a tab item activated.
      */
    var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, Unit]] = js.native
    
    /** Triggered before a tab item remove.
      */
    var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, Unit]] = js.native
    
    /** Allow to collapsing the active item, while click on the active header.
      * @Default {false}
      */
    var collapsible: js.UndefOr[Boolean] = js.native
    
    /** Triggered before a tab item Create.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Triggered before a tab item destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Disables the given tab headers and content panels.
      * @Default {[]}
      */
    var disabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
    
    /** Specifies the animation behavior of the tab.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Display Right to Left direction for headers and panels text of tab.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Specify to enable scrolling for Tab header.
      * @Default {false}
      */
    var enableTabScroll: js.UndefOr[Boolean] = js.native
    
    /** When this property is set to false, it disables the tab control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Enables the given tab headers and content panels.
      * @Default {[]}
      */
    var enabledItemIndex: js.UndefOr[js.Array[Double]] = js.native
    
    /** The event API to bind the action for active the tab items.
      * @Default {click}
      */
    var events: js.UndefOr[String] = js.native
    
    /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
      * @Default {top}
      */
    var headerPosition: js.UndefOr[String | Position] = js.native
    
    /** Set the height of the tab header element. Default this property value is null, so height take content height.
      * @Default {null}
      */
    var headerSize: js.UndefOr[String | Double] = js.native
    
    /** Height set the outer panel element. Default this property value is null, so height take content height.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
      * @Default {content}
      */
    var heightAdjustMode: js.UndefOr[String | HeightAdjustMode] = js.native
    
    /** Specifies to hide a pane of Tab control.
      * @Default {[]}
      */
    var hiddenItemIndex: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the HTML Attributes of the Tab.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
      * @Default {ej-tab-}
      */
    var idPrefix: js.UndefOr[String] = js.native
    
    /** Triggered after a tab item activated.
      */
    var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, Unit]] = js.native
    
    /** Triggered after new tab item add
      */
    var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, Unit]] = js.native
    
    /** Triggered after tab item removed.
      */
    var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, Unit]] = js.native
    
    /** Specifies the Tab header in active for given index value.
      * @Default {0}
      */
    var selectedItemIndex: js.UndefOr[Double] = js.native
    
    /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
      * @Default {false}
      */
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    /** Display the Reload button for each tab items.
      * @Default {false}
      */
    var showReloadIcon: js.UndefOr[Boolean] = js.native
    
    /** Tab panels and headers to be displayed in rounded corner style.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Set the width for outer panel element, if not itâ€™s take parent width.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Tab.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tab.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Tab.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      @scala.inline
      def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxLoad(value: /* e */ AjaxLoadEventArgs => Unit): Self = StObject.set(x, "ajaxLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxLoadUndefined: Self = StObject.set(x, "ajaxLoad", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: typings.ejWebAll.ej.Tab.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setBeforeActive(value: /* e */ BeforeActiveEventArgs => Unit): Self = StObject.set(x, "beforeActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeActiveUndefined: Self = StObject.set(x, "beforeActive", js.undefined)
      
      @scala.inline
      def setBeforeItemRemove(value: /* e */ BeforeItemRemoveEventArgs => Unit): Self = StObject.set(x, "beforeItemRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeItemRemoveUndefined: Self = StObject.set(x, "beforeItemRemove", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
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
      def setDisabledItemIndex(value: js.Array[Double]): Self = StObject.set(x, "disabledItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemIndexUndefined: Self = StObject.set(x, "disabledItemIndex", js.undefined)
      
      @scala.inline
      def setDisabledItemIndexVarargs(value: Double*): Self = StObject.set(x, "disabledItemIndex", js.Array(value :_*))
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableTabScroll(value: Boolean): Self = StObject.set(x, "enableTabScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTabScrollUndefined: Self = StObject.set(x, "enableTabScroll", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItemIndex(value: js.Array[Double]): Self = StObject.set(x, "enabledItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItemIndexUndefined: Self = StObject.set(x, "enabledItemIndex", js.undefined)
      
      @scala.inline
      def setEnabledItemIndexVarargs(value: Double*): Self = StObject.set(x, "enabledItemIndex", js.Array(value :_*))
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setHeaderPosition(value: String | Position): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
      
      @scala.inline
      def setHeaderSize(value: String | Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAdjustMode(value: String | HeightAdjustMode): Self = StObject.set(x, "heightAdjustMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightAdjustModeUndefined: Self = StObject.set(x, "heightAdjustMode", js.undefined)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHiddenItemIndex(value: js.Array[_]): Self = StObject.set(x, "hiddenItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenItemIndexUndefined: Self = StObject.set(x, "hiddenItemIndex", js.undefined)
      
      @scala.inline
      def setHiddenItemIndexVarargs(value: js.Any*): Self = StObject.set(x, "hiddenItemIndex", js.Array(value :_*))
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      @scala.inline
      def setItemActive(value: /* e */ ItemActiveEventArgs => Unit): Self = StObject.set(x, "itemActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemActiveUndefined: Self = StObject.set(x, "itemActive", js.undefined)
      
      @scala.inline
      def setItemAdd(value: /* e */ ItemAddEventArgs => Unit): Self = StObject.set(x, "itemAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemAddUndefined: Self = StObject.set(x, "itemAdd", js.undefined)
      
      @scala.inline
      def setItemRemove(value: /* e */ ItemRemoveEventArgs => Unit): Self = StObject.set(x, "itemRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemRemoveUndefined: Self = StObject.set(x, "itemRemove", js.undefined)
      
      @scala.inline
      def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setShowReloadIcon(value: Boolean): Self = StObject.set(x, "showReloadIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowReloadIconUndefined: Self = StObject.set(x, "showReloadIcon", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
