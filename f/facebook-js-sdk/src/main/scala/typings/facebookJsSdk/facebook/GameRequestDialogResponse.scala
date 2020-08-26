package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameRequestDialogResponse extends DialogResponse {
  var request: String = js.native
  var to: js.Array[String] = js.native
}

object GameRequestDialogResponse {
  @scala.inline
  def apply(request: String, to: js.Array[String]): GameRequestDialogResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
  @scala.inline
  implicit class GameRequestDialogResponseOps[Self <: GameRequestDialogResponse] (val x: Self) extends AnyVal {
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
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

