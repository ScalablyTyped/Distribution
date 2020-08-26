package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Drive mime-type search restricts (e.g. &quot;type:pdf&quot;).
  */
@js.native
trait SchemaDriveMimeTypeRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDriveMimeTypeRestrict {
  @scala.inline
  def apply(): SchemaDriveMimeTypeRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveMimeTypeRestrict]
  }
  @scala.inline
  implicit class SchemaDriveMimeTypeRestrictOps[Self <: SchemaDriveMimeTypeRestrict] (val x: Self) extends AnyVal {
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

