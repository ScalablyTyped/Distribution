package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptEncodingString extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
}

object AnonAcceptEncodingString {
  @scala.inline
  def apply(acceptEncoding: String = null): AnonAcceptEncodingString = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptEncodingString]
  }
}

