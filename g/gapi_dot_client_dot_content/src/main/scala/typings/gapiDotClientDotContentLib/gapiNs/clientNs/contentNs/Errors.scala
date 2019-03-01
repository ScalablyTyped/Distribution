package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  /** The HTTP status of the first error in errors. */
  var code: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors. */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
  /** The message of the first error in errors. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Errors {
  @scala.inline
  def apply(
    code: scala.Int | scala.Double = null,
    errors: js.Array[Error] = null,
    message: java.lang.String = null
  ): Errors = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Errors]
  }
}

