package typings.edtrIoMathquill.mod

import typings.edtrIoMathquill.anon.Edit
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var autoCommands: js.UndefOr[String] = js.undefined
  var autoOperatorNames: js.UndefOr[String] = js.undefined
  var autoSubscriptNumerals: js.UndefOr[Boolean] = js.undefined
  var charsThatBreakOutOfSupSub: js.UndefOr[String] = js.undefined
  var handlers: js.UndefOr[Edit] = js.undefined
  var leftRightIntoCmdGoes: js.UndefOr[String] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var restrictMismatchedBrackets: js.UndefOr[Boolean] = js.undefined
  var spaceBehavesLikeTab: js.UndefOr[Boolean] = js.undefined
  var substituteTextarea: js.UndefOr[js.Function0[HTMLTextAreaElement]] = js.undefined
  var sumStartsWithNEquals: js.UndefOr[Boolean] = js.undefined
  var supSubsRequireOperand: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autoCommands: String = null,
    autoOperatorNames: String = null,
    autoSubscriptNumerals: js.UndefOr[Boolean] = js.undefined,
    charsThatBreakOutOfSupSub: String = null,
    handlers: Edit = null,
    leftRightIntoCmdGoes: String = null,
    maxDepth: js.UndefOr[Double] = js.undefined,
    restrictMismatchedBrackets: js.UndefOr[Boolean] = js.undefined,
    spaceBehavesLikeTab: js.UndefOr[Boolean] = js.undefined,
    substituteTextarea: () => HTMLTextAreaElement = null,
    sumStartsWithNEquals: js.UndefOr[Boolean] = js.undefined,
    supSubsRequireOperand: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (autoCommands != null) __obj.updateDynamic("autoCommands")(autoCommands.asInstanceOf[js.Any])
    if (autoOperatorNames != null) __obj.updateDynamic("autoOperatorNames")(autoOperatorNames.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSubscriptNumerals)) __obj.updateDynamic("autoSubscriptNumerals")(autoSubscriptNumerals.get.asInstanceOf[js.Any])
    if (charsThatBreakOutOfSupSub != null) __obj.updateDynamic("charsThatBreakOutOfSupSub")(charsThatBreakOutOfSupSub.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (leftRightIntoCmdGoes != null) __obj.updateDynamic("leftRightIntoCmdGoes")(leftRightIntoCmdGoes.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictMismatchedBrackets)) __obj.updateDynamic("restrictMismatchedBrackets")(restrictMismatchedBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBehavesLikeTab)) __obj.updateDynamic("spaceBehavesLikeTab")(spaceBehavesLikeTab.get.asInstanceOf[js.Any])
    if (substituteTextarea != null) __obj.updateDynamic("substituteTextarea")(js.Any.fromFunction0(substituteTextarea))
    if (!js.isUndefined(sumStartsWithNEquals)) __obj.updateDynamic("sumStartsWithNEquals")(sumStartsWithNEquals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supSubsRequireOperand)) __obj.updateDynamic("supSubsRequireOperand")(supSubsRequireOperand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

