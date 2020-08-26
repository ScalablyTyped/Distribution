package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCheckAccessResponse extends js.Object {
  /**
    * Returns true if principal has access.  Returns false otherwise.
    */
  var hasAccess: js.UndefOr[Boolean] = js.native
}

object SchemaCheckAccessResponse {
  @scala.inline
  def apply(): SchemaCheckAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckAccessResponse]
  }
  @scala.inline
  implicit class SchemaCheckAccessResponseOps[Self <: SchemaCheckAccessResponse] (val x: Self) extends AnyVal {
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
    def setHasAccess(value: Boolean): Self = this.set("hasAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAccess: Self = this.set("hasAccess", js.undefined)
  }
  
}

