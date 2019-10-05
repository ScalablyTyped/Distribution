package typings.dojo.dojox.mobile

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ScreenSizeAware.html
  *
  * A module to make a screen size aware application.
  * This module helps for creating applications that transform their
  * UI layout according to the screen size. It assumes that the
  * application consists of two horizontally split panes, and the
  * left pane has a list widget. If you require this module in such an
  * application, in a tablet-sized screen, the application shows a horizontally
  * split view whose left pane is a list widget.
  * In a phone-sized screen, the application shows a list widget that fills the screen.
  *
  * @param options       OptionalContains properties to be set.
  */
@JSGlobal("dojox.mobile.ScreenSizeAware")
@js.native
class ScreenSizeAware () extends js.Object {
  def this(options: js.Object) = this()
  /**
    * The id of the list widget in the left view.
    *
    */
  var leftListId: String = js.native
  /**
    * The id of the left pane.
    *
    */
  var leftPaneId: String = js.native
  /**
    * The id of the left View.
    *
    */
  var leftViewId: String = js.native
  /**
    * The id of the right pane.
    *
    */
  var rightPaneId: String = js.native
  /**
    * The id of the FixedSplitter.
    *
    */
  var splitterId: String = js.native
  /**
    * Returns the id of the target view of the given item.
    *
    * @param item
    */
  def getDestinationId(item: js.Any): js.Any = js.native
  /**
    *
    */
  def getInstance(): Unit = js.native
  /**
    * Returns the view currently shown.
    *
    */
  def getShowingView(): js.Any = js.native
  /**
    * Initializes the application.
    *
    */
  def init(): Unit = js.native
  /**
    * Returns true if the current mode set by transformUI(mode) is "phone".
    *
    */
  def isPhone(): Boolean = js.native
  /**
    * Function called when an item in the left-side list is selected.
    *
    * @param e
    */
  def leftItemSelected(e: Event): Unit = js.native
  /**
    * Places the list widget. If the current mode is "phone", it
    * places the list widget in the right pane, otherwise in the left pane.
    *
    */
  def moveList(): Unit = js.native
  /**
    * Shows the left-side view.
    *
    */
  def showLeftView(): Unit = js.native
  /**
    * Shows the right-side view.
    *
    */
  def showRightView(): Unit = js.native
  /**
    * Applies an UI mode.
    *
    * @param mode If this argument is "phone", sets the UI in phone mode, otherwise in tablet mode.
    */
  def transformUI(mode: String): Unit = js.native
  /**
    * Updates the back button.
    *
    */
  def updateBackButton(): Unit = js.native
  /**
    * Updates the selected item.
    *
    */
  def updateSelectedItem(): Unit = js.native
  /**
    * Updates the stateful property of the list widget in the left-side pane.
    *
    */
  def updateStateful(): Unit = js.native
  /**
    * Updates the transition property of the items in the left-side widget.
    *
    */
  def updateTransition(): Unit = js.native
}

