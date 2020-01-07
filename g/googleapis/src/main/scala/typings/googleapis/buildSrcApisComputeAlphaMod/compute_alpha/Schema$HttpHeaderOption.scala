package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification determining how headers are added to requests or responses.
  */
@js.native
trait Schema$HttpHeaderOption extends js.Object {
  /**
    * The name of the header.
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * The value of the header to add.
    */
  var headerValue: js.UndefOr[String] = js.native
  /**
    * If false, headerValue is appended to any values that already exist for
    * the header. If true, headerValue is set for the header, discarding any
    * values that were set for that header. The default value is false.
    */
  var replace: js.UndefOr[Boolean] = js.native
}

object Schema$HttpHeaderOption {
  @scala.inline
  def apply(headerName: String = null, headerValue: String = null, replace: js.UndefOr[Boolean] = js.undefined): Schema$HttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpHeaderOption]
  }
}

