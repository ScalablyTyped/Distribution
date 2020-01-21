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
  def apply(contextParams: SchemaContextParams = null): SchemaDivisionRepresentativeInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDivisionRepresentativeInfoRequest]
  }
}

