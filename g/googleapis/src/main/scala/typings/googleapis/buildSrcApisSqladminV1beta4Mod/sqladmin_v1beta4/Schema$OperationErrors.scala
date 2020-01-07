package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance operation errors list wrapper.
  */
@js.native
trait Schema$OperationErrors extends js.Object {
  /**
    * The list of errors encountered while processing this operation.
    */
  var errors: js.UndefOr[js.Array[Schema$OperationError]] = js.native
  /**
    * This is always sql#operationErrors.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OperationErrors {
  @scala.inline
  def apply(errors: js.Array[Schema$OperationError] = null, kind: String = null): Schema$OperationErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationErrors]
  }
}

