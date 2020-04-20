package typings.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Pan.html
  *
  *
  */
trait Pan extends js.Object {
  /**
    * Returns a dojo.Animation that either pans left or right to the next pane.
    * The actual direction depends on the order of the panes.
    *
    * If panning forward from index 1 to 3, it will perform a pan left. If panning
    * backwards from 5 to 1, then it will perform a pan right.
    *
    * If the parameter "continuous" is set to true, it will return an animation
    * chain of several pan animations of each intermediate pane panning. For
    * example, if you pan forward from 1 to 3, it will return an animation panning
    * left from 1 to 2 and then 2 to 3.
    *
    * If an easing is specified, it will be applied to each pan transition.  For
    * example, if you are panning from pane 1 to pane 5 and you set the easing to
    * "dojo.fx.easing.elasticInOut", then it will "wobble" 5 times, once for each
    * pan transition.
    *
    * If the parameter "wrap" is set to true, it will pan to the next pane using
    * the shortest distance in the array of panes. For example, if there are 6
    * panes, then panning from 5 to 1 will pan forward (left) from pane 5 to 6 and
    * 6 to 1.  If the distance is the same either going forward or backwards, then
    * it will always pan forward (left).
    *
    * A continuous pan will use the target pane's duration to pan all intermediate
    * panes.  To use the target's pane duration for each intermediate pane, then
    * set the "quick" parameter to "false".
    *
    * @param args
    */
  def pan(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the top.
    *
    * @param args
    */
  def panDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the left.
    *
    * @param args
    */
  def panLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the right.
    *
    * @param args
    */
  def panRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the bottom.
    *
    * @param args
    */
  def panUp(args: js.Object): js.Any
}

object Pan {
  @scala.inline
  def apply(
    pan: js.Object => js.Any,
    panDown: js.Object => js.Any,
    panLeft: js.Object => js.Any,
    panRight: js.Object => js.Any,
    panUp: js.Object => js.Any
  ): Pan = {
    val __obj = js.Dynamic.literal(pan = js.Any.fromFunction1(pan), panDown = js.Any.fromFunction1(panDown), panLeft = js.Any.fromFunction1(panLeft), panRight = js.Any.fromFunction1(panRight), panUp = js.Any.fromFunction1(panUp))
    __obj.asInstanceOf[Pan]
  }
}

