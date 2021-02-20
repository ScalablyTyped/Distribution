package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownTree extends Widget_ {
  
  /** Checks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  
  /** Checks a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def checkNode(element: String): Unit = js.native
  def checkNode(element: js.Any): Unit = js.native
  def checkNode(element: js.Array[_]): Unit = js.native
  
  /** Clears the text in the DropDownTree.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Returns the selected value.
    * @returns {void}
    */
  def getValue(): Unit = js.native
  
  /** Hides the popup in the DropDownTree.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  
  @JSName("model")
  var model_DropDownTree: Model = js.native
  
  /** Moves the DropDownTree node within the same DropDownTree. The new position of the given DropDownTree node will be based on destination node and index position.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {string|any} ID of the DropDownTree node/object of the DropDownTree node.
    * @param {number} New index position of the given source node.
    * @returns {void}
    */
  def moveNode(sourceNode: String, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: String, destinationNode: js.Any, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: String, index: Double): Unit = js.native
  def moveNode(sourceNode: js.Any, destinationNode: js.Any, index: Double): Unit = js.native
  
  /** Removes all the nodes in the DropDownTree.
    * @returns {void}
    */
  def removeAll(): Unit = js.native
  
  /** Removes a node in the DropDownTree.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/collectionof the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def removeNode(element: String): Unit = js.native
  def removeNode(element: js.Any): Unit = js.native
  def removeNode(element: js.Array[_]): Unit = js.native
  
  /** Selects all the DropDownTree nodes when allowMultiSelection field is enabled in the treeViewSettings property.
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  
  /** Selects a node in the DropDownTree control. To select the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of I the D/object of the DropDownTree nodes.
    * @returns {void}
    */
  def selectNode(element: String): Unit = js.native
  def selectNode(element: js.Any): Unit = js.native
  def selectNode(element: js.Array[_]): Unit = js.native
  
  /** Shows the DropDownTree control with the popup.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
  
  /** Unchecks all the nodes in the DropDownTree.
    * @returns {void}
    */
  def unCheckAll(): Unit = js.native
  
  /** Unchecks a node in the DropDownTree.
    * @param {string|any|any[]} ID of the DropDownTree node/object of the DropDownTree node/collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unCheckNode(element: String): Unit = js.native
  def unCheckNode(element: js.Any): Unit = js.native
  def unCheckNode(element: js.Array[_]): Unit = js.native
  
  /** Unselects all the DropDownTree nodes when allowMultiSelection field of the treeViewSettings property is enabled.
    * @returns {void}
    */
  def unselectAll(): Unit = js.native
  
  /** Unselects a node in the DropDownTree control. To unselect the collection of nodes in the DropDownTree control, enable allowMultiSelection field of the treeViewSettings property.
    * @param {string|any|any[]}  ID of the DropDownTree node/object of the DropDownTree node/ collection of the ID/object of the DropDownTree nodes.
    * @returns {void}
    */
  def unselectNode(element: String): Unit = js.native
  def unselectNode(element: js.Any): Unit = js.native
  def unselectNode(element: js.Array[_]): Unit = js.native
}
object DropDownTree {
  
  @js.native
  trait BlurEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BlurEventArgs {
    
