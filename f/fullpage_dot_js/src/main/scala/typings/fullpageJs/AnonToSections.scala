package typings.fullpageJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToSections extends js.Object {
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns horizontal slides into vertical sections.
    */
  def toSections(): Unit
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns back the original slides (now converted into
    * vertical sections) into horizontal slides again.
    */
  def toSlides(): Unit
}

object AnonToSections {
  @scala.inline
  def apply(toSections: () => Unit, toSlides: () => Unit): AnonToSections = {
    val __obj = js.Dynamic.literal(toSections = js.Any.fromFunction0(toSections), toSlides = js.Any.fromFunction0(toSlides))
    __obj.asInstanceOf[AnonToSections]
  }
}

