package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkMode extends js.Object {
  var NetworkMode: String = js.native
}

object NetworkMode {
  @scala.inline
  def apply(NetworkMode: String): NetworkMode = {
    val __obj = js.Dynamic.literal(NetworkMode = NetworkMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkMode]
  }
  @scala.inline
  implicit class NetworkModeOps[Self <: NetworkMode] (val x: Self) extends AnyVal {
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
    def setNetworkMode(value: String): Self = this.set("NetworkMode", value.asInstanceOf[js.Any])
  }
  
}

