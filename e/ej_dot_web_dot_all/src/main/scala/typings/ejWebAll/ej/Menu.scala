package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends Widget_ {
  
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
  def hideItems(itemID: js.Array[_]): Unit = js.native
  
  /** Insert the menu item as child of target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insert(item: js.Any, target: String): Unit = js.native
  def insert(item: js.Any, target: js.Any): Unit = js.native
  
  /** Insert the menu item after the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertAfter(item: js.Any, target: String): Unit = js.native
  def insertAfter(item: js.Any, target: js.Any): Unit = js.native
  
  /** Insert the menu item before the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertBefore(item: js.Any, target: String): Unit = js.native
  def insertBefore(item: js.Any, target: js.Any): Unit = js.native
  
  @JSName("model")
  var model_Menu: Model = js.native
  
  /** Remove Menu item.
    * @param {any|any[]} Selector of target node or Object of target node.
    * @returns {void}
    */
  def remove(target: js.Any): Unit = js.native
  def remove(target: js.Array[_]): Unit = js.native
  
  /** To show the Menu control.
    * @param {number} x co-ordinate position of context menu.
    * @param {number} y co-ordinate position of context menu.
    * @param {any} target element
    * @param {any} name of the event
    * @returns {void}
    */
  def show(locationX: Double, locationY: Double, targetElement: js.Any, event: js.Any): Unit = js.native
  
  /** Show the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be shown
    * @returns {void}
    */
  def showItems(itemID: String): Unit = js.native
  def showItems(itemID: js.Array[_]): Unit = js.native
}
object Menu {
  
