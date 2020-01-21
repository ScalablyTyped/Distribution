package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for html properties.
  */
@js.native
trait SchemaHtmlPropertyOptions extends js.Object {
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaHtmlOperatorOptions] = js.native
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval. Can only be set to DEFAULT or NONE.
    */
  var retrievalImportance: js.UndefOr[SchemaRetrievalImportance] = js.native
}

object SchemaHtmlPropertyOptions {
  @scala.inline
  def apply(
    operatorOptions: SchemaHtmlOperatorOptions = null,
    retrievalImportance: SchemaRetrievalImportance = null
  ): SchemaHtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    if (retrievalImportance != null) __obj.updateDynamic("retrievalImportance")(retrievalImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHtmlPropertyOptions]
  }
}

