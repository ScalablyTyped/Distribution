package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for text properties.
  */
@js.native
trait Schema$TextPropertyOptions extends js.Object {
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$TextOperatorOptions] = js.native
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval.
    */
  var retrievalImportance: js.UndefOr[Schema$RetrievalImportance] = js.native
}

object Schema$TextPropertyOptions {
  @scala.inline
  def apply(
    operatorOptions: Schema$TextOperatorOptions = null,
    retrievalImportance: Schema$RetrievalImportance = null
  ): Schema$TextPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    if (retrievalImportance != null) __obj.updateDynamic("retrievalImportance")(retrievalImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextPropertyOptions]
  }
}

