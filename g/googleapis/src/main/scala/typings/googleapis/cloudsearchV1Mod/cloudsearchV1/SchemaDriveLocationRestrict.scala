package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive location search restricts (e.g. &quot;is:starred&quot;).
  */
@js.native
trait SchemaDriveLocationRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveLocationRestrict {
  @scala.inline
  def apply(): SchemaDriveLocationRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveLocationRestrict]
  }
  @scala.inline
  implicit class SchemaDriveLocationRestrictOps[Self <: SchemaDriveLocationRestrict] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

