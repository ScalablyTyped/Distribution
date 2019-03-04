package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsistencyPolicy extends js.Object {
  var defaultConsistencyLevel: ConsistencyLevel
  var maxStalenessIntervalInSeconds: scala.Double
  var maxStalenessPrefix: scala.Double
}

object ConsistencyPolicy {
  @scala.inline
  def apply(
    defaultConsistencyLevel: ConsistencyLevel,
    maxStalenessIntervalInSeconds: scala.Double,
    maxStalenessPrefix: scala.Double
  ): ConsistencyPolicy = {
    val __obj = js.Dynamic.literal(defaultConsistencyLevel = defaultConsistencyLevel, maxStalenessIntervalInSeconds = maxStalenessIntervalInSeconds, maxStalenessPrefix = maxStalenessPrefix)
  
    __obj.asInstanceOf[ConsistencyPolicy]
  }
}

