package typings.escodegen.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MozillaOptions extends js.Object {
  /**
    * Default: false
    */
  var comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    */
  var starlessGenerator: js.UndefOr[Boolean] = js.undefined
}

object MozillaOptions {
  @scala.inline
  def apply(
    comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.undefined,
    parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.undefined,
    starlessGenerator: js.UndefOr[Boolean] = js.undefined
  ): MozillaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comprehensionExpressionStartsWithAssignment)) __obj.updateDynamic("comprehensionExpressionStartsWithAssignment")(comprehensionExpressionStartsWithAssignment.asInstanceOf[js.Any])
    if (!js.isUndefined(parenthesizedComprehensionBlock)) __obj.updateDynamic("parenthesizedComprehensionBlock")(parenthesizedComprehensionBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(starlessGenerator)) __obj.updateDynamic("starlessGenerator")(starlessGenerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MozillaOptions]
  }
}

