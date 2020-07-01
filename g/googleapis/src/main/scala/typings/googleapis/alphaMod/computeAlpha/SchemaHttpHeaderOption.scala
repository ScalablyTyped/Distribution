package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification determining how headers are added to requests or responses.
  */
@js.native
trait SchemaHttpHeaderOption extends js.Object {
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

object SchemaHttpHeaderOption {
  @scala.inline
  def apply(headerName: String = null, headerValue: String = null, replace: js.UndefOr[Boolean] = js.undefined): SchemaHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpHeaderOption]
  }
}

