package typings.duoWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedSig extends js.Object {
  var appSig: String = js.native
  var duoSig: String = js.native
  var sigRequest: String = js.native
}

object ParsedSig {
  @scala.inline
  def apply(appSig: String, duoSig: String, sigRequest: String): ParsedSig = {
    val __obj = js.Dynamic.literal(appSig = appSig.asInstanceOf[js.Any], duoSig = duoSig.asInstanceOf[js.Any], sigRequest = sigRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedSig]
  }
  @scala.inline
  implicit class ParsedSigOps[Self <: ParsedSig] (val x: Self) extends AnyVal {
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
    def setAppSig(value: String): Self = this.set("appSig", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuoSig(value: String): Self = this.set("duoSig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigRequest(value: String): Self = this.set("sigRequest", value.asInstanceOf[js.Any])
  }
  
}

