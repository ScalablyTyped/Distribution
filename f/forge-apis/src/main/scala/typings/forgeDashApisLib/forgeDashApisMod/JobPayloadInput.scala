package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobPayloadInput extends js.Object {
  var compressedUrn: js.UndefOr[scala.Boolean] = js.undefined
  var rootFilename: js.UndefOr[java.lang.String] = js.undefined
  var urn: java.lang.String
}

object JobPayloadInput {
  @scala.inline
  def apply(
    urn: java.lang.String,
    compressedUrn: js.UndefOr[scala.Boolean] = js.undefined,
    rootFilename: java.lang.String = null
  ): JobPayloadInput = {
    val __obj = js.Dynamic.literal(urn = urn)
    if (!js.isUndefined(compressedUrn)) __obj.updateDynamic("compressedUrn")(compressedUrn)
    if (rootFilename != null) __obj.updateDynamic("rootFilename")(rootFilename)
    __obj.asInstanceOf[JobPayloadInput]
  }
}

