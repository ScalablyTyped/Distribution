package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a batch update failure resource.
  */
@js.native
trait Schema$EventBatchRecordFailure extends js.Object {
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;TOO_LARGE&quot;: A batch request was issued with more events than
    * are allowed in a single batch.  - &quot;TIME_PERIOD_EXPIRED&quot;: A
    * batch was sent with data too far in the past to record.  -
    * &quot;TIME_PERIOD_SHORT&quot;: A batch was sent with a time range that
    * was too short.  - &quot;TIME_PERIOD_LONG&quot;: A batch was sent with a
    * time range that was too long.  - &quot;ALREADY_UPDATED&quot;: An attempt
    * was made to record a batch of data which was already seen.  -
    * &quot;RECORD_RATE_HIGH&quot;: An attempt was made to record data faster
    * than the server will apply updates.
    */
  var failureCause: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventBatchRecordFailure.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time range which was rejected; empty for a request-wide failure.
    */
  var range: js.UndefOr[Schema$EventPeriodRange] = js.native
}

object Schema$EventBatchRecordFailure {
  @scala.inline
  def apply(failureCause: String = null, kind: String = null, range: Schema$EventPeriodRange = null): Schema$EventBatchRecordFailure = {
    val __obj = js.Dynamic.literal()
    if (failureCause != null) __obj.updateDynamic("failureCause")(failureCause.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventBatchRecordFailure]
  }
}

