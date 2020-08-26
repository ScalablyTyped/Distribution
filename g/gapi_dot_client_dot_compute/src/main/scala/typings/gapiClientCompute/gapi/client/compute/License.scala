package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait License extends js.Object {
  /** [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee. */
  var chargesUseFee: js.UndefOr[Boolean] = js.native
  /** [Output Only] Type of resource. Always compute#license for licenses. */
  var kind: js.UndefOr[String] = js.native
  /** [Output Only] Name of the resource. The name is 1-63 characters long and complies with RFC1035. */
  var name: js.UndefOr[String] = js.native
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object License {
  @scala.inline
  def apply(): License = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[License]
  }
  @scala.inline
  implicit class LicenseOps[Self <: License] (val x: Self) extends AnyVal {
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
    def setChargesUseFee(value: Boolean): Self = this.set("chargesUseFee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChargesUseFee: Self = this.set("chargesUseFee", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

