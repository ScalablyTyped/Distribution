package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(urn = urn)
    if (!js.isUndefined(compressedUrn)) __obj.updateDynamic("compressedUrn")(compressedUrn)
    if (rootFilename != null) __obj.updateDynamic("rootFilename")(rootFilename)
    __obj.asInstanceOf[JobPayloadInput]
  }
}

