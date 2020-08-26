package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExamStatus extends js.Object {
  /** The type of the exam. */
  var examType: js.UndefOr[String] = js.native
  /** Date this exam is due to expire. */
  var expiration: js.UndefOr[String] = js.native
  /** The date the user last passed this exam. */
  var lastPassed: js.UndefOr[String] = js.native
  /** Whether this exam has been passed and not expired. */
  var passed: js.UndefOr[Boolean] = js.native
  /** The date the user last taken this exam. */
  var taken: js.UndefOr[String] = js.native
  /** Whether this exam is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.native
}

object ExamStatus {
  @scala.inline
  def apply(): ExamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExamStatus]
  }
  @scala.inline
  implicit class ExamStatusOps[Self <: ExamStatus] (val x: Self) extends AnyVal {
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
    def setExamType(value: String): Self = this.set("examType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamType: Self = this.set("examType", js.undefined)
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setLastPassed(value: String): Self = this.set("lastPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPassed: Self = this.set("lastPassed", js.undefined)
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    @scala.inline
    def setTaken(value: String): Self = this.set("taken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaken: Self = this.set("taken", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

