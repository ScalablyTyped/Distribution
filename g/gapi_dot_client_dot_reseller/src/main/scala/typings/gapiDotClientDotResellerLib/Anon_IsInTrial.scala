package typings
package gapiDotClientDotResellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IsInTrial extends js.Object {
  /**
                   * Determines if a subscription's plan is in a 30-day free trial or not:
                   * - true — The plan is in trial.
                   * - false — The plan is not in trial.
                   */
  var isInTrial: js.UndefOr[scala.Boolean] = js.undefined
  /** Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var trialEndTime: js.UndefOr[java.lang.String] = js.undefined
}

