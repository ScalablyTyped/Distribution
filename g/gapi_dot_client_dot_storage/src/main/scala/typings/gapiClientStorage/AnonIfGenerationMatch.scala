package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIfGenerationMatch extends js.Object {
  /**
    * Only perform the composition if the generation of the source object that would be used matches this value. If this value and a generation are both
    * specified, they must be the same value or the call will fail.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
}

object AnonIfGenerationMatch {
  @scala.inline
  def apply(ifGenerationMatch: String = null): AnonIfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIfGenerationMatch]
  }
}

