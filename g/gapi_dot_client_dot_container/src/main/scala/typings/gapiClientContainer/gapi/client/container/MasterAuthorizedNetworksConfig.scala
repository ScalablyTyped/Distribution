package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasterAuthorizedNetworksConfig extends js.Object {
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[CidrBlock]] = js.native
  /** Whether or not master authorized networks is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
}

object MasterAuthorizedNetworksConfig {
  @scala.inline
  def apply(): MasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterAuthorizedNetworksConfig]
  }
  @scala.inline
  implicit class MasterAuthorizedNetworksConfigOps[Self <: MasterAuthorizedNetworksConfig] (val x: Self) extends AnyVal {
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
    def setCidrBlocksVarargs(value: CidrBlock*): Self = this.set("cidrBlocks", js.Array(value :_*))
    @scala.inline
    def setCidrBlocks(value: js.Array[CidrBlock]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

