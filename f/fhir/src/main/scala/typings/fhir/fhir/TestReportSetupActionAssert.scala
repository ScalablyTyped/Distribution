package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
@js.native
trait TestReportSetupActionAssert extends BackboneElement {
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'message'.
    */
  var _message: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.native
  /**
    * A link to further details on the result
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.native
  /**
    * pass | skip | fail | warning | error
    */
  var result: code = js.native
}

object TestReportSetupActionAssert {
  @scala.inline
  def apply(result: code): TestReportSetupActionAssert = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionAssert]
  }
  @scala.inline
  implicit class TestReportSetupActionAssertOps[Self <: TestReportSetupActionAssert] (val x: Self) extends AnyVal {
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
    def setResult(value: code): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def set_detail(value: Element): Self = this.set("_detail", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_detail: Self = this.set("_detail", js.undefined)
    @scala.inline
    def set_message(value: Element): Self = this.set("_message", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_message: Self = this.set("_message", js.undefined)
    @scala.inline
    def set_result(value: Element): Self = this.set("_result", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_result: Self = this.set("_result", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setMessage(value: markdown): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

