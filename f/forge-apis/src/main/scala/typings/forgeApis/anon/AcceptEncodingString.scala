package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptEncodingString extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
}

object AcceptEncodingString {
  @scala.inline
  def apply(acceptEncoding: String = null): AcceptEncodingString = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptEncodingString]
  }
}

