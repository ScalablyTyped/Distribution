package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.dblclick_
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxTreeView.Item
import typings.devextreme.mod.DevExpress.ui.dxTreeView.Node
import typings.devextreme.mod.DevExpress.ui.dxTreeView.Scrollable
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeView[TKey]
  extends StObject
     with CollectionWidget[dxTreeViewOptions[TKey], dxTreeViewItem, TKey] {
  
  /**
    * Collapses all items.
    */
  def collapseAll(): Unit = js.native
  
  /**
    * Collapses an item with a specific key.
    */
  def collapseItem(itemData: Item): js.Promise[Unit] = js.native
  /**
    * Collapses an item found using its DOM node.
    */
  def collapseItem(itemElement: Element): js.Promise[Unit] = js.native
  /**
    * Collapses an item with a specific key.
    */
  def collapseItem(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Expands all items. If you load items on demand, this method expands only the loaded items.
    */
  def expandAll(): Unit = js.native
  
  /**
    * Expands an item found using its data object.
    */
  def expandItem(itemData: Item): js.Promise[Unit] = js.native
  /**
    * Expands an item found using its DOM node.
    */
  def expandItem(itemElement: Element): js.Promise[Unit] = js.native
  /**
    * Expands an item with a specific key.
    */
  def expandItem(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Gets all nodes.
    */
  def getNodes(): js.Array[Node[TKey]] = js.native
  
  /**
    * 
    */
  def getScrollable(): Scrollable = js.native
  
  /**
    * Gets the keys of selected nodes.
    */
  def getSelectedNodeKeys(): js.Array[TKey] = js.native
  
  /**
    * Gets selected nodes.
    */
  def getSelectedNodes(): js.Array[Node[TKey]] = js.native
  
  /**
    * Scrolls the content to an item found using its data.
    */
  def scrollToItem(itemData: Item): js.Promise[Unit] = js.native
  /**
    * Scrolls the content to an item found using its DOM node.
    */
  def scrollToItem(itemElement: Element): js.Promise[Unit] = js.native
  /**
    * Scrolls the content to an item found using its key.
    */
  def scrollToItem(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Selects all nodes.
    */
  def selectAll(): Unit = js.native
  
  /**
    * Selects a node found using its data object.
    */
  def selectItem(itemData: Item): Boolean = js.native
  /**
    * Selects a TreeView node found using its DOM node.
    */
  def selectItem(itemElement: Element): Boolean = js.native
  /**
    * Selects a node with a specific key.
    */
  def selectItem(key: TKey): Boolean = js.native
  
  /**
    * Cancels the selection of all nodes.
    */
  def unselectAll(): Unit = js.native
  
  /**
    * Cancels the selection of a node found using its data object.
    */
  def unselectItem(itemData: Item): Boolean = js.native
  /**
    * Cancels the selection of a TreeView node found using its DOM node.
    */
  def unselectItem(itemElement: Element): Boolean = js.native
  /**
    * Cancels the selection of a node with a specific key.
    */
  def unselectItem(key: TKey): Boolean = js.native
  
  /**
    * Updates the tree view scrollbars according to the current size of the UI component content.
    */
  def updateDimensions(): js.Promise[Unit] = js.native
}
object dxTreeView {
  
  type ContentReadyEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  type DisposingEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  trait ExplicitTypes[TKey] extends StObject {
    
    var ContentReadyEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ContentReadyEvent[TKey]
    
    var DisposingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.DisposingEvent[TKey]
    
    var InitializedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.InitializedEvent[TKey]
    
    var ItemClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemClickEvent[TKey]
    
    var ItemCollapsedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemCollapsedEvent[TKey]
    
    var ItemContextMenuEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemContextMenuEvent[TKey]
    
    var ItemExpandedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemExpandedEvent[TKey]
    
    var ItemHoldEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemHoldEvent[TKey]
    
    var ItemRenderedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemRenderedEvent[TKey]
    
    var ItemSelectionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.ItemSelectionChangedEvent[TKey]
    
    var Node: typings.devextreme.mod.DevExpress.ui.dxTreeView.Node[TKey]
    
    var OptionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.OptionChangedEvent[TKey]
    
    var Properties: typings.devextreme.mod.DevExpress.ui.dxTreeView.Properties[TKey]
    
    var SelectAllValueChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.SelectAllValueChangedEvent[TKey]
    
    var SelectionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeView.SelectionChangedEvent[TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TKey](
      ContentReadyEvent: ContentReadyEvent[TKey],
      DisposingEvent: DisposingEvent[TKey],
      InitializedEvent: InitializedEvent[TKey],
      ItemClickEvent: ItemClickEvent[TKey],
      ItemCollapsedEvent: ItemCollapsedEvent[TKey],
      ItemContextMenuEvent: ItemContextMenuEvent[TKey],
      ItemExpandedEvent: ItemExpandedEvent[TKey],
      ItemHoldEvent: ItemHoldEvent[TKey],
      ItemRenderedEvent: ItemRenderedEvent[TKey],
      ItemSelectionChangedEvent: ItemSelectionChangedEvent[TKey],
      Node: Node[TKey],
      OptionChangedEvent: OptionChangedEvent[TKey],
      Properties: Properties[TKey],
      SelectAllValueChangedEvent: SelectAllValueChangedEvent[TKey],
      SelectionChangedEvent: SelectionChangedEvent[TKey]
    ): ExplicitTypes[TKey] = {
      val __obj = js.Dynamic.literal(ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], ItemClickEvent = ItemClickEvent.asInstanceOf[js.Any], ItemCollapsedEvent = ItemCollapsedEvent.asInstanceOf[js.Any], ItemContextMenuEvent = ItemContextMenuEvent.asInstanceOf[js.Any], ItemExpandedEvent = ItemExpandedEvent.asInstanceOf[js.Any], ItemHoldEvent = ItemHoldEvent.asInstanceOf[js.Any], ItemRenderedEvent = ItemRenderedEvent.asInstanceOf[js.Any], ItemSelectionChangedEvent = ItemSelectionChangedEvent.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], SelectAllValueChangedEvent = SelectAllValueChangedEvent.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplicitTypes[?], TKey] (val x: Self & ExplicitTypes[TKey]) extends AnyVal {
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemClickEvent(value: ItemClickEvent[TKey]): Self = StObject.set(x, "ItemClickEvent", value.asInstanceOf[js.Any])
      
      inline def setItemCollapsedEvent(value: ItemCollapsedEvent[TKey]): Self = StObject.set(x, "ItemCollapsedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemContextMenuEvent(value: ItemContextMenuEvent[TKey]): Self = StObject.set(x, "ItemContextMenuEvent", value.asInstanceOf[js.Any])
      
      inline def setItemExpandedEvent(value: ItemExpandedEvent[TKey]): Self = StObject.set(x, "ItemExpandedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemHoldEvent(value: ItemHoldEvent[TKey]): Self = StObject.set(x, "ItemHoldEvent", value.asInstanceOf[js.Any])
      
      inline def setItemRenderedEvent(value: ItemRenderedEvent[TKey]): Self = StObject.set(x, "ItemRenderedEvent", value.asInstanceOf[js.Any])
      
      inline def setItemSelectionChangedEvent(value: ItemSelectionChangedEvent[TKey]): Self = StObject.set(x, "ItemSelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TKey]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setSelectAllValueChangedEvent(value: SelectAllValueChangedEvent[TKey]): Self = StObject.set(x, "SelectAllValueChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type InitializedEvent[TKey] = InitializedEventInfo[dxTreeView[TKey]]
  
  type Item = dxTreeViewItem
  
  trait ItemClickEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], KeyboardEvent | MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemClickEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemClickEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemClickEvent[TKey]]
    }
  }
  
  trait ItemCollapsedEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemCollapsedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemCollapsedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCollapsedEvent[TKey]]
    }
  }
  
  trait ItemContextMenuEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TKey]
  object ItemContextMenuEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemContextMenuEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemContextMenuEvent[TKey]]
    }
  }
  
  trait ItemExpandedEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent]
       with ItemInfo[TKey]
  object ItemExpandedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemExpandedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemExpandedEvent[TKey]]
    }
  }
  
  trait ItemHoldEvent[TKey]
    extends StObject
       with NativeEventInfo[dxTreeView[TKey], MouseEvent | PointerEvent | TouchEvent]
       with ItemInfo[TKey]
  object ItemHoldEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemHoldEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemHoldEvent[TKey]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait ItemInfo[TKey] extends StObject {
    
    val itemData: js.UndefOr[Item] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val itemIndex: js.UndefOr[Double] = js.undefined
    
    val node: js.UndefOr[Node[TKey]] = js.undefined
  }
  object ItemInfo {
    
    inline def apply[TKey](): ItemInfo[TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemInfo[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemInfo[?], TKey] (val x: Self & ItemInfo[TKey]) extends AnyVal {
      
      inline def setItemData(value: Item): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
      
      inline def setNode(value: Node[TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait ItemRenderedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ItemInfo[TKey]
  object ItemRenderedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemRenderedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenderedEvent[TKey]]
    }
  }
  
  trait ItemSelectionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ItemInfo[TKey]
  object ItemSelectionChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): ItemSelectionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemSelectionChangedEvent[TKey]]
    }
  }
  
  type Node[TKey] = dxTreeViewNode[TKey]
  
  trait OptionChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TKey]]
    }
  }
  
  type Properties[TKey] = dxTreeViewOptions[TKey]
  
  /* Inlined devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.dxScrollable<devextreme.devextreme.DevExpress.ui.dxScrollable.Properties>, '_templateManager' | '_cancelOptionChange' | '_getTemplate' | '_invalidate' | '_refresh' | '_notifyOptionChanged' | '_createElement'> */
  trait Scrollable extends StObject {
    
    @JSName("$element")
    def $element(): UserDefinedElement[Element]
    @JSName("$element")
    var $element_Original: js.Function0[UserDefinedElement[Element]]
    
    def beginUpdate(): Unit
    @JSName("beginUpdate")
    var beginUpdate_Original: js.Function0[Unit]
    
    def clientHeight(): Double
    @JSName("clientHeight")
    var clientHeight_Original: js.Function0[Double]
    
    def clientWidth(): Double
    @JSName("clientWidth")
    var clientWidth_Original: js.Function0[Double]
    
    def content(): DxElement_[HTMLElement]
    @JSName("content")
    var content_Original: js.Function0[DxElement_[HTMLElement]]
    
    def dispose(): Unit
    @JSName("dispose")
    var dispose_Original: js.Function0[Unit]
    
    def element(): DxElement_[HTMLElement]
    @JSName("element")
    var element_Original: js.Function0[DxElement_[HTMLElement]]
    
    def endUpdate(): Unit
    @JSName("endUpdate")
    var endUpdate_Original: js.Function0[Unit]
    
    def instance(): this.type
    @JSName("instance")
    var instance_Original: js.Function0[this.type]
    
    def off(eventName: String): this.type
    @JSName("off")
    var off_Original: js.Function1[/* eventName */ String, this.type]
    
    def on(eventName: String, eventHandler: js.Function): this.type
    @JSName("on")
    var on_Original: js.Function2[/* eventName */ String, /* eventHandler */ js.Function, this.type]
    
    def option(): typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties
    @JSName("option")
    var option_Original: js.Function0[typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties]
    
    def resetOption(optionName: String): Unit
    @JSName("resetOption")
    var resetOption_Original: js.Function1[/* optionName */ String, Unit]
    
    def scrollBy(distance: Any): Unit
    def scrollBy(distance: Double): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function1[/* distance */ Double | Any, Unit]
    
    def scrollHeight(): Double
    @JSName("scrollHeight")
    var scrollHeight_Original: js.Function0[Double]
    
    def scrollLeft(): Double
    @JSName("scrollLeft")
    var scrollLeft_Original: js.Function0[Double]
    
    def scrollOffset(): Any
    @JSName("scrollOffset")
    var scrollOffset_Original: js.Function0[Any]
    
    def scrollTo(targetLocation: Any): Unit
    def scrollTo(targetLocation: Double): Unit
    
    def scrollToElement(element: UserDefinedElement[Element]): Unit
    @JSName("scrollToElement")
    var scrollToElement_Original: js.Function1[/* element */ UserDefinedElement[Element], Unit]
    
    @JSName("scrollTo")
    var scrollTo_Original: js.Function1[/* targetLocation */ Double | Any, Unit]
    
    def scrollTop(): Double
    @JSName("scrollTop")
    var scrollTop_Original: js.Function0[Double]
    
    def scrollWidth(): Double
    @JSName("scrollWidth")
    var scrollWidth_Original: js.Function0[Double]
    
    def update(): js.Promise[Unit]
    @JSName("update")
    var update_Original: js.Function0[js.Promise[Unit]]
  }
  object Scrollable {
    
    inline def apply(
      $element: () => UserDefinedElement[Element],
      beginUpdate: () => Unit,
      clientHeight: () => Double,
      clientWidth: () => Double,
      content: () => DxElement_[HTMLElement],
      dispose: () => Unit,
      element: () => DxElement_[HTMLElement],
      endUpdate: () => Unit,
      instance: () => Scrollable,
      off: /* eventName */ String => Scrollable,
      on: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable,
      option: () => typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties,
      resetOption: /* optionName */ String => Unit,
      scrollBy: /* distance */ Double | Any => Unit,
      scrollHeight: () => Double,
      scrollLeft: () => Double,
      scrollOffset: () => Any,
      scrollTo: /* targetLocation */ Double | Any => Unit,
      scrollToElement: /* element */ UserDefinedElement[Element] => Unit,
      scrollTop: () => Double,
      scrollWidth: () => Double,
      update: () => js.Promise[Unit]
    ): Scrollable = {
      val __obj = js.Dynamic.literal($element = js.Any.fromFunction0($element), beginUpdate = js.Any.fromFunction0(beginUpdate), clientHeight = js.Any.fromFunction0(clientHeight), clientWidth = js.Any.fromFunction0(clientWidth), content = js.Any.fromFunction0(content), dispose = js.Any.fromFunction0(dispose), element = js.Any.fromFunction0(element), endUpdate = js.Any.fromFunction0(endUpdate), instance = js.Any.fromFunction0(instance), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), option = js.Any.fromFunction0(option), resetOption = js.Any.fromFunction1(resetOption), scrollBy = js.Any.fromFunction1(scrollBy), scrollHeight = js.Any.fromFunction0(scrollHeight), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollOffset = js.Any.fromFunction0(scrollOffset), scrollTo = js.Any.fromFunction1(scrollTo), scrollToElement = js.Any.fromFunction1(scrollToElement), scrollTop = js.Any.fromFunction0(scrollTop), scrollWidth = js.Any.fromFunction0(scrollWidth), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Scrollable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
      
      inline def set$element(value: () => UserDefinedElement[Element]): Self = StObject.set(x, "$element", js.Any.fromFunction0(value))
      
      inline def setBeginUpdate(value: () => Unit): Self = StObject.set(x, "beginUpdate", js.Any.fromFunction0(value))
      
      inline def setClientHeight(value: () => Double): Self = StObject.set(x, "clientHeight", js.Any.fromFunction0(value))
      
      inline def setClientWidth(value: () => Double): Self = StObject.set(x, "clientWidth", js.Any.fromFunction0(value))
      
      inline def setContent(value: () => DxElement_[HTMLElement]): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => DxElement_[HTMLElement]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
      
      inline def setInstance(value: () => Scrollable): Self = StObject.set(x, "instance", js.Any.fromFunction0(value))
      
      inline def setOff(value: /* eventName */ String => Scrollable): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOption(value: () => typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties): Self = StObject.set(x, "option", js.Any.fromFunction0(value))
      
      inline def setResetOption(value: /* optionName */ String => Unit): Self = StObject.set(x, "resetOption", js.Any.fromFunction1(value))
      
      inline def setScrollBy(value: /* distance */ Double | Any => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction1(value))
      
      inline def setScrollHeight(value: () => Double): Self = StObject.set(x, "scrollHeight", js.Any.fromFunction0(value))
      
      inline def setScrollLeft(value: () => Double): Self = StObject.set(x, "scrollLeft", js.Any.fromFunction0(value))
      
      inline def setScrollOffset(value: () => Any): Self = StObject.set(x, "scrollOffset", js.Any.fromFunction0(value))
      
      inline def setScrollTo(value: /* targetLocation */ Double | Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToElement(value: /* element */ UserDefinedElement[Element] => Unit): Self = StObject.set(x, "scrollToElement", js.Any.fromFunction1(value))
      
      inline def setScrollTop(value: () => Double): Self = StObject.set(x, "scrollTop", js.Any.fromFunction0(value))
      
      inline def setScrollWidth(value: () => Double): Self = StObject.set(x, "scrollWidth", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait SelectAllValueChangedEvent[TKey]
    extends StObject
       with EventInfo[dxTreeView[TKey]] {
    
    val value: js.UndefOr[Boolean] = js.undefined
  }
  object SelectAllValueChangedEvent {
    
    inline def apply[TKey](component: dxTreeView[TKey], element: DxElement_[HTMLElement]): SelectAllValueChangedEvent[TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectAllValueChangedEvent[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectAllValueChangedEvent[?], TKey] (val x: Self & SelectAllValueChangedEvent[TKey]) extends AnyVal {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SelectionChangedEvent[TKey] = EventInfo[dxTreeView[TKey]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.normal
    - typings.devextreme.devextremeStrings.selectAll
  */
  trait TreeViewCheckBoxMode extends StObject
  object TreeViewCheckBoxMode {
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def normal: typings.devextreme.devextremeStrings.normal = "normal".asInstanceOf[typings.devextreme.devextremeStrings.normal]
    
    inline def selectAll: typings.devextreme.devextremeStrings.selectAll = "selectAll".asInstanceOf[typings.devextreme.devextremeStrings.selectAll]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.dblclick_
    - typings.devextreme.devextremeStrings.click
  */
  trait TreeViewExpandEvent extends StObject
  object TreeViewExpandEvent {
    
    inline def click: typings.devextreme.devextremeStrings.click = "click".asInstanceOf[typings.devextreme.devextremeStrings.click]
    
    inline def dblclick: dblclick_ = "dblclick".asInstanceOf[dblclick_]
  }
}
