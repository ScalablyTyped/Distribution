package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExamStatus extends js.Object {
  /** The type of the exam. */
  var examType: js.UndefOr[java.lang.String] = js.undefined
  /** Date this exam is due to expire. */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /** The date the user last passed this exam. */
  var lastPassed: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this exam has been passed and not expired. */
  var passed: js.UndefOr[scala.Boolean] = js.undefined
  /** The date the user last taken this exam. */
  var taken: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this exam is in the state of warning. */
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

