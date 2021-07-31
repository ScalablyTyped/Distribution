package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toolbar
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Deselect the specified Toolbar item.
    * @param {any} The element need to be deselected
    * @returns {void}
    */
  def deselectItem(element: js.Any): Unit = js.native
  
  /** Deselect the Toolbar item based on specified id.
    * @param {string} The ID of the element need to be deselected
    * @returns {void}
    */
  def deselectItemByID(ID: String): Unit = js.native
  
  /** To disable all items in the Toolbar control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disable the specified Toolbar item.
    * @param {any} The element need to be disabled
    * @returns {void}
    */
  def disableItem(element: js.Any): Unit = js.native
  
  /** Disable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be disabled
    * @returns {void}
    */
  def disableItemByID(ID: String): Unit = js.native
  
  /** Enable the Toolbar if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enable the Toolbar item based on specified item.
    * @param {any} The element need to be enabled
    * @returns {void}
    */
  def enableItem(element: js.Any): Unit = js.native
  
  /** Enable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be enabled
    * @returns {void}
    */
  def enableItemByID(ID: String): Unit = js.native
  
  /** To hide the Toolbar
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Toolbar: Model = js.native
  
  /** Remove the item from toolbar, based on specified item.
    * @param {any} The element need to be removed
    * @returns {void}
    */
  def removeItem(element: js.Any): Unit = js.native
  
  /** Remove the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be removed
    * @returns {void}
    */
  def removeItemByID(ID: String): Unit = js.native
  
  /** Selects the item from toolbar, based on specified item.
    * @param {any} The element need to be selected
    * @returns {void}
    */
  def selectItem(element: js.Any): Unit = js.native
  
  /** Selects the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be selected
    * @returns {void}
    */
  def selectItemByID(ID: String): Unit = js.native
  
  /** To show the Toolbar.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object Toolbar {
  
  @js.native
  sealed trait ResponsiveType extends StObject
  @JSGlobal("ej.Toolbar.ResponsiveType")
  @js.native
  object ResponsiveType extends StObject {
    
    ///To display the toolbar overflow items as inline toolbar
    @js.native
    sealed trait Inline
      extends StObject
         with ResponsiveType
    
    ///To display the toolbar overflow items as popup
    @js.native
    sealed trait Popup
      extends StObject
         with ResponsiveType
  }
  
  trait ClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the Toolbar state
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
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
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
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Toolbar model
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
    
    /** returns the Toolbar model
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
    
    /** Defines the group name for the item.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes such as id, class, styles for the item to extend the capability.
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Defines id for the tag.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Defines the image attributes such as height, width, styles and so on.
      */
    var imageAttributes: js.UndefOr[String] = js.undefined
    
    /** Defines the imageURL for the image location.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Defines the sprite CSS for the image tag.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** Allows you to add  template as toolbar item
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Defines the text content for the tag.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the tooltip text for the tag.
      */
    var tooltipText: js.UndefOr[String] = js.undefined
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
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageAttributes(value: String): Self = StObject.set(x, "imageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAttributesUndefined: Self = StObject.set(x, "imageAttributes", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
  
  trait FocusOutEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FocusOutEventArgs {
    
    @scala.inline
    def apply(): FocusOutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOutEventArgs]
    }
    
    @scala.inline
    implicit class FocusOutEventArgsMutableBuilder[Self <: FocusOutEventArgs] (val x: Self) extends AnyVal {
      
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
  
  trait ItemHoverEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the Toolbar state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemHoverEventArgs {
    
    @scala.inline
    def apply(): ItemHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemHoverEventArgs]
    }
    
    @scala.inline
    implicit class ItemHoverEventArgsMutableBuilder[Self <: ItemHoverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
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
  
  trait ItemLeaveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the Toolbar state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the target of the current object.
      */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ItemLeaveEventArgs {
    
    @scala.inline
    def apply(): ItemLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemLeaveEventArgs]
    }
    
    @scala.inline
    implicit class ItemLeaveEventArgsMutableBuilder[Self <: ItemLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
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
  
  trait Items extends StObject {
    
    /** Defines the group name for the item.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /** Defines the HTML attributes such as id, class, styles for the item .
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Defines id for the tag.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Defines the image attributes such as height, width, styles and so on.
      */
    var imageAttributes: js.UndefOr[String] = js.undefined
    
    /** Defines the imageURL for the image location.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Defines the sprite CSS for the image tag.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** Allows to add template as toolbar item.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Defines the text content for the tag.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Defines the tooltip text for the tag.
      */
    var tooltipText: js.UndefOr[String] = js.undefined
  }
  object Items {
    
    @scala.inline
    def apply(): Items = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageAttributes(value: String): Self = StObject.set(x, "imageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAttributesUndefined: Self = StObject.set(x, "imageAttributes", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltipText(value: String): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTextUndefined: Self = StObject.set(x, "tooltipText", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the items of  Toolbar
      * @Default {null}
      */
    var Items: js.UndefOr[typings.ejWebAll.ej.Toolbar.Items] = js.undefined
    
    /** Fires after Toolbar control is clicked.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Fires after Toolbar control is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for Toolbar control to achieve the custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specifies dataSource value for the Toolbar control during initialization.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.undefined
    
    /** Fires when the Toolbar is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Disables an Item or set of Items that are enabled in the Toolbar
      * @Default {[]}
      */
    var disabledItemIndices: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies enableRTL property to align the Toolbar control from right to left direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to separate the each UL items in the Toolbar control.
      * @Default {false}
      */
    var enableSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the Toolbar control state.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Enables an Item or set of Items that are disabled in the Toolbar
      * @Default {[]}
      */
    var enabledItemIndices: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the mapping fields for the data items of the Toolbar
      * @Default {null}
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /** Fires after Toolbar control is focused.
      */
    var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.undefined
    
    /** Specifies the height of the Toolbar.
      * @Default {28}
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** Specifies whether the Toolbar control is need to be show or hide.
      * @Default {false}
      */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the list of HTML attributes to be added to toolbar control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Enables/Disables the responsive support for Toolbar items during the window resizing time.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires after Toolbar control item is hovered.
      */
    var itemHover: js.UndefOr[js.Function1[/* e */ ItemHoverEventArgs, Unit]] = js.undefined
    
    /** Fires after mouse leave from Toolbar control item.
      */
    var itemLeave: js.UndefOr[js.Function1[/* e */ ItemLeaveEventArgs, Unit]] = js.undefined
    
    /** Specifies the Toolbar orientation. See orientation
      * @Default {Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.undefined
    
    /** Fires when the overflow popup of toolbar is closed.
      */
    var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.undefined
    
    /** Fires when the overflow popup of toolbar is opened.
      */
    var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the query to retrieve the data from the online server. The query is used only when the online dataSource is used.
      * @Default {null}
      */
    var query: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the Toolbar responsive type.
      * @Default {Popup}
      */
    var responsiveType: js.UndefOr[ResponsiveType | String] = js.undefined
    
    /** Displays the Toolbar with rounded corners.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the width of the Toolbar.
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Toolbar.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Toolbar.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Toolbar.Model] (val x: Self) extends AnyVal {
      
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
      def setDisabledItemIndices(value: js.Array[js.Any]): Self = StObject.set(x, "disabledItemIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemIndicesUndefined: Self = StObject.set(x, "disabledItemIndices", js.undefined)
      
      @scala.inline
      def setDisabledItemIndicesVarargs(value: js.Any*): Self = StObject.set(x, "disabledItemIndices", js.Array(value :_*))
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableSeparator(value: Boolean): Self = StObject.set(x, "enableSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSeparatorUndefined: Self = StObject.set(x, "enableSeparator", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItemIndices(value: js.Array[js.Any]): Self = StObject.set(x, "enabledItemIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledItemIndicesUndefined: Self = StObject.set(x, "enabledItemIndices", js.undefined)
      
      @scala.inline
      def setEnabledItemIndicesVarargs(value: js.Any*): Self = StObject.set(x, "enabledItemIndices", js.Array(value :_*))
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setItemHover(value: /* e */ ItemHoverEventArgs => Unit): Self = StObject.set(x, "itemHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemHoverUndefined: Self = StObject.set(x, "itemHover", js.undefined)
      
      @scala.inline
      def setItemLeave(value: /* e */ ItemLeaveEventArgs => Unit): Self = StObject.set(x, "itemLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemLeaveUndefined: Self = StObject.set(x, "itemLeave", js.undefined)
      
      @scala.inline
      def setItems(value: Items): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOverflowClose(value: /* e */ OverflowCloseEventArgs => Unit): Self = StObject.set(x, "overflowClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
      
      @scala.inline
      def setOverflowOpen(value: /* e */ OverflowOpenEventArgs => Unit): Self = StObject.set(x, "overflowOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setResponsiveType(value: ResponsiveType | String): Self = StObject.set(x, "responsiveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveTypeUndefined: Self = StObject.set(x, "responsiveType", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OverflowCloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current  X position of the target .
      */
    var clientX: js.UndefOr[Double] = js.undefined
    
    /** Returns the current  Y position of the target .
      */
    var clientY: js.UndefOr[Double] = js.undefined
    
    /** returns the target of the current object.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowCloseEventArgs {
    
    @scala.inline
    def apply(): OverflowCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowCloseEventArgs]
    }
    
    @scala.inline
    implicit class OverflowCloseEventArgsMutableBuilder[Self <: OverflowCloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
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
  
  trait OverflowOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current  X position of the target .
      */
    var clientX: js.UndefOr[Double] = js.undefined
    
    /** Returns the current  Y position of the target .
      */
    var clientY: js.UndefOr[Double] = js.undefined
    
    /** returns the target of the current object.
      */
    var currentTarget: js.UndefOr[js.Any] = js.undefined
    
    /** returns the Toolbar model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowOpenEventArgs {
    
    @scala.inline
    def apply(): OverflowOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowOpenEventArgs]
    }
    
    @scala.inline
    implicit class OverflowOpenEventArgsMutableBuilder[Self <: OverflowOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
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
