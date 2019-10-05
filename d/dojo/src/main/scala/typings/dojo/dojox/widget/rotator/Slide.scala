package typings.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Slide.html
  *
  *
  */
trait Slide extends js.Object {
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the top.
    *
    * @param args
    */
  def slideDown(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the left.
    *
    * @param args
    */
  def slideLeft(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the right.
    *
    * @param args
    */
  def slideRight(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the bottom.
    *
    * @param args
    */
  def slideUp(args: js.Object): js.Any
}

object Slide {
  @scala.inline
  def apply(
    slideDown: js.Object => js.Any,
    slideLeft: js.Object => js.Any,
    slideRight: js.Object => js.Any,
    slideUp: js.Object => js.Any
  ): Slide = {
    val __obj = js.Dynamic.literal(slideDown = js.Any.fromFunction1(slideDown), slideLeft = js.Any.fromFunction1(slideLeft), slideRight = js.Any.fromFunction1(slideRight), slideUp = js.Any.fromFunction1(slideUp))
  
    __obj.asInstanceOf[Slide]
  }
}

