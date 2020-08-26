package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PruneNetworksInfo extends js.Object {
  var NetworksDeleted: js.Array[String] = js.native
}

object PruneNetworksInfo {
  @scala.inline
  def apply(NetworksDeleted: js.Array[String]): PruneNetworksInfo = {
    val __obj = js.Dynamic.literal(NetworksDeleted = NetworksDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneNetworksInfo]
  }
  @scala.inline
  implicit class PruneNetworksInfoOps[Self <: PruneNetworksInfo] (val x: Self) extends AnyVal {
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
    def setNetworksDeletedVarargs(value: String*): Self = this.set("NetworksDeleted", js.Array(value :_*))
    @scala.inline
    def setNetworksDeleted(value: js.Array[String]): Self = this.set("NetworksDeleted", value.asInstanceOf[js.Any])
  }
  
}

