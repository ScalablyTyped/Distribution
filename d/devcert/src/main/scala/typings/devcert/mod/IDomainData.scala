package typings.devcert.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomainData extends js.Object {
  var cert: Buffer = js.native
  var key: Buffer = js.native
}

object IDomainData {
  @scala.inline
  def apply(cert: Buffer, key: Buffer): IDomainData = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDomainData]
  }
  @scala.inline
  implicit class IDomainDataOps[Self <: IDomainData] (val x: Self) extends AnyVal {
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
    def setCert(value: Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

