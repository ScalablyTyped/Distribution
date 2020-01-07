package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Targeting Expression.
  */
@js.native
trait Schema$ListTargetingExpression extends js.Object {
  /**
    * Expression describing which lists are being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object Schema$ListTargetingExpression {
  @scala.inline
  def apply(expression: String = null): Schema$ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTargetingExpression]
  }
}

