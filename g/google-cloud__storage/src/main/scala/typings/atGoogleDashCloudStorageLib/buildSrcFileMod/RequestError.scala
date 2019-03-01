package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestError
  extends nodeLib.Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[nodeLib.Error]] = js.undefined
}

object RequestError {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    errors: js.Array[nodeLib.Error] = null,
    stack: java.lang.String = null
  ): RequestError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestError]
  }
}

