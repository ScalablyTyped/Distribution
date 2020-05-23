package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  /** Maximum number of results of this type. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** The feature type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Feature {
  @scala.inline
  def apply(maxResults: js.UndefOr[Double] = js.undefined, `type`: String = null): Feature = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

