package typings.ethLightwallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultOptions extends js.Object {
  var hdPathString: String = js.native
  var password: String = js.native
  var salt: js.UndefOr[String] = js.native
  var seedPhrase: String = js.native
}

object VaultOptions {
  @scala.inline
  def apply(hdPathString: String, password: String, seedPhrase: String): VaultOptions = {
    val __obj = js.Dynamic.literal(hdPathString = hdPathString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], seedPhrase = seedPhrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultOptions]
  }
  @scala.inline
  implicit class VaultOptionsOps[Self <: VaultOptions] (val x: Self) extends AnyVal {
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
    def setHdPathString(value: String): Self = this.set("hdPathString", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeedPhrase(value: String): Self = this.set("seedPhrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

