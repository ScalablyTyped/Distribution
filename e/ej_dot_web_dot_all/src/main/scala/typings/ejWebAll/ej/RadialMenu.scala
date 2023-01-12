package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialMenu
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable menu item using item text
    * @param {string} item of the Radialmenu item to disable.
    * @returns {void}
    */
  def disableItem(item: String): Unit = js.native
  
  /** To disable menu item using index
    * @param {number} Index of the Radialmenu to be disabled.
    * @returns {void}
    */
  def disableItemByIndex(itemIndex: Double): Unit = js.native
  
  /** To disable menu items using item texts
    * @param {any[]} items of the Radialmenu item to disable.
    * @returns {void}
    */
  def disableItems(items: js.Array[Any]): Unit = js.native
  
  /** To disable menu items using indices
    * @param {any[]} items of the Radialmenu to disable.
    * @returns {void}
    */
  def disableItemsByIndices(itemIndices: js.Array[Any]): Unit = js.native
  
  /** To enable menu item using item text
    * @param {string} item of the Radialmenu item to enable.
    * @returns {void}
    */
  def enableItem(item: String): Unit = js.native
  
  /** To enable menu item using index
    * @param {number} Index of the Radialmenu to be enabled.
    * @returns {void}
    */
  def enableItemByIndex(itemIndex: Double): Unit = js.native
  
  /** To enable menu items using item texts
    * @param {any[]} items of the Radialmenu item to enable.
    * @returns {void}
    */
  def enableItems(items: js.Array[Any]): Unit = js.native
  
  /** To enable menu items using indices
    * @param {any[]} Index of the Radialmenu to be enabled.
    * @returns {void}
    */
  def enableItemsByIndices(itemIndices: js.Array[Any]): Unit = js.native
  
  /** To hide the radialmenu
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** To hide menu item badge
    * @param {number} Index of the Radialmenu item to hide the badge.
    * @returns {void}
    */
  def hideBadge(index: Double): Unit = js.native
  
  /** To hide the radialmenu items
    * @returns {void}
    */
  def hideMenu(): Unit = js.native
  
  @JSName("model")
  var model_RadialMenu: Model = js.native
  
  /** To Show the radial menu
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** To show menu item badge
    * @param {number} Index of the Radialmenu item to be shown badge.
    * @returns {void}
    */
  def showBadge(index: Double): Unit = js.native
  
  /** To show menu items
    * @returns {void}
    */
  def showMenu(): Unit = js.native
  
  /** To update menu item badge value
    * @param {number} The index value to add the given items at the specified index. If index is not specified, the given value will not be updated.
    * @param {number} The Value to be updated in the badge. It will be updated based on the given index
    * @returns {void}
    */
  def updateBadgeValue(index: Double, value: Double): Unit = js.native
}
object RadialMenu {
  
  trait ClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the item of element
      */
    var item: js.UndefOr[Any] = js.undefined
    
    /** returns the name of item
      */
    var itemName: js.UndefOr[String] = js.undefined
    
    /** returns the Radialmenu model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Radialmenu model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CloseEventArgs {
    
    inline def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    /** Specifies radialmenu item badges.
      */
    var badge: js.UndefOr[ItemsBadge] = js.undefined
    
    /** specify the click event to corresponding image/text for performing some specific action.
      */
    var click: js.UndefOr[String] = js.undefined
    
    /** Specifies the enable state of RadialMenu item.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the URL of the frame background image for radial menu item.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Specifies to add sub level items .
      */
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the template property of RadialMenu for SVG icon.
      */
    var prependTo: js.UndefOr[String] = js.undefined
    
    /** Specifies the sliderSettings ticks for nested radial menu items.
      */
    var sliderSettings: js.UndefOr[ItemsSliderSettings] = js.undefined
    
    /** Specifies the text of RadialMenu item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the type of nested radial menu item.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setBadge(value: ItemsBadge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPrependTo(value: String): Self = StObject.set(x, "prependTo", value.asInstanceOf[js.Any])
      
      inline def setPrependToUndefined: Self = StObject.set(x, "prependTo", js.undefined)
      
      inline def setSliderSettings(value: ItemsSliderSettings): Self = StObject.set(x, "sliderSettings", value.asInstanceOf[js.Any])
      
      inline def setSliderSettingsUndefined: Self = StObject.set(x, "sliderSettings", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ItemsBadge extends StObject {
    
    /** Specifies whether to enable radialmenu item badge or not.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the value of radial menu item badge.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ItemsBadge {
    
    inline def apply(): ItemsBadge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsBadge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsBadge] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ItemsSliderSettings extends StObject {
    
    /** Specifies the value of sliderSettings labelSpace .
      */
    var labelSpace: js.UndefOr[Double] = js.undefined
    
    /** Specifies the sliderSettings stroke Width value.
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the sliderSettings ticks values of nested radial menu items.
      */
    var ticks: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ItemsSliderSettings {
    
    inline def apply(): ItemsSliderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemsSliderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsSliderSettings] (val x: Self) extends AnyVal {
      
      inline def setLabelSpace(value: Double): Self = StObject.set(x, "labelSpace", value.asInstanceOf[js.Any])
      
      inline def setLabelSpaceUndefined: Self = StObject.set(x, "labelSpace", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTicks(value: js.Array[Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTicksVarargs(value: Any*): Self = StObject.set(x, "ticks", js.Array(value*))
    }
  }
  
  trait Model extends StObject {
    
    /** To show the Radial in initial render.
      */
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Renders the back button Image for Radial using class.
      */
    var backImageClass: js.UndefOr[String] = js.undefined
    
    /** Event triggers when we click an item.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the menu is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Sets the root class for RadialMenu theme. This cssClass API helps to use custom skinning option for RadialMenu control. By defining the root class using this API, we need to
      * include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** To enable Animation for Radial Menu.
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Renders the Image for Radial using Class.
      */
    var imageClass: js.UndefOr[String] = js.undefined
    
    /** Specify the items of radial menu
      */
    var items: js.UndefOr[js.Array[Item]] = js.undefined
    
    /** Event triggers when the menu is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** To set radial render position.
      */
    var position: js.UndefOr[Any] = js.undefined
    
    /** Specifies the radius of radial menu
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** To show the Radial while clicking given target element.
      */
    var targetElementId: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.RadialMenu.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.RadialMenu.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.RadialMenu.Model] (val x: Self) extends AnyVal {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setBackImageClass(value: String): Self = StObject.set(x, "backImageClass", value.asInstanceOf[js.Any])
      
      inline def setBackImageClassUndefined: Self = StObject.set(x, "backImageClass", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setTargetElementId(value: String): Self = StObject.set(x, "targetElementId", value.asInstanceOf[js.Any])
      
      inline def setTargetElementIdUndefined: Self = StObject.set(x, "targetElementId", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the Radialmenu model
      */
    var model: js.UndefOr[Any] = js.undefined
    
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
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
