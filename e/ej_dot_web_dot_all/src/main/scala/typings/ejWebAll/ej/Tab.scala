package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab
  extends StObject
     with Widget_ {
  
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
    sealed trait Auto
      extends StObject
         with HeightAdjustMode
    
    ///string
    @js.native
    sealed trait Content
      extends StObject
         with HeightAdjustMode
    
    ///string
    @js.native
    sealed trait Fill
      extends StObject
         with HeightAdjustMode
    
    ///string
    @js.native
    sealed trait None
      extends StObject
         with HeightAdjustMode
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.Tab.Position")
  @js.native
  object Position extends StObject {
    
    ///Tab headers display to bottom position
    @js.native
    sealed trait Bottom
      extends StObject
         with Position
    
    ///Tab headers display to left position.
    @js.native
    sealed trait Left
      extends StObject
         with Position
    
    ///Tab headers display to right position.
    @js.native
    sealed trait Right
      extends StObject
         with Position
    
    ///Tab headers display to top position
    @js.native
    sealed trait Top
      extends StObject
         with Position
  }
  
  trait AjaxBeforeLoadEventArgs extends StObject {
    
    /** returns the URL of AJAX request
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxBeforeLoadEventArgs {
    
    inline def apply(): AjaxBeforeLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxBeforeLoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxBeforeLoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait AjaxErrorEventArgs extends StObject {
    
    /** returns the URL of AJAX request.
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns AJAX data details.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
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
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait AjaxLoadEventArgs extends StObject {
    
    /** returns the URL of AJAX request
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxLoadEventArgs {
    
    inline def apply(): AjaxLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxLoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxLoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait AjaxSettings extends StObject {
    
    /** It specifies, whether to enable or disable asynchronous request.
      * @Default {true}
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the page will be cached in the web browser.
      * @Default {false}
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** It specifies the type of data is send in the query string.
      * @Default {html}
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /** It specifies the data as an object, will be passed in the query string.
      * @Default {{}}
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** It specifies the type of data that you're expecting back from the response.
      * @Default {html}
      */
    var dataType: js.UndefOr[String] = js.undefined
    
    /** It specifies the HTTP request type.
      * @Default {get}
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxSettings {
    
    inline def apply(): typings.ejWebAll.ej.Tab.AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tab.AjaxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Tab.AjaxSettings] (val x: Self) extends AnyVal {
      
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
    
    /** returns AJAX URL
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns content of AJAX request.
      */
    var content: js.UndefOr[Any] = js.undefined
    
    /** return AJAX data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
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
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      inline def setURLUndefined: Self = StObject.set(x, "URL", js.undefined)
    }
  }
  
  trait BeforeActiveEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeActiveEventArgs {
    
    inline def apply(): BeforeActiveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeActiveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeActiveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeItemRemoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns current tab item index
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeItemRemoveEventArgs {
    
    inline def apply(): BeforeItemRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeItemRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeItemRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemActiveEventArgs extends StObject {
    
    /** returns current active tab header .
      */
    var activeHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns current active index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns, is it triggered by interaction or not.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns previous active tab header.
      */
    var prevActiveHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns previous active index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemActiveEventArgs {
    
    inline def apply(): ItemActiveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemActiveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemActiveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: HTMLElement): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: HTMLElement): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemAddEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns new added tab content panel.
      */
    var tabContent: js.UndefOr[Any] = js.undefined
    
    /** returns new added tab header.
      */
    var tabHeader: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemAddEventArgs {
    
    inline def apply(): ItemAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemAddEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemAddEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTabContent(value: Any): Self = StObject.set(x, "tabContent", value.asInstanceOf[js.Any])
      
      inline def setTabContentUndefined: Self = StObject.set(x, "tabContent", js.undefined)
      
      inline def setTabHeader(value: HTMLElement): Self = StObject.set(x, "tabHeader", value.asInstanceOf[js.Any])
      
      inline def setTabHeaderUndefined: Self = StObject.set(x, "tabHeader", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemRemoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the tab model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns removed tab header.
      */
    var removedTab: js.UndefOr[HTMLElement] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemRemoveEventArgs {
    
    inline def apply(): ItemRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRemovedTab(value: HTMLElement): Self = StObject.set(x, "removedTab", value.asInstanceOf[js.Any])
      
      inline def setRemovedTabUndefined: Self = StObject.set(x, "removedTab", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered before AJAX content has been loaded.
      */
    var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
    
    /** Triggered if error occurs in AJAX request.
      */
    var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
    
    /** Triggered after AJAX content load action.
      */
    var ajaxLoad: js.UndefOr[js.Function1[/* e */ AjaxLoadEventArgs, Unit]] = js.undefined
    
    /** Specifies the ajaxSettings option to load the content to the Tab control.
      */
    var ajaxSettings: js.UndefOr[typings.ejWebAll.ej.Tab.AjaxSettings] = js.undefined
    
    /** Triggered after a tab item activated.
      */
    var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
    
    /** Tab items interaction with keyboard keys, like headers active navigation.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered before a tab item activated.
      */
    var beforeActive: js.UndefOr[js.Function1[/* e */ BeforeActiveEventArgs, Unit]] = js.undefined
    
    /** Triggered before a tab item remove.
      */
    var beforeItemRemove: js.UndefOr[js.Function1[/* e */ BeforeItemRemoveEventArgs, Unit]] = js.undefined
    
    /** Allow to collapsing the active item, while click on the active header.
      * @Default {false}
      */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered before a tab item Create.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Set the root class for Tab theme. This cssClass API helps to use custom skinning option for Tab control.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Triggered before a tab item destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Disables the given tab headers and content panels.
      * @Default {[]}
      */
    var disabledItemIndex: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Specifies the animation behavior of the tab.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Save current model value to browser cookies for state maintains. While refresh the Tab control page the model value apply from browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Display Right to Left direction for headers and panels text of tab.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specify to enable scrolling for Tab header.
      * @Default {false}
      */
    var enableTabScroll: js.UndefOr[Boolean] = js.undefined
    
    /** When this property is set to false, it disables the tab control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the given tab headers and content panels.
      * @Default {[]}
      */
    var enabledItemIndex: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** The event API to bind the action for active the tab items.
      * @Default {click}
      */
    var events: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of Tab header as top, bottom, left or right. See below to get available Position
      * @Default {top}
      */
    var headerPosition: js.UndefOr[String | Position] = js.undefined
    
    /** Set the height of the tab header element. Default this property value is null, so height take content height.
      * @Default {null}
      */
    var headerSize: js.UndefOr[String | Double] = js.undefined
    
    /** Height set the outer panel element. Default this property value is null, so height take content height.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Adjust the content panel height for given option (content, auto and fill), by default panels height adjust based on the content.See below to get available HeightAdjustMode
      * @Default {content}
      */
    var heightAdjustMode: js.UndefOr[String | HeightAdjustMode] = js.undefined
    
    /** Specifies to hide a pane of Tab control.
      * @Default {[]}
      */
    var hiddenItemIndex: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the HTML Attributes of the Tab.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** The idPrefix property appends the given string on the added tab item idâ€™s in runtime.
      * @Default {ej-tab-}
      */
    var idPrefix: js.UndefOr[String] = js.undefined
    
    /** Triggered after a tab item activated.
      */
    var itemActive: js.UndefOr[js.Function1[/* e */ ItemActiveEventArgs, Unit]] = js.undefined
    
    /** Triggered after new tab item add
      */
    var itemAdd: js.UndefOr[js.Function1[/* e */ ItemAddEventArgs, Unit]] = js.undefined
    
    /** Triggered after tab item removed.
      */
    var itemRemove: js.UndefOr[js.Function1[/* e */ ItemRemoveEventArgs, Unit]] = js.undefined
    
    /** Specifies the Tab header in active for given index value.
      * @Default {0}
      */
    var selectedItemIndex: js.UndefOr[Double] = js.undefined
    
    /** Display the close button for each tab items. While clicking on the close icon, particular tab item will be removed.
      * @Default {false}
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /** Display the Reload button for each tab items.
      * @Default {false}
      */
    var showReloadIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Tab panels and headers to be displayed in rounded corner style.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Set the width for outer panel element, if not itâ€™s take parent width.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Tab.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tab.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Tab.Model] (val x: Self) extends AnyVal {
      
      inline def setAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = StObject.set(x, "ajaxBeforeLoad", js.Any.fromFunction1(value))
      
      inline def setAjaxBeforeLoadUndefined: Self = StObject.set(x, "ajaxBeforeLoad", js.undefined)
      
      inline def setAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction1(value))
      
      inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      inline def setAjaxLoad(value: /* e */ AjaxLoadEventArgs => Unit): Self = StObject.set(x, "ajaxLoad", js.Any.fromFunction1(value))
      
      inline def setAjaxLoadUndefined: Self = StObject.set(x, "ajaxLoad", js.undefined)
      
      inline def setAjaxSettings(value: typings.ejWebAll.ej.Tab.AjaxSettings): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      inline def setAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxSuccessUndefined: Self = StObject.set(x, "ajaxSuccess", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setBeforeActive(value: /* e */ BeforeActiveEventArgs => Unit): Self = StObject.set(x, "beforeActive", js.Any.fromFunction1(value))
      
      inline def setBeforeActiveUndefined: Self = StObject.set(x, "beforeActive", js.undefined)
      
      inline def setBeforeItemRemove(value: /* e */ BeforeItemRemoveEventArgs => Unit): Self = StObject.set(x, "beforeItemRemove", js.Any.fromFunction1(value))
      
      inline def setBeforeItemRemoveUndefined: Self = StObject.set(x, "beforeItemRemove", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDisabledItemIndex(value: js.Array[Double]): Self = StObject.set(x, "disabledItemIndex", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemIndexUndefined: Self = StObject.set(x, "disabledItemIndex", js.undefined)
      
      inline def setDisabledItemIndexVarargs(value: Double*): Self = StObject.set(x, "disabledItemIndex", js.Array(value*))
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableTabScroll(value: Boolean): Self = StObject.set(x, "enableTabScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableTabScrollUndefined: Self = StObject.set(x, "enableTabScroll", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledItemIndex(value: js.Array[Double]): Self = StObject.set(x, "enabledItemIndex", value.asInstanceOf[js.Any])
      
      inline def setEnabledItemIndexUndefined: Self = StObject.set(x, "enabledItemIndex", js.undefined)
      
      inline def setEnabledItemIndexVarargs(value: Double*): Self = StObject.set(x, "enabledItemIndex", js.Array(value*))
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEvents(value: String): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeaderPosition(value: String | Position): Self = StObject.set(x, "headerPosition", value.asInstanceOf[js.Any])
      
      inline def setHeaderPositionUndefined: Self = StObject.set(x, "headerPosition", js.undefined)
      
      inline def setHeaderSize(value: String | Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightAdjustMode(value: String | HeightAdjustMode): Self = StObject.set(x, "heightAdjustMode", value.asInstanceOf[js.Any])
      
      inline def setHeightAdjustModeUndefined: Self = StObject.set(x, "heightAdjustMode", js.undefined)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHiddenItemIndex(value: js.Array[Any]): Self = StObject.set(x, "hiddenItemIndex", value.asInstanceOf[js.Any])
      
      inline def setHiddenItemIndexUndefined: Self = StObject.set(x, "hiddenItemIndex", js.undefined)
      
      inline def setHiddenItemIndexVarargs(value: Any*): Self = StObject.set(x, "hiddenItemIndex", js.Array(value*))
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      inline def setItemActive(value: /* e */ ItemActiveEventArgs => Unit): Self = StObject.set(x, "itemActive", js.Any.fromFunction1(value))
      
      inline def setItemActiveUndefined: Self = StObject.set(x, "itemActive", js.undefined)
      
      inline def setItemAdd(value: /* e */ ItemAddEventArgs => Unit): Self = StObject.set(x, "itemAdd", js.Any.fromFunction1(value))
      
      inline def setItemAddUndefined: Self = StObject.set(x, "itemAdd", js.undefined)
      
      inline def setItemRemove(value: /* e */ ItemRemoveEventArgs => Unit): Self = StObject.set(x, "itemRemove", js.Any.fromFunction1(value))
      
      inline def setItemRemoveUndefined: Self = StObject.set(x, "itemRemove", js.undefined)
      
      inline def setSelectedItemIndex(value: Double): Self = StObject.set(x, "selectedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIndexUndefined: Self = StObject.set(x, "selectedItemIndex", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowReloadIcon(value: Boolean): Self = StObject.set(x, "showReloadIcon", value.asInstanceOf[js.Any])
      
      inline def setShowReloadIconUndefined: Self = StObject.set(x, "showReloadIcon", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