  @js.native
  trait BeforeOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the selected item
      */
    var selectedItem: js.UndefOr[Double] = js.native
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: Double): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
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
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
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
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
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
  trait Fields extends StObject {
    
    /** It receives the child data for the inner level.
      */
    var child: js.UndefOr[js.Any] = js.native
    
    /** It receives datasource as Essential DataManager object and JSON object.
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Specifies the HTML attributes to â€œLIâ€ item list.
      */
    var htmlAttribute: js.UndefOr[String] = js.native
    
    /** Specifies the id to menu items list
      */
    var id: js.UndefOr[String] = js.native
    
    /** Specifies the image attribute to â€œimgâ€ tag inside items list.
      */
    var imageAttribute: js.UndefOr[String] = js.native
    
    /** Specifies the image URL to â€œimgâ€ tag inside item list.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Adds custom attributes like &quot;target&quot; to the anchor tag of the menu items.
      */
    var linkAttribute: js.UndefOr[String] = js.native
    
    /** Specifies the parent id of the table.
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** It receives query to retrieve data from the table (query is same as SQL).
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /** Specifies the sprite CSS class to â€œLIâ€ item list.
      */
    var spriteCssClass: js.UndefOr[String] = js.native
    
    /** It receives table name to execute query on the corresponding table.
      */
    var tableName: js.UndefOr[String] = js.native
    
    /** Specifies the text of menu items list.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Specifies the URL to the anchor tag in menu item list.
      */
    var url: js.UndefOr[String] = js.native
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
      def setChild(value: js.Any): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setHtmlAttribute(value: String): Self = StObject.set(x, "htmlAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributeUndefined: Self = StObject.set(x, "htmlAttribute", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageAttribute(value: String): Self = StObject.set(x, "imageAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAttributeUndefined: Self = StObject.set(x, "imageAttribute", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setLinkAttribute(value: String): Self = StObject.set(x, "linkAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkAttributeUndefined: Self = StObject.set(x, "linkAttribute", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
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
  
  @js.native
  trait KeydownEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns clicked menu item text
      */
    var menuText: js.UndefOr[String] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object KeydownEventArgs {
    
    @scala.inline
    def apply(): KeydownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeydownEventArgs]
    }
    
    @scala.inline
    implicit class KeydownEventArgsMutableBuilder[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setMenuText(value: String): Self = StObject.set(x, "menuText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTextUndefined: Self = StObject.set(x, "menuText", js.undefined)
      
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
    
    /** To enable or disable the Animation while hover or click an menu items.See AnimationType
      * @Default {ej.AnimationType.Default}
      */
    var animationType: js.UndefOr[AnimationType | String] = js.native
    
    /** Fires before context menu gets open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
    
    /** Fires when mouse click on menu items.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
    
    /** Fire when context menu on close.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
    
    /** Specifies the container element selectors for submenuâ€™s collision. The submenu gets displayed based on spacing available with respect to container element.
      * @Default {null}
      */
    var container: js.UndefOr[String] = js.native
    
    /** Specifies the target id of context menu. On right clicking the specified contextTarget element, context menu gets shown.
      * @Default {null}
      */
    var contextMenuTarget: js.UndefOr[String] = js.native
    
    /** Fires to create menu items.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Specify the CSS class to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires to destroy menu items.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** To enable or disable the Animation effect while hover or click an menu items.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Specifies the root menu items to be aligned center in horizontal menu.
      * @Default {false}
      */
    var enableCenterAlign: js.UndefOr[Boolean] = js.native
    
    /** Specifies the menu items to be displayed in right to left direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** When this property sets to false, the menu items is displayed without any separators.
      * @Default {true}
      */
    var enableSeparator: js.UndefOr[Boolean] = js.native
    
    /** Enable / Disable the Menu control.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Specifies the target which needs to be excluded. i.e., The context menu will not be displayed in those specified targets.
      * @Default {null}
      */
    var excludeTarget: js.UndefOr[String] = js.native
    
    /** Fields used to bind the data source and it includes following field members to make data bind easier.
      * @Default {null}
      */
    var fields: js.UndefOr[Fields] = js.native
    
    /** Specifies the height of the root menu.
      * @Default {auto}
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Specifies the list of HTML attributes to be added to menu control.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Enables/disables responsive support for the Menu control during the window resizing time.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Fires when key down on menu items.
      */
    var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
    
    /** Specifies the type of the menu. Essential JavaScript Menu consists of two type of menu, they are Normal Menu and Context Menu mode.See MenuType
      * @Default {ej.MenuType.NormalMenu}
      */
    var menuType: js.UndefOr[String | MenuType] = js.native
    
    /** Fires when mouse out from menu items.
      */
    var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
    
    /** Fires when mouse over the Menu items.
      */
    var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
    
    /** Fires when context menu on open.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Specifies the sub menu items to be show or open only on click.
      * @Default {false}
      */
    var openOnClick: js.UndefOr[Boolean] = js.native
    
    /** Specifies the orientation of normal menu. Normal menu can rendered in horizontal or vertical direction by using this API. See Orientation
      * @Default {ej.Orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.native
    
    /** Fires when overflow popup menu closes.
      */
    var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.native
    
    /** Specifies the popup menu height.
      * @Default {auto}
      */
    var overflowHeight: js.UndefOr[String | Double] = js.native
    
    /** Fires when overflow popup menu opens.
      */
    var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.native
    
    /** Specifies the popup menu width.
      * @Default {auto}
      */
    var overflowWidth: js.UndefOr[String | Double] = js.native
    
    /** Specifies the main menu items arrows only to be shown if it contains child items.
      * @Default {true}
      */
    var showRootLevelArrows: js.UndefOr[Boolean] = js.native
    
    /** Specifies the sub menu items arrows only to be shown if it contains child items.
      * @Default {true}
      */
    var showSubLevelArrows: js.UndefOr[Boolean] = js.native
    
    /** Specifies position of pull down submenu that will appear on mouse over.See Direction
      * @Default {ej.Direction.Right}
      */
    var subMenuDirection: js.UndefOr[String | Direction] = js.native
    
    /** Specifies the title to responsive menu.
      * @Default {Menu}
      */
    var titleText: js.UndefOr[String] = js.native
    
    /** Specifies the width of the main menu.
      * @Default {auto}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Menu.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Menu.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Menu.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationType(value: AnimationType | String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContextMenuTarget(value: String): Self = StObject.set(x, "contextMenuTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuTargetUndefined: Self = StObject.set(x, "contextMenuTarget", js.undefined)
      
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
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnableCenterAlign(value: Boolean): Self = StObject.set(x, "enableCenterAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCenterAlignUndefined: Self = StObject.set(x, "enableCenterAlign", js.undefined)
      
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
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setExcludeTarget(value: String): Self = StObject.set(x, "excludeTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTargetUndefined: Self = StObject.set(x, "excludeTarget", js.undefined)
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
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
      def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setMenuType(value: String | MenuType): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      @scala.inline
      def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      @scala.inline
      def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenOnClick(value: Boolean): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOverflowClose(value: /* e */ OverflowCloseEventArgs => Unit): Self = StObject.set(x, "overflowClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverflowCloseUndefined: Self = StObject.set(x, "overflowClose", js.undefined)
      
      @scala.inline
      def setOverflowHeight(value: String | Double): Self = StObject.set(x, "overflowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowHeightUndefined: Self = StObject.set(x, "overflowHeight", js.undefined)
      
      @scala.inline
      def setOverflowOpen(value: /* e */ OverflowOpenEventArgs => Unit): Self = StObject.set(x, "overflowOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverflowOpenUndefined: Self = StObject.set(x, "overflowOpen", js.undefined)
      
      @scala.inline
      def setOverflowWidth(value: String | Double): Self = StObject.set(x, "overflowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowWidthUndefined: Self = StObject.set(x, "overflowWidth", js.undefined)
      
      @scala.inline
      def setShowRootLevelArrows(value: Boolean): Self = StObject.set(x, "showRootLevelArrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRootLevelArrowsUndefined: Self = StObject.set(x, "showRootLevelArrows", js.undefined)
      
      @scala.inline
      def setShowSubLevelArrows(value: Boolean): Self = StObject.set(x, "showSubLevelArrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSubLevelArrowsUndefined: Self = StObject.set(x, "showSubLevelArrows", js.undefined)
      
      @scala.inline
      def setSubMenuDirection(value: String | Direction): Self = StObject.set(x, "subMenuDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuDirectionUndefined: Self = StObject.set(x, "subMenuDirection", js.undefined)
      
      @scala.inline
      def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MouseoutEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
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
    }
  }
  
  @js.native
  trait MouseoverEventArgs extends StObject {
    
    /** returns clicked menu item element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns clicked menu item text
      */
    var text: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
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
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
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
  
  @js.native
  trait OverflowCloseEventArgs extends StObject {
    
    /** if the event should be cancelled ; otherwise ,false
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
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
  trait OverflowOpenEventArgs extends StObject {
    
    /** if the event should be cancelled ; otherwise ,false
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** returns the menu model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
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
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
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
