package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIfGenerationMatch extends js.Object {
  var ifGenerationMatch: js.UndefOr[String] = js.native
}

object AnonIfGenerationMatch {
  @scala.inline
  def apply(ifGenerationMatch: String = null): AnonIfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIfGenerationMatch]
  }
}

