package typings.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/PanFade.html
  *
  *
  */
trait PanFade extends js.Object {
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
  def panFade(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the top.
    *
    * @param args
    */
  def panFadeDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the left.
    *
    * @param args
    */
  def panFadeLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the right.
    *
    * @param args
    */
  def panFadeRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that pans in the next rotator pane from the bottom.
    *
    * @param args
    */
  def panFadeUp(args: js.Object): js.Any
}

object PanFade {
  @scala.inline
  def apply(
    panFade: js.Object => js.Any,
    panFadeDown: js.Object => js.Any,
    panFadeLeft: js.Object => js.Any,
    panFadeRight: js.Object => js.Any,
    panFadeUp: js.Object => js.Any
  ): PanFade = {
    val __obj = js.Dynamic.literal(panFade = js.Any.fromFunction1(panFade), panFadeDown = js.Any.fromFunction1(panFadeDown), panFadeLeft = js.Any.fromFunction1(panFadeLeft), panFadeRight = js.Any.fromFunction1(panFadeRight), panFadeUp = js.Any.fromFunction1(panFadeUp))
  
    __obj.asInstanceOf[PanFade]
  }
}

