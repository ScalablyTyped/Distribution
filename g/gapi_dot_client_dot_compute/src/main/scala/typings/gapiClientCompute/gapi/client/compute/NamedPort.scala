package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedPort extends js.Object {
  /** The name for this named port. The name must be 1-63 characters long, and comply with RFC1035. */
  var name: js.UndefOr[String] = js.native
  /** The port number, which can be a value between 1 and 65535. */
  var port: js.UndefOr[Double] = js.native
}

object NamedPort {
  @scala.inline
  def apply(): NamedPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedPort]
  }
  @scala.inline
  implicit class NamedPortOps[Self <: NamedPort] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

