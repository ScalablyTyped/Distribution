package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatted extends js.Object {
  var familyName: js.UndefOr[String] = js.native
  var formatted: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
  var honorificPrefix: js.UndefOr[String] = js.native
  var honorificSuffix: js.UndefOr[String] = js.native
  var middleName: js.UndefOr[String] = js.native
}

object Formatted {
  @scala.inline
  def apply(): Formatted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatted]
  }
  @scala.inline
  implicit class FormattedOps[Self <: Formatted] (val x: Self) extends AnyVal {
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setHonorificPrefix(value: String): Self = this.set("honorificPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificPrefix: Self = this.set("honorificPrefix", js.undefined)
    @scala.inline
    def setHonorificSuffix(value: String): Self = this.set("honorificSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificSuffix: Self = this.set("honorificSuffix", js.undefined)
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
  }
  
}

