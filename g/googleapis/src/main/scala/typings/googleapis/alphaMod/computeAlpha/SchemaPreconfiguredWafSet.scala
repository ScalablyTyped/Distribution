package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPreconfiguredWafSet extends js.Object {
  /**
    * List of entities that are currently supported for WAF rules.
    */
  var expressionSets: js.UndefOr[js.Array[SchemaWafExpressionSet]] = js.native
}

object SchemaPreconfiguredWafSet {
  @scala.inline
  def apply(expressionSets: js.Array[SchemaWafExpressionSet] = null): SchemaPreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    if (expressionSets != null) __obj.updateDynamic("expressionSets")(expressionSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPreconfiguredWafSet]
  }
}

