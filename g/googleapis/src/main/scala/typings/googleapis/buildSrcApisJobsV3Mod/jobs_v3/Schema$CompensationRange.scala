package typings.googleapis.buildSrcApisJobsV3Mod.jobs_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compensation range.
  */
@js.native
trait Schema$CompensationRange extends js.Object {
  /**
    * Optional.  The maximum amount of compensation. If left empty, the value
    * is set to a maximal compensation value and the currency code is set to
    * match the currency code of min_compensation.
    */
  var maxCompensation: js.UndefOr[Schema$Money] = js.native
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var minCompensation: js.UndefOr[Schema$Money] = js.native
}

object Schema$CompensationRange {
  @scala.inline
  def apply(maxCompensation: Schema$Money = null, minCompensation: Schema$Money = null): Schema$CompensationRange = {
    val __obj = js.Dynamic.literal()
    if (maxCompensation != null) __obj.updateDynamic("maxCompensation")(maxCompensation.asInstanceOf[js.Any])
    if (minCompensation != null) __obj.updateDynamic("minCompensation")(minCompensation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompensationRange]
  }
}

