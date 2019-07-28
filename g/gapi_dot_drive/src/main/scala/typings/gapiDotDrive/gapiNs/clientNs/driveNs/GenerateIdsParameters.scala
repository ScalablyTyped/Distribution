package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateIdsParameters extends js.Object {
  var maxResults: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[String] = js.undefined
}

object GenerateIdsParameters {
  @scala.inline
  def apply(maxResults: Int | Double = null, space: String = null): GenerateIdsParameters = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[GenerateIdsParameters]
  }
}

