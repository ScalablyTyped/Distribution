package typings.elliptic.mod.eddsa

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairOptions extends js.Object {
  var pub: Buffer | Point = js.native
  var secret: Buffer = js.native
}

object KeyPairOptions {
  @scala.inline
  def apply(pub: Buffer | Point, secret: Buffer): KeyPairOptions = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairOptions]
  }
  @scala.inline
  implicit class KeyPairOptionsOps[Self <: KeyPairOptions] (val x: Self) extends AnyVal {
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
    def setPub(value: Buffer | Point): Self = this.set("pub", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: Buffer): Self = this.set("secret", value.asInstanceOf[js.Any])
  }
  
}

