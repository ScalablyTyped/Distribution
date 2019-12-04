package typings.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Fade.html
  *
  *
  */
trait Fade extends js.Object {
  /**
    * Returns a dojo.Animation that cross fades two rotator panes.
    *
    * @param args
    */
  def crossFade(args: js.Object): js.Any
  /**
    * Returns a dojo.Animation that fades out the current pane, then fades in
    * the next pane.
    *
    * @param args
    */
  def fade(args: js.Object): js.Any
}

object Fade {
  @scala.inline
  def apply(crossFade: js.Object => js.Any, fade: js.Object => js.Any): Fade = {
    val __obj = js.Dynamic.literal(crossFade = js.Any.fromFunction1(crossFade), fade = js.Any.fromFunction1(fade))
  
    __obj.asInstanceOf[Fade]
  }
}

