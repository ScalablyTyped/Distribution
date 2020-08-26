package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfoOptions extends js.Object {
  var httpCache: Boolean = js.native
}

object AccountInfoOptions {
  @scala.inline
  def apply(httpCache: Boolean): AccountInfoOptions = {
    val __obj = js.Dynamic.literal(httpCache = httpCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoOptions]
  }
  @scala.inline
  implicit class AccountInfoOptionsOps[Self <: AccountInfoOptions] (val x: Self) extends AnyVal {
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
    def setHttpCache(value: Boolean): Self = this.set("httpCache", value.asInstanceOf[js.Any])
  }
  
}

