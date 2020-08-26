package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaIndexItemOptions extends js.Object {
  /**
    * Specifies if the index request should allow gsuite principals that do not
    * exist or are deleted in the index request.
    */
  var allowUnknownGsuitePrincipals: js.UndefOr[Boolean] = js.native
}

object SchemaIndexItemOptions {
  @scala.inline
  def apply(): SchemaIndexItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexItemOptions]
  }
  @scala.inline
  implicit class SchemaIndexItemOptionsOps[Self <: SchemaIndexItemOptions] (val x: Self) extends AnyVal {
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
    def setAllowUnknownGsuitePrincipals(value: Boolean): Self = this.set("allowUnknownGsuitePrincipals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnknownGsuitePrincipals: Self = this.set("allowUnknownGsuitePrincipals", js.undefined)
  }
  
}

