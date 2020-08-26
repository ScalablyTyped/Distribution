package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalCodeGroup extends js.Object {
  var country: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var postalCodeRanges: js.UndefOr[js.Array[PostalCodeRange]] = js.native
}

object PostalCodeGroup {
  @scala.inline
  def apply(): PostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCodeGroup]
  }
  @scala.inline
  implicit class PostalCodeGroupOps[Self <: PostalCodeGroup] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPostalCodeRangesVarargs(value: PostalCodeRange*): Self = this.set("postalCodeRanges", js.Array(value :_*))
    @scala.inline
    def setPostalCodeRanges(value: js.Array[PostalCodeRange]): Self = this.set("postalCodeRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeRanges: Self = this.set("postalCodeRanges", js.undefined)
  }
  
}

