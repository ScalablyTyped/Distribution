package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Menu control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Specifies the Menu Item to be disabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be disabled.
    * @returns {void}
    */
  def disableItem(itemtext: String): Unit = js.native
  
  /** Specifies the Menu Item to be disabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be disabled
    * @returns {void}
    */
  def disableItemByID(itemid: String): Unit = js.native
  def disableItemByID(itemid: Double): Unit = js.native
  
  /** Enables the Menu control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Specifies the Menu Item to be enabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be enabled.
    * @returns {void}
    */
  def enableItem(itemtext: String): Unit = js.native
  
  /** Specifies the Menu Item to be enabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be enabled.
    * @returns {void}
    */
  def enableItemByID(itemid: String): Unit = js.native
  def enableItemByID(itemid: Double): Unit = js.native
  
  /** Hides the Context Menu control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** Hides the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be hidden
    * @returns {void}
    */
  def hideItems(itemID: String): Unit = js.native
  def hideItems(itemID: js.Array[Any]): Unit = js.native
  
  /** Insert the menu item as child of target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insert(item: Any, target: String): Unit = js.native
  def insert(item: Any, target: Any): Unit = js.native
  
  /** Insert the menu item after the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertAfter(item: Any, target: String): Unit = js.native
  def insertAfter(item: Any, target: Any): Unit = js.native
  
  /** Insert the menu item before the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertBefore(item: Any, target: String): Unit = js.native
  def insertBefore(item: Any, target: Any): Unit = js.native
  
  @JSName("model")
  var model_Menu: Model = js.native
  
  def remove(target: js.Array[Any]): Unit = js.native
  /** Remove Menu item.
    * @param {any|any[]} Selector of target node or Object of target node.
    * @returns {void}
    */
  def remove(target: Any): Unit = js.native
  
  /** To show the Menu control.
    * @param {number} x co-ordinate position of context menu.
    * @param {number} y co-ordinate position of context menu.
    * @param {any} target element
    * @param {any} name of the event
    * @returns {void}
    */
  def show(locationX: Double, locationY: Double, targetElement: Any, event: Any): Unit = js.native
  
  /** Show the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be shown
    * @returns {void}
    */
  def showItems(itemID: String): Unit = js.native
  def showItems(itemID: js.Array[Any]): Unit = js.native
}
object Menu {
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    inline def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the selected item
      */
    var selectedItem: js.UndefOr[Double] = js.undefined
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.undefined
    
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
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedItem(value: Double): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CloseEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** It receives the child data for the inner level.
      */
    var child: js.UndefOr[Any] = js.undefined
    
    /** It receives datasource as Essential DataManager object and JSON object.
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Specifies the HTML attributes to â€œLIâ€ item list.
      */
    var htmlAttribute: js.UndefOr[String] = js.undefined
    
    /** Specifies the id to menu items list
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Specifies the image attribute to â€œimgâ€ tag inside items list.
      */
    var imageAttribute: js.UndefOr[String] = js.undefined
    
    /** Specifies the image URL to â€œimgâ€ tag inside item list.
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Adds custom attributes like &quot;target&quot; to the anchor tag of the menu items.
      */
    var linkAttribute: js.UndefOr[String] = js.undefined
    
    /** Specifies the parent id of the table.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** It receives query to retrieve data from the table (query is same as SQL).
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Specifies the sprite CSS class to â€œLIâ€ item list.
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** It receives table name to execute query on the corresponding table.
      */
    var tableName: js.UndefOr[String] = js.undefined
    
