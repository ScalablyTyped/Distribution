package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MozillaOptions extends js.Object {
  /**
    * Default: false
    */
  var comprehensionExpressionStartsWithAssignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var parenthesizedComprehensionBlock: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    */
  var starlessGenerator: js.UndefOr[scala.Boolean] = js.undefined
}

object MozillaOptions {
  @scala.inline
  def apply(
    comprehensionExpressionStartsWithAssignment: js.UndefOr[scala.Boolean] = js.undefined,
    parenthesizedComprehensionBlock: js.UndefOr[scala.Boolean] = js.undefined,
    starlessGenerator: js.UndefOr[scala.Boolean] = js.undefined
  ): MozillaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comprehensionExpressionStartsWithAssignment)) __obj.updateDynamic("comprehensionExpressionStartsWithAssignment")(comprehensionExpressionStartsWithAssignment)
    if (!js.isUndefined(parenthesizedComprehensionBlock)) __obj.updateDynamic("parenthesizedComprehensionBlock")(parenthesizedComprehensionBlock)
    if (!js.isUndefined(starlessGenerator)) __obj.updateDynamic("starlessGenerator")(starlessGenerator)
    __obj.asInstanceOf[MozillaOptions]
  }
}

