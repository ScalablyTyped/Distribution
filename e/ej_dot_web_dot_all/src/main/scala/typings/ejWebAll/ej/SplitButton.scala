package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitButton
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the split button
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To Enable the split button
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To hide the list content of the split button.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_SplitButton: Model = js.native
  
  /** To show the list content of the split button.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object SplitButton {
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
  
  trait ClickEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the button state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
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
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
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
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
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
  
  trait ItemMouseOutEventArgs extends StObject {
    
    /** return the menu item id
      */
    var ID: js.UndefOr[String] = js.undefined
    
    /** return the clicked menu item text
      */
    var Text: js.UndefOr[String] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemMouseOutEventArgs {
    
    @scala.inline
    def apply(): ItemMouseOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemMouseOutEventArgs]
    }
    
    @scala.inline
    implicit class ItemMouseOutEventArgsMutableBuilder[Self <: ItemMouseOutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemMouseOverEventArgs extends StObject {
    
    /** return the menu item id
      */
    var ID: js.UndefOr[String] = js.undefined
    
    /** return the clicked menu item text
      */
    var Text: js.UndefOr[String] = js.undefined
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemMouseOverEventArgs {
    
    @scala.inline
    def apply(): ItemMouseOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemMouseOverEventArgs]
    }
    
    @scala.inline
    implicit class ItemMouseOverEventArgsMutableBuilder[Self <: ItemMouseOverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemSelectedEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.undefined
    
    /** return the menu id
      */
    var menuId: js.UndefOr[String] = js.undefined
    
    /** return the clicked menu item text
      */
    var menuText: js.UndefOr[String] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the selected item
      */
    var selectedItem: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemSelectedEventArgs {
    
    @scala.inline
    def apply(): ItemSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSelectedEventArgs]
    }
    
    @scala.inline
    implicit class ItemSelectedEventArgsMutableBuilder[Self <: ItemSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
      
      @scala.inline
      def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: js.Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the arrowPosition of the Split or Dropdown Button.See arrowPosition
      * @Default {ej.ArrowPosition.Right}
      */
    var arrowPosition: js.UndefOr[String | ArrowPosition] = js.undefined
    
    /** Fires before menu of the split button control is opened.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the buttonMode like Split or Dropdown Button.See ButtonMode
      * @Default {ej.ButtonMode.Split}
      */
    var buttonMode: js.UndefOr[String | ButtonMode] = js.undefined
    
    /** Fires when Button control is clicked successfully
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Fires before the list content of Button control is closed
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the contentType of the Split Button.See ContentType
      * @Default {ej.ContentType.TextOnly}
      */
    var contentType: js.UndefOr[String | ContentType] = js.undefined
    
    /** Fires after Split Button control is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Set the root class for Split Button control theme
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when the Split Button is destroyed successfully
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specifies the enableRTL property for Split Button while initialization.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the disabling of Split Button if enabled is set to false.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of the Split Button.
      * @Default {â€œâ€}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the HTML Attributes of the Split Button.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the imagePosition of the Split Button.See imagePositions
      * @Default {ej.ImagePosition.ImageRight}
      */
    var imagePosition: js.UndefOr[String | ImagePosition] = js.undefined
    
    /** Fires when a menu item is Hovered out successfully
      */
    var itemMouseOut: js.UndefOr[js.Function1[/* e */ ItemMouseOutEventArgs, Unit]] = js.undefined
    
    /** Fires when a menu item is Hovered in successfully
      */
    var itemMouseOver: js.UndefOr[js.Function1[/* e */ ItemMouseOverEventArgs, Unit]] = js.undefined
    
    /** Fires when a menu item is clicked successfully
      */
    var itemSelected: js.UndefOr[js.Function1[/* e */ ItemSelectedEventArgs, Unit]] = js.undefined
    
    /** Fires before the list content of Button control is opened
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the image content for Split Button while initialization.
      */
    var prefixIcon: js.UndefOr[String] = js.undefined
    
    /** Specifies the showRoundedCorner property for Split Button while initialization.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of the Button. See ButtonSize
      * @Default {ej.ButtonSize.Normal}
      */
    var size: js.UndefOr[String | ButtonSize] = js.undefined
    
    /** Specifies the image content for Split Button while initialization.
      */
    var suffixIcon: js.UndefOr[String] = js.undefined
    
    /** Specifies the target of splitbutton menu while initialization with ID or class as a selector.
      */
    var target: js.UndefOr[String] = js.undefined
    
    /** Specifies the list content for Split Button while initialization
      */
    var targetID: js.UndefOr[String] = js.undefined
    
    /** Specifies the text content for Split Button while initialization.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the Split Button.
      * @Default {â€œâ€}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.SplitButton.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.SplitButton.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.SplitButton.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPosition(value: String | ArrowPosition): Self = StObject.set(x, "arrowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPositionUndefined: Self = StObject.set(x, "arrowPosition", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setButtonMode(value: String | ButtonMode): Self = StObject.set(x, "buttonMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonModeUndefined: Self = StObject.set(x, "buttonMode", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setContentType(value: String | ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
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
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setImagePosition(value: String | ImagePosition): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePositionUndefined: Self = StObject.set(x, "imagePosition", js.undefined)
      
      @scala.inline
      def setItemMouseOut(value: /* e */ ItemMouseOutEventArgs => Unit): Self = StObject.set(x, "itemMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemMouseOutUndefined: Self = StObject.set(x, "itemMouseOut", js.undefined)
      
      @scala.inline
      def setItemMouseOver(value: /* e */ ItemMouseOverEventArgs => Unit): Self = StObject.set(x, "itemMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemMouseOverUndefined: Self = StObject.set(x, "itemMouseOver", js.undefined)
      
      @scala.inline
      def setItemSelected(value: /* e */ ItemSelectedEventArgs => Unit): Self = StObject.set(x, "itemSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemSelectedUndefined: Self = StObject.set(x, "itemSelected", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixIcon(value: String): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setSize(value: String | ButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuffixIcon(value: String): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetID(value: String): Self = StObject.set(x, "targetID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIDUndefined: Self = StObject.set(x, "targetID", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the cancel option value
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the split button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
}
