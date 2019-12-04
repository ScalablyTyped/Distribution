package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.doLayout
import typings.dojo.dojoStrings.persist
import typings.dojo.dojoStrings.selectedChildWidget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/StackContainer.html
  *
  * A container that has multiple children, but shows only
  * one child at a time
  * A container for widgets (ContentPanes, for example) That displays
  * only one Widget at a time.
  * 
  * Publishes topics [widgetId]-addChild, [widgetId]-removeChild, and [widgetId]-selectChild
  * 
  * Can be base class for container, Wizard, Show, etc.
  * 
  * See StackContainer.ChildWidgetProperties for details on the properties that can be set on
  * children of a StackContainer.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.StackContainer")
@js.native
class StackContainer_ () extends _LayoutWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * These properties can be specified for the children of a StackContainer.
    * 
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * If true, change the size of my currently displayed child to match my size
    * 
    */
  var doLayout: Boolean = js.native
  /**
    * Remembers the selected child across sessions
    * 
    */
  var persist: Boolean = js.native
  /**
    * References the currently selected child widget, if any.
    * Adjust selected child with selectChild() method.
    * 
    */
  var selectedChildWidget: js.Object = js.native
  /**
    * Go back to previous page.
    * 
    */
  def back(): js.Any = js.native
  /**
    * Advance to next page.
    * 
    */
  def forward(): js.Any = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_doLayout(property: doLayout): Boolean = js.native
  @JSName("get")
  def get_persist(property: persist): Boolean = js.native
  @JSName("get")
  def get_selectedChildWidget(property: selectedChildWidget): js.Object = js.native
  /**
    * 
    */
  def resize(): Unit = js.native
  /**
    * Show the given widget (which must be one of my children)
    * 
    * @param page Reference to child widget or id of child widget             
    * @param animate             
    */
  def selectChild(page: String, animate: Boolean): js.Any = js.native
  /**
    * Show the given widget (which must be one of my children)
    * 
    * @param page Reference to child widget or id of child widget             
    * @param animate             
    */
  def selectChild(page: _WidgetBase, animate: Boolean): js.Any = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_doLayout(property: doLayout, value: Boolean): Unit = js.native
  @JSName("set")
  def set_persist(property: persist, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectedChildWidget(property: selectedChildWidget, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_doLayout(
    property: doLayout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_persist(
    property: persist,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedChildWidget(
    property: selectedChildWidget,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

