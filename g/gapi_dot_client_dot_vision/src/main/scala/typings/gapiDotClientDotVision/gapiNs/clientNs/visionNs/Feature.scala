package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

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
  def apply(maxResults: Int | Double = null, `type`: String = null): Feature = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Feature]
  }
}