    @scala.inline
    def apply(): BlurEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlurEventArgs]
    }
    
    @scala.inline
    implicit class BlurEventArgsMutableBuilder[Self <: BlurEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** Selected item's ID.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Selected item's text.
      */
    var selectedText: js.UndefOr[String] = js.native
    
    /** Selected item's text.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Selected item's value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CheckChangeEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** Selected item's ID.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Selected item's text.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Selected item's value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object CheckChangeEventArgs {
    
    @scala.inline
    def apply(): CheckChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckChangeEventArgs]
    }
    
    @scala.inline
    implicit class CheckChangeEventArgsMutableBuilder[Self <: CheckChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Selected item's text.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Selected item's value.
      */
    var value: js.UndefOr[String] = js.native
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
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Event name
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
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Event name
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
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FilteringEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the data items of theDropDownTreeView.
      */
    var items: js.UndefOr[js.Any] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the search string typed in the search box.
      */
    var searchString: js.UndefOr[String] = js.native
    
    /** Selected item's text.
      */
    var selectedText: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object FilteringEventArgs {
    
    @scala.inline
    def apply(): FilteringEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringEventArgs]
    }
    
    @scala.inline
    implicit class FilteringEventArgsMutableBuilder[Self <: FilteringEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
      
      @scala.inline
      def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FocusEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object FocusEventArgs {
    
    @scala.inline
    def apply(): FocusEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusEventArgs]
    }
    
    @scala.inline
    implicit class FocusEventArgsMutableBuilder[Self <: FocusEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
    
    /** Fires the action once the DropDownTree is created.
      */
    var Create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Uses the keyboard for any action, including opening and closing the drop-down tree; navigating, expanding, and collapsing nodes of the dropdown tree; and more.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Fires the action when the DropDownTree is about to lose focus.
      */
    var blur: js.UndefOr[js.Function1[/* e */ BlurEventArgs, Unit]] = js.native
    
    /** Fires the action when the DropDownTree control's value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
    
    /** Fires the action when the list item checkbox value is changed.
      */
    var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
    
    /** Fires the action once the popup is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
    
    /** Sets the root CSS class for DropDownTree that allows customization of appearance.
      * @Default {``}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled. When you enter the delimiter value, the text after the delimiter is considered as a
      * separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,), semi-colon (;), or any other special
      * character.
      * @Default {,}
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /** Fires the action when DropDownTree is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** The enabled animation property uses the easeOutQuad animation to SlideDown and SlideUp the popup wrapper in 200 and 100 milliseconds, respectively.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to continue the DropDownTree model state in the page using applicable medium, i.e., HTML5 localStorage or cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Sets the DropDownTree textbox direction from right to left alignment.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether the DropDownTree control responds to user interaction or not. By default, the control is in the enabled mode and can be disabled by setting this to false.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** When the enableFilterSearch is enabled, the filtering action is fired as soon as you start typing in the DropDownTree.
      */
    var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
    
    /** Fires the action when the DropDownTree is focused.
      */
    var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
    
    /** Creates footer with text or HTML elements for the dropdown items.
      * @Default {null}
      */
    var footerTemplate: js.UndefOr[String] = js.native
    
    /** Serves as a patch of the entries comprising the path (that is set in the entry area) of the selected node.
      * @Default {'/'}
      */
    var fullPathDelimiter: js.UndefOr[String] = js.native
    
    /** Creates header with text or HTML elements for the dropdown items.
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.native
    
    /** Defines the height of the DropDownTree textbox.
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Allows you to set a particular country or regional language for the DropDownTree.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Fires the action once the popup is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Customizes the height and width of the popup wrapper.
      * @Default {{height: '152px',width: 'auto',showPopupOnLoad: false}}
      */
    var popupSettings: js.UndefOr[PopupSettings] = js.native
    
    /** Specifies that the DropDownTree textbox values should be read-only.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Fires the action when the list of nodes in the DropDownTree is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
    
    /** The DropDownTree's textbox is displayed with rounded corner style.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Specifies the targetID for the DropDownTree's items.
      * @Default {null}
      */
    var targetID: js.UndefOr[String] = js.native
    
    /** Specifies the delimiter between nodes (indicating their hierarchy).
      * @Default {ej.DropDownTree.TextMode.none}
      */
    var textMode: js.UndefOr[Textmode | String] = js.native
    
    /** Defines the popup settings of the DropDownTree widget. You can use any property which are in treeview using this property.
      * @Default {{}}
      */
    var treeViewSettings: js.UndefOr[js.Any] = js.native
    
    /** Sets the jQuery validation error message in the DropDownTree.
      * @Default {null}
      */
    var validationMessage: js.UndefOr[js.Any] = js.native
    
    /** Sets the jQuery validation rules in the DropDownTree.
      * @Default {null}
      */
    var validationRules: js.UndefOr[js.Any] = js.native
    
    /** Specifies the value (text content) for the DropDownTree control. For the single selection mode, the selected item's value will be returned in its data type, and for
      * MultiSelectMode, returns the selected items values separated by delimiter in string type.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.native
    
    /** Specifies a short hint that describes the expected value of the DropDownTree control.
      * @Default {null}
      */
    var watermarkText: js.UndefOr[String] = js.native
    
    /** Defines the width of the DropDownTree textbox.
      * @Default {100%}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.DropDownTree.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.DropDownTree.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.DropDownTree.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setBlur(value: /* e */ BlurEventArgs => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "Create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "Create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
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
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFiltering(value: /* e */ FilteringEventArgs => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
      
      @scala.inline
      def setFocus(value: /* e */ FocusEventArgs => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      @scala.inline
      def setFullPathDelimiter(value: String): Self = StObject.set(x, "fullPathDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPathDelimiterUndefined: Self = StObject.set(x, "fullPathDelimiter", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPopupSettings(value: PopupSettings): Self = StObject.set(x, "popupSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupSettingsUndefined: Self = StObject.set(x, "popupSettings", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setTargetID(value: String): Self = StObject.set(x, "targetID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIDUndefined: Self = StObject.set(x, "targetID", js.undefined)
      
      @scala.inline
      def setTextMode(value: Textmode | String): Self = StObject.set(x, "textMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextModeUndefined: Self = StObject.set(x, "textMode", js.undefined)
      
      @scala.inline
      def setTreeViewSettings(value: js.Any): Self = StObject.set(x, "treeViewSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeViewSettingsUndefined: Self = StObject.set(x, "treeViewSettings", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: js.Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWatermarkText(value: String): Self = StObject.set(x, "watermarkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkTextUndefined: Self = StObject.set(x, "watermarkText", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Selected item's text.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Selected item's value.
      */
    var value: js.UndefOr[String] = js.native
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
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PopupSettings extends StObject {
    
    /** Defines the height of the popup wrapper in the DropDownTree control.
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** The DropDownTree control is displayed with the popup.
      */
    var showPopupOnLoad: js.UndefOr[Boolean] = js.native
    
    /** Defines the width of the popup wrapper in the DropDownTree control.
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object PopupSettings {
    
    @scala.inline
    def apply(): PopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupSettings]
    }
    
    @scala.inline
    implicit class PopupSettingsMutableBuilder[Self <: PopupSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setShowPopupOnLoad(value: Boolean): Self = StObject.set(x, "showPopupOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPopupOnLoadUndefined: Self = StObject.set(x, "showPopupOnLoad", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SelectEventArgs extends StObject {
    
    /** If the event has to be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the selected item with checkbox checked or not.
      */
    var isChecked: js.UndefOr[Boolean] = js.native
    
    /** Selected item's ID.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** DropDownTreeView model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Selected item's text.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Event name
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Selected item's value.
      */
    var value: js.UndefOr[String] = js.native
  }
  object SelectEventArgs {
    
    @scala.inline
    def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit class SelectEventArgsMutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
