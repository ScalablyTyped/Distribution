package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Custom ranking information for SearchJobsRequest.
  */
@js.native
trait Schema$CustomRankingInfo extends js.Object {
  /**
    * Required.  Controls over how important the score of
    * CustomRankingInfo.ranking_expression gets applied to job&#39;s final
    * ranking position.  An error is thrown if not specified.
    */
  var importanceLevel: js.UndefOr[String] = js.native
  /**
    * Required.  Controls over how job documents get ranked on top of existing
    * relevance score (determined by API algorithm). The product of ranking
    * expression and relevance score is used to determine job&#39;s final
    * ranking position.  The syntax for this expression is a subset of Google
    * SQL syntax.  Supported operators are: +, -, *, /, where the left and
    * right side of the operator is either a numeric Job.custom_attributes key,
    * integer/double value or an expression that can be evaluated to a number.
    * Parenthesis are supported to adjust calculation precedence. The
    * expression must be &lt; 100 characters in length.  Sample ranking
    * expression (year + 25) * 0.25 - (freshness / 0.5)
    */
  var rankingExpression: js.UndefOr[String] = js.native
}

object Schema$CustomRankingInfo {
  @scala.inline
  def apply(importanceLevel: String = null, rankingExpression: String = null): Schema$CustomRankingInfo = {
    val __obj = js.Dynamic.literal()
    if (importanceLevel != null) __obj.updateDynamic("importanceLevel")(importanceLevel.asInstanceOf[js.Any])
    if (rankingExpression != null) __obj.updateDynamic("rankingExpression")(rankingExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomRankingInfo]
  }
}

