package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Obsolete in favor of ApproximateReportedProgress and
  * ApproximateSplitRequest.
  */
@js.native
trait Schema$ApproximateProgress extends js.Object {
  /**
    * Obsolete.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  /**
    * Obsolete.
    */
  var position: js.UndefOr[Schema$Position] = js.native
  /**
    * Obsolete.
    */
  var remainingTime: js.UndefOr[String] = js.native
}

object Schema$ApproximateProgress {
  @scala.inline
  def apply(
    percentComplete: Int | Double = null,
    position: Schema$Position = null,
    remainingTime: String = null
  ): Schema$ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (remainingTime != null) __obj.updateDynamic("remainingTime")(remainingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApproximateProgress]
  }
}

