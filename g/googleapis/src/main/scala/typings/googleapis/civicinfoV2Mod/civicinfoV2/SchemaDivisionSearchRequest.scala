package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A search request for political geographies.
  */
@js.native
trait SchemaDivisionSearchRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
}

object SchemaDivisionSearchRequest {
  @scala.inline
  def apply(contextParams: SchemaContextParams = null): SchemaDivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (contextParams != null) __obj.updateDynamic("contextParams")(contextParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDivisionSearchRequest]
  }
}

