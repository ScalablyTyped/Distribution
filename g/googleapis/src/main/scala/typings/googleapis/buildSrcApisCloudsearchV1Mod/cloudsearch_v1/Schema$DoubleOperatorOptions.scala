package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to provide a search operator for double properties. This is optional.
  * Search operators let users restrict the query to specific fields relevant
  * to the type of item being searched.
  */
@js.native
trait Schema$DoubleOperatorOptions extends js.Object {
  /**
    * Indicates the operator name required in the query in order to use the
    * double property in sorting or as a facet. The operator name can only
    * contain lowercase letters (a-z). The maximum length is 32 characters.
    */
  var operatorName: js.UndefOr[String] = js.native
}

object Schema$DoubleOperatorOptions {
  @scala.inline
  def apply(operatorName: String = null): Schema$DoubleOperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorName != null) __obj.updateDynamic("operatorName")(operatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DoubleOperatorOptions]
  }
}

