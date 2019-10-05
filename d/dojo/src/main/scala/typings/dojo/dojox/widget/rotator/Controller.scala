package typings.dojo.dojox.widget.rotator

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Controller.html
  *
  * A controller that manipulates a Rotator or AutoRotator.
  * Displays a series of controls that send actions to a Rotator or
  * AutoRotator.  The Controller supports the following controls:
  *
  * Next pane
  * Previous pane
  * Play/Pause toggler
  * Numbered tabs
  * Titled tabs
  * Information
  * You may specify any of these controls in any order.  You may also
  * have multiple Controllers tied to a single Rotator instance.
  *
  * The Controller's DOM node may also be styled for positioning or
  * other styled preferences.
  *
  * @param params
  * @param node
  */
@JSGlobal("dojox.widget.rotator.Controller")
@js.native
class Controller protected () extends js.Object {
  def this(params: js.Object, node: HTMLElement) = this()
  /**
    * A comma-separated list of commands. Valid commands are:
    *   prev          An icon button to go to the previous pane.
    *   next          An icon button to go to the next pane.
    *   play/pause    A play and pause toggle icon button.
    *   info          Displays the current and total panes. (ie "1 / 4")
    * Displays a number button for each pane. (ie "1 2 3 4")
    *   titles        Displays each pane's title as a tab. (ie "Home Services Contact Blog")
    *
    */
  var commands: String = js.native
  /**
    * An instance of a Rotator widget.
    *
    */
  var rotator: js.Object = js.native
  /**
    * Disconnect from the rotator.
    *
    */
  def destroy(): Unit = js.native
}

