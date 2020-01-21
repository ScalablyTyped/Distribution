package typings.dojo.dijit.layout

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.tabStripClass
import typings.dojo.dojoStrings.useMenu
import typings.dojo.dojoStrings.useSlider
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/ScrollingTabController.html
  *
  * Set of tabs with left/right arrow keys and a menu to switch between tabs not
  * all fitting on a single row.
  * Works only for horizontal tabs (either above or below the content, not to the left
  * or right).
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup */ @JSGlobal("dijit.layout.ScrollingTabController")
@js.native
class ScrollingTabController () extends TabController {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    * 
    */
  var contextRequire: js.Function = js.native
  /**
    * The css class to apply to the tab strip, if it is visible.
    * 
    */
  var tabStripClass: String = js.native
  /**
    * True if a menu should be used to select tabs when they are too
    * wide to fit the TabContainer, false otherwise.
    * 
    */
  var useMenu: Boolean = js.native
  /**
    * True if a slider should be used to select tabs when they are too
    * wide to fit the TabContainer, false otherwise.
    * 
    */
  var useSlider: Boolean = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    * 
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Creates a dojo._Animation object that smoothly scrolls the tab list
    * either to a fixed horizontal pixel value, or to the selected tab.
    * If an number argument is passed to the function, that horizontal
    * pixel position is scrolled to.  Otherwise the currently selected
    * tab is scrolled to.
    * 
    * @param x               OptionalAn optional pixel value to scroll to, indicating distance from left.             
    */
  def createSmoothScroll(x: Double): js.Any = js.native
  /**
    * Scrolls the tab list to the left or right by 75% of the widget width.
    * 
    * @param direction If the direction is 1, the widget scrolls to the right, if it is -1,it scrolls to the left.             
    * @param node             
    */
  def doSlide(direction: Double, node: HTMLElement): Unit = js.native
  /**
    * Scrolls the menu to the left.
    * 
    * @param e The mouse click event.             
    */
  def doSlideLeft(e: Event_): Unit = js.native
  /**
    * Scrolls the menu to the right.
    * 
    * @param e The mouse click event.             
    */
  def doSlideRight(e: Event_): Unit = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_tabStripClass(property: tabStripClass): String = js.native
  @JSName("get")
  def get_useMenu(property: useMenu): Boolean = js.native
  @JSName("get")
  def get_useSlider(property: useSlider): Boolean = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * 
    * @param page             
    * @param insertIndex             
    */
  def onAddChild(page: js.Any, insertIndex: js.Any): Unit = js.native
  /**
    * 
    * @param page             
    * @param insertIndex             
    */
  def onRemoveChild(page: js.Any, insertIndex: js.Any): Unit = js.native
  /**
    * Smoothly scrolls to a tab when it is selected.
    * 
    * @param page             
    */
  def onSelectChild(page: WidgetBase): Unit = js.native
  /**
    * 
    */
  def onStartup(): Unit = js.native
  /**
    * Hides or displays the buttons used to scroll the tab list and launch the menu
    * that selects tabs.
    * 
    * @param dim             
    */
  def resize(dim: js.Any): js.Object = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_tabStripClass(property: tabStripClass, value: String): Unit = js.native
  @JSName("set")
  def set_useMenu(property: useMenu, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useSlider(property: useSlider, value: Boolean): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabStripClass(
    property: tabStripClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_useMenu(
    property: useMenu,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_useSlider(
    property: useSlider,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

