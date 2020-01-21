package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketBySession extends js.Object {
  /** Specifies that only sessions of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[String] = js.undefined
}

object BucketBySession {
  @scala.inline
  def apply(minDurationMillis: String = null): BucketBySession = {
    val __obj = js.Dynamic.literal()
    if (minDurationMillis != null) __obj.updateDynamic("minDurationMillis")(minDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketBySession]
  }
}

