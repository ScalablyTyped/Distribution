package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamStatus extends js.Object {
  /** The type of the exam. */
  var examType: js.UndefOr[String] = js.undefined
  /** Date this exam is due to expire. */
  var expiration: js.UndefOr[String] = js.undefined
  /** The date the user last passed this exam. */
  var lastPassed: js.UndefOr[String] = js.undefined
  /** Whether this exam has been passed and not expired. */
  var passed: js.UndefOr[Boolean] = js.undefined
  /** The date the user last taken this exam. */
  var taken: js.UndefOr[String] = js.undefined
  /** Whether this exam is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.undefined
}

object ExamStatus {
  @scala.inline
  def apply(
    examType: String = null,
    expiration: String = null,
    lastPassed: String = null,
    passed: js.UndefOr[Boolean] = js.undefined,
    taken: String = null,
    warning: js.UndefOr[Boolean] = js.undefined
  ): ExamStatus = {
    val __obj = js.Dynamic.literal()
    if (examType != null) __obj.updateDynamic("examType")(examType.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (lastPassed != null) __obj.updateDynamic("lastPassed")(lastPassed.asInstanceOf[js.Any])
    if (!js.isUndefined(passed)) __obj.updateDynamic("passed")(passed.asInstanceOf[js.Any])
    if (taken != null) __obj.updateDynamic("taken")(taken.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExamStatus]
  }
}

