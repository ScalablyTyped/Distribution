package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdPosition extends js.Object {
  var adPosition: js.UndefOr[String] = js.native
  var frequency: js.UndefOr[Double] = js.native
  var minimumWordCount: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonAdPosition {
  @scala.inline
  def apply(
    adPosition: String = null,
    frequency: Int | Double = null,
    minimumWordCount: Int | Double = null,
    `type`: String = null
  ): AnonAdPosition = {
    val __obj = js.Dynamic.literal()
    if (adPosition != null) __obj.updateDynamic("adPosition")(adPosition.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (minimumWordCount != null) __obj.updateDynamic("minimumWordCount")(minimumWordCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdPosition]
  }
}

