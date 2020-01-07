package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for html properties.
  */
@js.native
trait Schema$HtmlPropertyOptions extends js.Object {
  /**
    * If set, describes how the property should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$HtmlOperatorOptions] = js.native
  /**
    * Indicates the search quality importance of the tokens within the field
    * when used for retrieval. Can only be set to DEFAULT or NONE.
    */
  var retrievalImportance: js.UndefOr[Schema$RetrievalImportance] = js.native
}

object Schema$HtmlPropertyOptions {
  @scala.inline
  def apply(
    operatorOptions: Schema$HtmlOperatorOptions = null,
    retrievalImportance: Schema$RetrievalImportance = null
  ): Schema$HtmlPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    if (retrievalImportance != null) __obj.updateDynamic("retrievalImportance")(retrievalImportance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HtmlPropertyOptions]
  }
}

