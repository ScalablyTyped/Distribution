package typings
package gapiDotClientDotDeploymentmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** [Output Only] The error type identifier for this error. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Indicates the field in the request that caused the error. This property is optional. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] An optional, human-readable error message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String = null, location: java.lang.String = null, message: java.lang.String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (location != null) __obj.updateDynamic("location")(location)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_Code]
  }
}

