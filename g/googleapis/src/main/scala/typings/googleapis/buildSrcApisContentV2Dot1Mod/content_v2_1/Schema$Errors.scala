package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of errors returned by a failed batch entry.
  */
@js.native
trait Schema$Errors extends js.Object {
  /**
    * The HTTP status of the first error in errors.
    */
  var code: js.UndefOr[Double] = js.native
  /**
    * A list of errors.
    */
  var errors: js.UndefOr[js.Array[Schema$Error]] = js.native
  /**
    * The message of the first error in errors.
    */
  var message: js.UndefOr[String] = js.native
}

object Schema$Errors {
  @scala.inline
  def apply(code: Int | Double = null, errors: js.Array[Schema$Error] = null, message: String = null): Schema$Errors = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Errors]
  }
}

