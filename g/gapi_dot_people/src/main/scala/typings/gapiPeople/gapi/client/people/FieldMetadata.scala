package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMetadata extends js.Object {
  var primary: Boolean = js.native
  var source: Source = js.native
  var verified: Boolean = js.native
}

object FieldMetadata {
  @scala.inline
  def apply(primary: Boolean, source: Source, verified: Boolean): FieldMetadata = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMetadata]
  }
  @scala.inline
  implicit class FieldMetadataOps[Self <: FieldMetadata] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
  
}

