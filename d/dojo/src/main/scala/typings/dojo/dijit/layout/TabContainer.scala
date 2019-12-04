package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.controllerWidget
import typings.dojo.dojoStrings.useMenu
import typings.dojo.dojoStrings.useSlider
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabContainer.html
  *
  * A Container with tabs to select each child (only one of which is displayed at a time).
  * A TabContainer is a container that has multiple panes, but shows only
  * one pane at a time.  There are a set of tabs corresponding to each pane,
  * where each tab has the name (aka title) of the pane, and optionally a close button.
  * 
  * See StackContainer.ChildWidgetProperties for details on the properties that can be set on
  * children of a TabContainer.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.TabContainer")
@js.native
class TabContainer () extends _TabContainerBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * An optional parameter to override the widget used to display the tab labels
    * 
    */
  var controllerWidget: js.Object = js.native
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
  @JSName("get")
  def get_controllerWidget(property: controllerWidget): js.Object = js.native
  @JSName("get")
  def get_useMenu(property: useMenu): Boolean = js.native
  @JSName("get")
  def get_useSlider(property: useSlider): Boolean = js.native
  @JSName("set")
  def set_controllerWidget(property: controllerWidget, value: js.Object): Unit = js.native
  @JSName("set")
  def set_useMenu(property: useMenu, value: Boolean): Unit = js.native
  @JSName("set")
  def set_useSlider(property: useSlider, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_controllerWidget(
    property: controllerWidget,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useMenu(
    property: useMenu,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useSlider(
    property: useSlider,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

