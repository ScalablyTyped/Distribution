package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessConfig extends js.Object {
  /** [Output Only] Type of the resource. Always compute#accessConfig for access configs. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of this access configuration. The default and recommended name is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the
    * zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.native
  /** The type of configuration. The default and only option is ONE_TO_ONE_NAT. */
  var `type`: js.UndefOr[String] = js.native
}

object AccessConfig {
  @scala.inline
  def apply(): AccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConfig]
  }
  @scala.inline
  implicit class AccessConfigOps[Self <: AccessConfig] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNatIP(value: String): Self = this.set("natIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatIP: Self = this.set("natIP", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

