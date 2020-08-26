package typings.edtrIoMathquill.mod

import typings.edtrIoMathquill.anon.Edit
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var autoCommands: js.UndefOr[String] = js.native
  var autoOperatorNames: js.UndefOr[String] = js.native
  var autoSubscriptNumerals: js.UndefOr[Boolean] = js.native
  var charsThatBreakOutOfSupSub: js.UndefOr[String] = js.native
  var handlers: js.UndefOr[Edit] = js.native
  var leftRightIntoCmdGoes: js.UndefOr[String] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var restrictMismatchedBrackets: js.UndefOr[Boolean] = js.native
  var spaceBehavesLikeTab: js.UndefOr[Boolean] = js.native
  var substituteTextarea: js.UndefOr[js.Function0[HTMLTextAreaElement]] = js.native
  var sumStartsWithNEquals: js.UndefOr[Boolean] = js.native
  var supSubsRequireOperand: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoCommands(value: String): Self = this.set("autoCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommands: Self = this.set("autoCommands", js.undefined)
    @scala.inline
    def setAutoOperatorNames(value: String): Self = this.set("autoOperatorNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOperatorNames: Self = this.set("autoOperatorNames", js.undefined)
    @scala.inline
    def setAutoSubscriptNumerals(value: Boolean): Self = this.set("autoSubscriptNumerals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSubscriptNumerals: Self = this.set("autoSubscriptNumerals", js.undefined)
    @scala.inline
    def setCharsThatBreakOutOfSupSub(value: String): Self = this.set("charsThatBreakOutOfSupSub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsThatBreakOutOfSupSub: Self = this.set("charsThatBreakOutOfSupSub", js.undefined)
    @scala.inline
    def setHandlers(value: Edit): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setLeftRightIntoCmdGoes(value: String): Self = this.set("leftRightIntoCmdGoes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftRightIntoCmdGoes: Self = this.set("leftRightIntoCmdGoes", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setRestrictMismatchedBrackets(value: Boolean): Self = this.set("restrictMismatchedBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictMismatchedBrackets: Self = this.set("restrictMismatchedBrackets", js.undefined)
    @scala.inline
    def setSpaceBehavesLikeTab(value: Boolean): Self = this.set("spaceBehavesLikeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBehavesLikeTab: Self = this.set("spaceBehavesLikeTab", js.undefined)
    @scala.inline
    def setSubstituteTextarea(value: () => HTMLTextAreaElement): Self = this.set("substituteTextarea", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSubstituteTextarea: Self = this.set("substituteTextarea", js.undefined)
    @scala.inline
    def setSumStartsWithNEquals(value: Boolean): Self = this.set("sumStartsWithNEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumStartsWithNEquals: Self = this.set("sumStartsWithNEquals", js.undefined)
    @scala.inline
    def setSupSubsRequireOperand(value: Boolean): Self = this.set("supSubsRequireOperand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupSubsRequireOperand: Self = this.set("supSubsRequireOperand", js.undefined)
  }
  
}

