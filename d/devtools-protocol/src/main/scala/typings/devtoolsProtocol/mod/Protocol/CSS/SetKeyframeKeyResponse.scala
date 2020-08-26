package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetKeyframeKeyResponse extends js.Object {
  /**
    * The resulting key text after modification.
    */
  var keyText: Value = js.native
}

object SetKeyframeKeyResponse {
  @scala.inline
  def apply(keyText: Value): SetKeyframeKeyResponse = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeyframeKeyResponse]
  }
  @scala.inline
  implicit class SetKeyframeKeyResponseOps[Self <: SetKeyframeKeyResponse] (val x: Self) extends AnyVal {
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
    def setKeyText(value: Value): Self = this.set("keyText", value.asInstanceOf[js.Any])
  }
  
}

