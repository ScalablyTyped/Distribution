package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapePrintParamsXmlParams extends js.Object {
  /** The label alignment on the tape. Use the dymo.label.framework.TapeAlignment enumeration to specify the value. */
  var alignment: js.UndefOr[TapeAlignment] = js.native
  /** The number of copies to print. */
  var copies: js.UndefOr[Double] = js.native
  /** The cut mode (if auto-cut is supported by the printer). Use the dymo.label.framework.TapeCutMode enumeration to specify the value. */
  var cutMode: js.UndefOr[TapeCutMode] = js.native
  /** The direction of the label content on the label (left-to-right or right-to-left). Use the dymo.label.framework.FlowDirection enumeration to specify the value. */
  var flowDirection: js.UndefOr[FlowDirection] = js.native
  /** The print job title/description. */
  var jobTitle: js.UndefOr[String] = js.native
}

object CreateTapePrintParamsXmlParams {
  @scala.inline
  def apply(): CreateTapePrintParamsXmlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapePrintParamsXmlParams]
  }
  @scala.inline
  implicit class CreateTapePrintParamsXmlParamsOps[Self <: CreateTapePrintParamsXmlParams] (val x: Self) extends AnyVal {
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
    def setAlignment(value: TapeAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    @scala.inline
    def setCutMode(value: TapeCutMode): Self = this.set("cutMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutMode: Self = this.set("cutMode", js.undefined)
    @scala.inline
    def setFlowDirection(value: FlowDirection): Self = this.set("flowDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowDirection: Self = this.set("flowDirection", js.undefined)
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
  }
  
}

