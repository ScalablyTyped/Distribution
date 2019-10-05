package typings.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Wipe.html
  *
  *
  */
trait Wipe extends js.Object {
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the top.
    *
    * @param args
    */
  def wipeDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the left.
    *
    * @param args
    */
  def wipeLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the right.
    *
    * @param args
    */
  def wipeRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the bottom.
    *
    * @param args
    */
  def wipeUp(args: js.Object): js.Any
}

object Wipe {
  @scala.inline
  def apply(
    wipeDown: js.Object => js.Any,
    wipeLeft: js.Object => js.Any,
    wipeRight: js.Object => js.Any,
    wipeUp: js.Object => js.Any
  ): Wipe = {
    val __obj = js.Dynamic.literal(wipeDown = js.Any.fromFunction1(wipeDown), wipeLeft = js.Any.fromFunction1(wipeLeft), wipeRight = js.Any.fromFunction1(wipeRight), wipeUp = js.Any.fromFunction1(wipeUp))
  
    __obj.asInstanceOf[Wipe]
  }
}

