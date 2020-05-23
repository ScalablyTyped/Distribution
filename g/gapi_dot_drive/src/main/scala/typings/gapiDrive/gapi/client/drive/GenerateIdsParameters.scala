package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateIdsParameters extends js.Object {
  var maxResults: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[String] = js.undefined
}

object GenerateIdsParameters {
  @scala.inline
  def apply(maxResults: js.UndefOr[Double] = js.undefined, space: String = null): GenerateIdsParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateIdsParameters]
  }
}

