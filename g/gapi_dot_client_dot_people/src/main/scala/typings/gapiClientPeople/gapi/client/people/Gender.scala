package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gender extends js.Object {
  /**
    * Output only. The value of the gender translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedValue: js.UndefOr[String] = js.native
  /** Metadata about the gender. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /**
    * The gender for the person. The gender can be custom or one of these
    * predefined values:
    *
    * &#42; `male`
    * &#42; `female`
    * &#42; `other`
    * &#42; `unknown`
    */
  var value: js.UndefOr[String] = js.native
}

object Gender {
  @scala.inline
  def apply(): Gender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gender]
  }
  @scala.inline
  implicit class GenderOps[Self <: Gender] (val x: Self) extends AnyVal {
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
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedValue: Self = this.set("formattedValue", js.undefined)
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

