package typings.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecConfig extends js.Object {
  /**
    * The maximum number of concurrently-active listens for limbo resolutions.
    * This value must be strictly greater than zero, or undefined to use the
    * default value.
    */
  var maxConcurrentLimboResolutions: js.UndefOr[Double] = js.undefined
  /** The number of active clients for this test run. */
  var numClients: Double
  /** A boolean to enable / disable GC. */
  var useGarbageCollection: Boolean
}

object SpecConfig {
  @scala.inline
  def apply(
    numClients: Double,
    useGarbageCollection: Boolean,
    maxConcurrentLimboResolutions: Int | Double = null
  ): SpecConfig = {
    val __obj = js.Dynamic.literal(numClients = numClients.asInstanceOf[js.Any], useGarbageCollection = useGarbageCollection.asInstanceOf[js.Any])
    if (maxConcurrentLimboResolutions != null) __obj.updateDynamic("maxConcurrentLimboResolutions")(maxConcurrentLimboResolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
}

