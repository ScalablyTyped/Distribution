package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.selected
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_ComboBoxMenu.html
  *
  * Focus-less menu for internal use in dojox/mobile/ComboBox.
  * Abstract methods that must be defined externally:
  *
  * onChange: item was explicitly chosen (mousedown somewhere on the menu and mouseup somewhere on the menu);
  * onPage: next(1) or previous(-1) button pressed.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._ListBase because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form._ComboBoxMenuMixin because Inheritance from two classes. Inlined buildRendering, clearResultList, createOptions, getHighlightedOption, highlightFirstOption, highlightLastOption, postMixInProperties, onChange, onClick, onPage
- typings.dojo.dojox.mobile._ListTouchMixin because Inheritance from two classes. Inlined selected, postCreate, selectFirstNode, selectLastNode, selectNextNode, selectPreviousNode */ @JSGlobal("dojox.mobile._ComboBoxMenu")
@js.native
class _ComboBoxMenu () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * currently selected node
    *
    */
  var selected: HTMLElement = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__ComboBoxMenu: String = js.native
  /**
    * Clears the entries in the drop down list, but of course keeps the previous and next buttons.
    *
    */
  /**
    * Clears the entries in the drop down list, but of course keeps the previous and next buttons.
    * 
    */
  def clearResultList(): Unit = js.native
  /**
    * Fills in the items in the drop down list
    *
    * @param results Array of items
    * @param options The options to the query function of the store
    * @param labelFunc Function to produce a label in the drop down list from a dojo.data item
    */
  /**
    * Fills in the items in the drop down list
    * 
    * @param results Array of items             
    * @param options The options to the query function of the store             
    * @param labelFunc Function to produce a label in the drop down list from a dojo.data item             
    */
  def createOptions(results: js.Any, options: js.Any, labelFunc: js.Any): Unit = js.native
  /**
    *
    */
  /**
    * 
    */
  def getHighlightedOption(): js.Any = js.native
  @JSName("get")
  def get_selected(property: selected): HTMLElement = js.native
  /**
    * Highlight the first real item in the list (not Previous Choices).
    *
    */
  /**
    * Highlight the first real item in the list (not Previous Choices).
    * 
    */
  def highlightFirstOption(): Unit = js.native
  /**
    * Highlight the last real item in the list (not More Choices).
    *
    */
  /**
    * Highlight the last real item in the list (not More Choices).
    * 
    */
  def highlightLastOption(): Unit = js.native
  /**
    * Notifies ComboBox/FilteringSelect that user selected an option.
    *
    * @param direction
    */
  /**
    * Notifies ComboBox/FilteringSelect that user selected an option.
    * 
    * @param direction             
    */
  def onChange(direction: Double): Unit = js.native
  /**
    *
    * @param node
    */
  /**
    * 
    * @param node             
    */
  def onClick(node: HTMLElement): Unit = js.native
  /**
    * Called when the menu closes.
    *
    */
  def onClose(): Unit = js.native
  /**
    * Remove selected CSS.
    *
    * @param node
    */
  def onDeselect(node: HTMLElement): Unit = js.native
  /**
    * Called when the menu opens.
    *
    */
  def onOpen(): Unit = js.native
  /**
    * Notifies ComboBox/FilteringSelect that user clicked to advance to next/previous page.
    *
    * @param direction
    */
  /**
    * Notifies ComboBox/FilteringSelect that user clicked to advance to next/previous page.
    * 
    * @param direction             
    */
  def onPage(direction: Double): Unit = js.native
  /**
    * Add selected CSS.
    *
    * @param node
    */
  def onSelect(node: HTMLElement): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Select the first displayed item in the list.
    *
    */
  def selectFirstNode(): Unit = js.native
  /**
    * Select the last displayed item in the list
    *
    */
  def selectLastNode(): Unit = js.native
  /**
    * Select the item just below the current selection.
    * If nothing selected, select first node.
    *
    */
  def selectNextNode(): Unit = js.native
  /**
    * Select the item just above the current selection.
    * If nothing selected, select last node (if
    * you select Previous and try to keep scrolling up the list).
    *
    */
  def selectPreviousNode(): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_selected(
    property: selected,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

