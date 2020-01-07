package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key Value Targeting Expression.
  */
@js.native
trait Schema$KeyValueTargetingExpression extends js.Object {
  /**
    * Keyword expression being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object Schema$KeyValueTargetingExpression {
  @scala.inline
  def apply(expression: String = null): Schema$KeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$KeyValueTargetingExpression]
  }
}