    /** Specifies the text of menu items list.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL to the anchor tag in menu item list.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setChild(value: Any): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setHtmlAttribute(value: String): Self = StObject.set(x, "htmlAttribute", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributeUndefined: Self = StObject.set(x, "htmlAttribute", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageAttribute(value: String): Self = StObject.set(x, "imageAttribute", value.asInstanceOf[js.Any])
      
      inline def setImageAttributeUndefined: Self = StObject.set(x, "imageAttribute", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setLinkAttribute(value: String): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      inline def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait KeydownEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns clicked menu item text
      */
    var menuText: js.UndefOr[String] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeydownEventArgs {
    
    inline def apply(): KeydownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeydownEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
      
      inline def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** To enable or disable the Animation while hover or click an menu items.See AnimationType
      * @Default {ej.AnimationType.Default}
      */
    var animationType: js.UndefOr[AnimationType | String] = js.undefined
    
    /** Fires before context menu gets open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Fires when mouse click on menu items.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Fire when context menu on close.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the container element selectors for submenuâ€™s collision. The submenu gets displayed based on spacing available with respect to container element.
      * @Default {null}
      */
    var container: js.UndefOr[String] = js.undefined
    
    /** Specifies the target id of context menu. On right clicking the specified contextTarget element, context menu gets shown.
      * @Default {null}
      */
    var contextMenuTarget: js.UndefOr[String] = js.undefined
    
    /** Fires to create menu items.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires to destroy menu items.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** To enable or disable the Animation effect while hover or click an menu items.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the root menu items to be aligned center in horizontal menu.
      * @Default {false}
      */
    var enableCenterAlign: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the menu items to be displayed in right to left direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** When this property sets to false, the menu items is displayed without any separators.
      * @Default {true}
      */
    var enableSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Enable / Disable the Menu control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the target which needs to be excluded. i.e., The context menu will not be displayed in those specified targets.
      * @Default {null}
      */
    var excludeTarget: js.UndefOr[String] = js.undefined
    
    /** Fields used to bind the data source and it includes following field members to make data bind easier.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.undefined
    
    /** Specifies the height of the root menu.
      * @Default {auto}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the list of HTML attributes to be added to menu control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Enables/disables responsive support for the Menu control during the window resizing time.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when key down on menu items.
      */
    var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.undefined
    
    /** Specifies the type of the menu. Essential JavaScript Menu consists of two type of menu, they are Normal Menu and Context Menu mode.See MenuType
      * @Default {ej.MenuType.NormalMenu}
      */
    var menuType: js.UndefOr[String | MenuType] = js.undefined
    
    /** Fires when mouse out from menu items.
      */
    var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.undefined
    
    /** Fires when mouse over the Menu items.
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
    
    /** Fires when context menu on open.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the sub menu items to be show or open only on click.
      * @Default {false}
      */
    var openOnClick: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the orientation of normal menu. Normal menu can rendered in horizontal or vertical direction by using this API. See Orientation
      * @Default {ej.Orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.undefined
    
    /** Fires when overflow popup menu closes.
      */
    var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.undefined
    
    /** Specifies the popup menu height.
      * @Default {auto}
      */
    var overflowHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Fires when overflow popup menu opens.
      */
    var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.undefined
    
    /** Specifies the popup menu width.
      * @Default {auto}
      */
    var overflowWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the main menu items arrows only to be shown if it contains child items.
      * @Default {true}
      */
    var showRootLevelArrows: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the sub menu items arrows only to be shown if it contains child items.
      * @Default {true}
      */
    var showSubLevelArrows: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies position of pull down submenu that will appear on mouse over.See Direction
      * @Default {ej.Direction.Right}
      */
    var subMenuDirection: js.UndefOr[String | Direction] = js.undefined
    
    /** Specifies the title to responsive menu.
      * @Default {Menu}
      */
    var titleText: js.UndefOr[String] = js.undefined
    
    /** Specifies the width of the main menu.
      * @Default {auto}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Menu.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Menu.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Menu.Model] (val x: Self) extends AnyVal {
      
      inline def setAnimationType(value: AnimationType | String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContextMenuTarget(value: String): Self = StObject.set(x, "contextMenuTarget", value.asInstanceOf[js.Any])
      
      inline def setContextMenuTargetUndefined: Self = StObject.set(x, "contextMenuTarget", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEnableCenterAlign(value: Boolean): Self = StObject.set(x, "enableCenterAlign", value.asInstanceOf[js.Any])
      
      inline def setEnableCenterAlignUndefined: Self = StObject.set(x, "enableCenterAlign", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableSeparator(value: Boolean): Self = StObject.set(x, "enableSeparator", value.asInstanceOf[js.Any])
      
      inline def setEnableSeparatorUndefined: Self = StObject.set(x, "enableSeparator", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExcludeTarget(value: String): Self = StObject.set(x, "excludeTarget", value.asInstanceOf[js.Any])
      
      inline def setExcludeTargetUndefined: Self = StObject.set(x, "excludeTarget", js.undefined)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setMenuType(value: String | MenuType): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      inline def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      inline def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
      
      inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      inline def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenOnClick(value: Boolean): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
      
      inline def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverflowClose(value: /* e */ OverflowCloseEventArgs => Unit): Self = StObject.set(x, "overflowClose", js.Any.fromFunction1(value))
      
      inline def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
      
      inline def setOverflowHeight(value: String | Double): Self = StObject.set(x, "overflowHeight", value.asInstanceOf[js.Any])
      
      inline def setOverflowHeightUndefined: Self = StObject.set(x, "overflowHeight", js.undefined)
      
      inline def setOverflowOpen(value: /* e */ OverflowOpenEventArgs => Unit): Self = StObject.set(x, "overflowOpen", js.Any.fromFunction1(value))
      
      inline def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
      
      inline def setOverflowWidth(value: String | Double): Self = StObject.set(x, "overflowWidth", value.asInstanceOf[js.Any])
      
      inline def setOverflowWidthUndefined: Self = StObject.set(x, "overflowWidth", js.undefined)
      
      inline def setShowRootLevelArrows(value: Boolean): Self = StObject.set(x, "showRootLevelArrows", value.asInstanceOf[js.Any])
      
      inline def setShowRootLevelArrowsUndefined: Self = StObject.set(x, "showRootLevelArrows", js.undefined)
      
      inline def setShowSubLevelArrows(value: Boolean): Self = StObject.set(x, "showSubLevelArrows", value.asInstanceOf[js.Any])
      
      inline def setShowSubLevelArrowsUndefined: Self = StObject.set(x, "showSubLevelArrows", js.undefined)
      
      inline def setSubMenuDirection(value: String | Direction): Self = StObject.set(x, "subMenuDirection", value.asInstanceOf[js.Any])
      
      inline def setSubMenuDirectionUndefined: Self = StObject.set(x, "subMenuDirection", js.undefined)
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseoutEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseoutEventArgs {
    
    inline def apply(): MouseoutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoutEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseoutEventArgs] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MouseoverEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MouseoverEventArgs {
    
    inline def apply(): MouseoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseoverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseoverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element
      */
    var target: js.UndefOr[Any] = js.undefined
    
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
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OverflowCloseEventArgs extends StObject {
    
    /** if the event should be cancelled ; otherwise ,false
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowCloseEventArgs {
    
    inline def apply(): OverflowCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowCloseEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowCloseEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OverflowOpenEventArgs extends StObject {
    
    /** if the event should be cancelled ; otherwise ,false
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the event object
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowOpenEventArgs {
    
    inline def apply(): OverflowOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
