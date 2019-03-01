package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproximateProgress extends js.Object {
  /** Obsolete. */
  var percentComplete: js.UndefOr[scala.Double] = js.undefined
  /** Obsolete. */
  var position: js.UndefOr[Position] = js.undefined
  /** Obsolete. */
  var remainingTime: js.UndefOr[java.lang.String] = js.undefined
}

object ApproximateProgress {
  @scala.inline
  def apply(
    percentComplete: scala.Int | scala.Double = null,
    position: Position = null,
    remainingTime: java.lang.String = null
  ): ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (remainingTime != null) __obj.updateDynamic("remainingTime")(remainingTime)
    __obj.asInstanceOf[ApproximateProgress]
  }
}

