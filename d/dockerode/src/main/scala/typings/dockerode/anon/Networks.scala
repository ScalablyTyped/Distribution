package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.mod.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Networks extends js.Object {
  var Networks: StringDictionary[NetworkInfo] = js.native
}

object Networks {
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): Networks = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networks]
  }
  @scala.inline
  implicit class NetworksOps[Self <: Networks] (val x: Self) extends AnyVal {
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
    def setNetworks(value: StringDictionary[NetworkInfo]): Self = this.set("Networks", value.asInstanceOf[js.Any])
  }
  
}

