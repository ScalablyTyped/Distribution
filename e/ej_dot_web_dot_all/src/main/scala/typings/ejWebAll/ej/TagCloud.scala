package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCloud
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Inserts a new item into the TagCloud
    * @param {string} Insert new item into the TagCloud
    * @returns {void}
    */
  def insert(name: String): Unit = js.native
  
  /** Inserts a new item into the TagCloud at a particular position.
    * @param {string} Inserts a new item into the TagCloud
    * @param {number} Inserts a new item into the TagCloud with the specified position
    * @returns {void}
    */
  def insertAt(name: String, position: Double): Unit = js.native
  
  @JSName("model")
  var model_TagCloud: Model = js.native
  
  /** Removes the item from the TagCloud based on the name. It removes all the tags which have the corresponding name
    * @param {string} name of the tag.
    * @returns {void}
    */
  def remove(name: String): Unit = js.native
  
  /** Removes the item from the TagCloud based on the position. It removes the tags from the the corresponding position only.
    * @param {number} position of tag item.
    * @returns {void}
    */
  def removeAt(position: Double): Unit = js.native
}
object TagCloud {
  
  trait ClickEventArgs extends StObject {
    
    /** return current URL link
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TagCloud model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return current tag name
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
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
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TagCloud model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TagCloud model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait Fields extends StObject {
    
    /** Defines the frequency column number to categorize the font size.
      */
    var frequency: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes column for the anchor elements inside the each tag items.
      */
    var htmlAttributes: js.UndefOr[String] = js.undefined
    
    /** Defines the tag value or display text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the URL link to navigate while click the tag.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: String): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Event triggers when the TagCloud items are clicked
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the TagCloud are created
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to button to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** The dataSource contains the list of data to display in a cloud format. Each data contains a link URL, frequency to categorize the font size and a display text.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.undefined
    
    /** Event triggers when the TagCloud are destroyed
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Sets the TagCloud and tag items direction as right to left alignment.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the mapping fields for the data items of the TagCloud.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Defines the format for the TagCloud to display the tag items.See Format
      * @Default {ej.Format.Cloud}
      */
    var format: js.UndefOr[String | Format] = js.undefined
    
    /** Specifies the list of HTML attributes to be added to TagCloud control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Sets the maximum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
      * @Default {40px}
      */
    var maxFontSize: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the minimum font size value for the tag items. The font size for the tag items will be generated in between the minimum and maximum font size values.
      * @Default {10px}
      */
    var minFontSize: js.UndefOr[String | Double] = js.undefined
    
    /** Event triggers when the cursor leaves out from a tag item
      */
    var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the cursor hovers on a tag item
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
    
    /** Define the query to retrieve the data from online server. The query is used only when the online dataSource is used.
      * @Default {null}
      */
    var query: js.UndefOr[js.Any] = js.undefined
    
    /** Shows or hides the TagCloud title. When this set to false, it hides the TagCloud header.
      * @Default {true}
      */
    var showTitle: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the title image for the TagCloud. To show the title image, the showTitle property should be enabled.
      * @Default {null}
      */
    var titleImage: js.UndefOr[String] = js.undefined
    
    /** Sets the title text for the TagCloud. To show the title text, the showTitle property should be enabled.
      * @Default {Title}
      */
    var titleText: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.TagCloud.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.TagCloud.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.TagCloud.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFormat(value: String | Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setMaxFontSize(value: String | Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
      
      @scala.inline
      def setMinFontSize(value: String | Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
      
      @scala.inline
      def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      @scala.inline
      def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      @scala.inline
      def setTitleImage(value: String): Self = StObject.set(x, "titleImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleImageUndefined: Self = StObject.set(x, "titleImage", js.undefined)
      
      @scala.inline
      def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
  
  trait MouseoutEventArgs extends StObject {
    
    /** return current URL link
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TagCloud model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return current tag name
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseoutEventArgs {
    
    @scala.inline
    def apply(): MouseoutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoutEventArgs]
    }
    
    @scala.inline
    implicit class MouseoutEventArgsMutableBuilder[Self <: MouseoutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
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
  
  trait MouseoverEventArgs extends StObject {
    
    /** return current URL link
      */
    var URL: js.UndefOr[String] = js.undefined
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the TagCloud model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return current tag name
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseoverEventArgs {
    
    @scala.inline
    def apply(): MouseoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoverEventArgs]
    }
    
    @scala.inline
    implicit class MouseoverEventArgsMutableBuilder[Self <: MouseoverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
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
}
