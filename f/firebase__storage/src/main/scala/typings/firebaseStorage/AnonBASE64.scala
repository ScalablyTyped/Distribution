package typings.firebaseStorage

import typings.firebaseStorageTypes.mod.StringFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBASE64 extends js.Object {
  var BASE64: StringFormat
  var BASE64URL: StringFormat
  var DATA_URL: StringFormat
  var RAW: StringFormat
}

object AnonBASE64 {
  @scala.inline
  def apply(BASE64: StringFormat, BASE64URL: StringFormat, DATA_URL: StringFormat, RAW: StringFormat): AnonBASE64 = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DATA_URL = DATA_URL.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBASE64]
  }
}

