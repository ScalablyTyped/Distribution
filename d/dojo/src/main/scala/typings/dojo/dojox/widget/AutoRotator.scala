package typings.dojo.dojox.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/AutoRotator.html
  *
  * A rotator that automatically transitions between child nodes.
  * Adds automatic rotating to the dojox.widget.Rotator.  The
  * AutoRotator has parameters that control how user input can
  * affect the rotator including a suspend when hovering over the
  * rotator and pausing when the user manually advances to another
  * pane.
  *
  */
@JSGlobal("dojox.widget.AutoRotator")
@js.native
class AutoRotator () extends Rotator_ {
  /**
    * Starts the timer to transition children upon creation.
    *
    */
  var autoStart: Boolean = js.native
  /**
    * Number of cycles before pausing.
    *
    */
  var cycles: Double = js.native
  /**
    * The time in milliseconds before transitioning to the next pane.  The
    * default value is 4000 (4 seconds).
    *
    */
  var duration: Double = js.native
  /**
    * Pause the rotator when the pane is changed or a controller's next or
    * previous buttons are clicked.
    *
    */
  var pauseOnManualChange: Boolean = js.native
  /**
    * Determines if the panes should cycle randomly.
    *
    */
  var random: Boolean = js.native
  /**
    * Causes the rotator to rotate in reverse order.
    *
    */
  var reverse: Boolean = js.native
  /**
    * Pause the rotator when the mouse hovers over it.
    *
    */
  var suspendOnHover: Boolean = js.native
  def onManualChange(action: String): Unit = js.native
  /**
    * Sets the state to "not playing" and clears the cycle timer.
    *
    */
  def pause(): Unit = js.native
  /**
    * Sets the state to "playing" and schedules the next cycle to run.
    *
    * @param skipCycleDecrement               Optional
    * @param skipDuration               Optional
    */
  def play(skipCycleDecrement: Boolean, skipDuration: Boolean): Unit = js.native
}

