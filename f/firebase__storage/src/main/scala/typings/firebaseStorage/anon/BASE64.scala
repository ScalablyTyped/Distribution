package typings.firebaseStorage.anon

import typings.firebaseStorageTypes.mod.StringFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BASE64 extends js.Object {
  var BASE64: StringFormat = js.native
  var BASE64URL: StringFormat = js.native
  var DATA_URL: StringFormat = js.native
  var RAW: StringFormat = js.native
}

object BASE64 {
  @scala.inline
  def apply(BASE64: StringFormat, BASE64URL: StringFormat, DATA_URL: StringFormat, RAW: StringFormat): BASE64 = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DATA_URL = DATA_URL.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BASE64]
  }
  @scala.inline
  implicit class BASE64Ops[Self <: BASE64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBASE64(value: StringFormat): Self = this.set("BASE64", value.asInstanceOf[js.Any])
    @scala.inline
    def setBASE64URL(value: StringFormat): Self = this.set("BASE64URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDATA_URL(value: StringFormat): Self = this.set("DATA_URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRAW(value: StringFormat): Self = this.set("RAW", value.asInstanceOf[js.Any])
  }
  
}

