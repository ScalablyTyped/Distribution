package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptEncodingString extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.undefined
}

object Anon_AcceptEncodingString {
  @scala.inline
  def apply(acceptEncoding: String = null): Anon_AcceptEncodingString = {
    val __obj = js.Dynamic.literal()
    if (acceptEncoding != null) __obj.updateDynamic("acceptEncoding")(acceptEncoding)
    __obj.asInstanceOf[Anon_AcceptEncodingString]
  }
}

