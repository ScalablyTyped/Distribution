package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to look up representative information for a single division.
  */
@js.native
trait SchemaDivisionRepresentativeInfoRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
}

object SchemaDivisionRepresentativeInfoRequest {
  @scala.inline
  def apply(): SchemaDivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionRepresentativeInfoRequest]
  }
  @scala.inline
  implicit class SchemaDivisionRepresentativeInfoRequestOps[Self <: SchemaDivisionRepresentativeInfoRequest] (val x: Self) extends AnyVal {
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
    def setContextParams(value: SchemaContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
  }
  
}

