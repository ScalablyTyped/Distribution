package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.form.ToggleButton
import typings.dojo.dojoStrings.closeButton
import typings.dojo.dojoStrings.tabPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabController.html
  *
  * Set of tabs (the things with titles and a close button, that you click to show a tab panel).
  * Used internally by dijit/layout/TabContainer.
  * Lets the user select the currently shown pane in a TabContainer or StackContainer.
  * TabController also monitors the TabContainer, and whenever a pane is
  * added or deleted updates itself accordingly.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.TabController")
@js.native
class TabController () extends StackController {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Defines where tabs go relative to the content.
    * "top", "bottom", "left-h", "right-h"
    * 
    */
  var tabPosition: String = js.native
  /**
    * 
    */
  def TabButton(): Unit = js.native
  @JSName("get")
  def get_tabPosition(property: tabPosition): String = js.native
  @JSName("set")
  def set_tabPosition(property: tabPosition, value: String): Unit = js.native
  @JSName("watch")
  def watch_tabPosition(
    property: tabPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

@JSGlobal("dijit.layout.TabController")
@js.native
object TabController extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabController.TabButton.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  @js.native
  class TabButton () extends ToggleButton {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * When true, display close button for this tab
      * 
      */
    var closeButton: Boolean = js.native
    @JSName("get")
    def get_closeButton(property: closeButton): Boolean = js.native
    @JSName("set")
    def set_closeButton(property: closeButton, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_closeButton(
      property: closeButton,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
}

