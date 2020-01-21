package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.closeButton
import typings.dojo.dojoStrings.closeButtonClass
import typings.dojo.dojoStrings.left
import typings.dojo.dojoStrings.modal
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.top
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/SimpleDialog.html
  *
  * A dialog box for mobile.
  * SimpleDialog is a dialog box for mobile.
  * When a SimpleDialog is created, it is initially hidden
  * (display="none"). To show the dialog box, you need to
  * get a reference to the widget and to call its show() method.
  *
  * The contents can be arbitrary HTML, text, or widgets. Note,
  * however, that the widget is initially hidden. You need to be
  * careful when you place in a SimpleDialog elements that cannot
  * be initialized in hidden state.
  *
  * This widget has much less functionalities than dijit/Dialog,
  * but it has the advantage of a much smaller code size.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.SimpleDialog")
@js.native
class SimpleDialog () extends Pane {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, a button to close the dialog box is displayed at the
    * top-right corner.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var closeButton: Boolean = js.native
  /**
    * A class name of a DOM button to be used as a close button.
    *
    */
  var closeButtonClass: String = js.native
  /**
    * The left edge position of the widget. If "auto", the widget is
    * placed at the center of the screen. Otherwise, the value
    * (ex. "20px") is used as the left style of widget's domNode.
    *
    */
  var left: String = js.native
  /**
    * If true, a translucent cover is added over the entire page to
    * prevent the user from interacting with elements on the page.
    *
    */
  var modal: Boolean = js.native
  /**
    * Tabindex setting for the item so users can hit the tab key to
    * focus on it.
    *
    */
  var tabIndex: String = js.native
  /**
    * The top edge position of the widget. If "auto", the widget is
    * placed at the middle of the screen. Otherwise, the value
    * (ex. "20px") is used as the top style of widget's domNode.
    *
    */
  var top: String = js.native
  /**
    * Adds the transparent DIV cover.
    *
    */
  def addCover(): Unit = js.native
  @JSName("get")
  def get_closeButton(property: closeButton): Boolean = js.native
  @JSName("get")
  def get_closeButtonClass(property: closeButtonClass): String = js.native
  @JSName("get")
  def get_left(property: left): String = js.native
  @JSName("get")
  def get_modal(property: modal): Boolean = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_top(property: top): String = js.native
  /**
    * Hides the dialog.
    *
    */
  def hide(): Unit = js.native
  /**
    * User-defined function to handle clicks.
    *
    * @param e
    */
  def onCloseButtonClick(e: Event_): Unit = js.native
  /**
    * Refreshes the layout of the dialog.
    *
    */
  def refresh(): Unit = js.native
  /**
    * Removes the transparent DIV cover.
    *
    */
  def removeCover(): Unit = js.native
  @JSName("set")
  def set_closeButton(property: closeButton, value: Boolean): Unit = js.native
  @JSName("set")
  def set_closeButtonClass(property: closeButtonClass, value: String): Unit = js.native
  @JSName("set")
  def set_left(property: left, value: String): Unit = js.native
  @JSName("set")
  def set_modal(property: modal, value: Boolean): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_top(property: top, value: String): Unit = js.native
  /**
    * Shows the dialog.
    *
    */
  def show(): Unit = js.native
  @JSName("watch")
  def watch_closeButton(
    property: closeButton,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_closeButtonClass(
    property: closeButtonClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_left(
    property: left,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_modal(
    property: modal,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_top(
    property: top,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

