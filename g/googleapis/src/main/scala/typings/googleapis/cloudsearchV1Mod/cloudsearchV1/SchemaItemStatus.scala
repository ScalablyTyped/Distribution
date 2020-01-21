package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This contains item&#39;s status and any errors.
  */
@js.native
trait SchemaItemStatus extends js.Object {
  /**
    * Status code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Error details in case the item is in ERROR state.
    */
  var processingErrors: js.UndefOr[js.Array[SchemaProcessingError]] = js.native
  /**
    * Repository error reported by connector.
    */
  var repositoryErrors: js.UndefOr[js.Array[SchemaRepositoryError]] = js.native
}

object SchemaItemStatus {
  @scala.inline
  def apply(
    code: String = null,
    processingErrors: js.Array[SchemaProcessingError] = null,
    repositoryErrors: js.Array[SchemaRepositoryError] = null
  ): SchemaItemStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (processingErrors != null) __obj.updateDynamic("processingErrors")(processingErrors.asInstanceOf[js.Any])
    if (repositoryErrors != null) __obj.updateDynamic("repositoryErrors")(repositoryErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaItemStatus]
  }
}

