package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWafExpressionSet extends js.Object {
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic
    * suffix like &quot;stable&quot; is particularly useful if a policy likes
    * to avail newer set of expressions without having to change the policy. A
    * given alias name can&#39;t be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of available expressions.
    */
  var expressions: js.UndefOr[js.Array[SchemaWafExpressionSetExpression]] = js.native
  /**
    * Google specified expression set ID. The format should be: - E.g.
    * XSS-20170329
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaWafExpressionSet {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    expressions: js.Array[SchemaWafExpressionSetExpression] = null,
    id: String = null
  ): SchemaWafExpressionSet = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWafExpressionSet]
  }
}

