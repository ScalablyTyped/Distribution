package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error occurring in the feed, like &quot;invalid price&quot;.
  */
@js.native
trait Schema$DatafeedStatusError extends js.Object {
  /**
    * The code of the error, e.g., &quot;validation/invalid_value&quot;.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The number of occurrences of the error in the feed.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * A list of example occurrences of the error, grouped by product.
    */
  var examples: js.UndefOr[js.Array[Schema$DatafeedStatusExample]] = js.native
  /**
    * The error message, e.g., &quot;Invalid price&quot;.
    */
  var message: js.UndefOr[String] = js.native
}

object Schema$DatafeedStatusError {
  @scala.inline
  def apply(
    code: String = null,
    count: String = null,
    examples: js.Array[Schema$DatafeedStatusExample] = null,
    message: String = null
  ): Schema$DatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatafeedStatusError]
  }
}

