package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevel extends js.Object {
  /** The style of a bullet at this level of nesting. */
  var bulletStyle: js.UndefOr[TextStyle] = js.undefined
}

object NestingLevel {
  @scala.inline
  def apply(bulletStyle: TextStyle = null): NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle)
    __obj.asInstanceOf[NestingLevel]
  }
}

