package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadInput extends js.Object {
  var compressedUrn: js.UndefOr[Boolean] = js.undefined
  var rootFilename: js.UndefOr[String] = js.undefined
  var urn: String
}

object JobPayloadInput {
  @scala.inline
  def apply(urn: String, compressedUrn: js.UndefOr[Boolean] = js.undefined, rootFilename: String = null): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn.asInstanceOf[js.Any])
    if (!js.isUndefined(compressedUrn)) __obj.updateDynamic("compressedUrn")(compressedUrn.get.asInstanceOf[js.Any])
    if (rootFilename != null) __obj.updateDynamic("rootFilename")(rootFilename.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadInput]
  }
}

