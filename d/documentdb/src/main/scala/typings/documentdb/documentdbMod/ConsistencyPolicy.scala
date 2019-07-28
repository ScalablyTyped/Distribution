package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsistencyPolicy extends js.Object {
  var defaultConsistencyLevel: ConsistencyLevel
  var maxStalenessIntervalInSeconds: Double
  var maxStalenessPrefix: Double
}

object ConsistencyPolicy {
  @scala.inline
  def apply(
    defaultConsistencyLevel: ConsistencyLevel,
    maxStalenessIntervalInSeconds: Double,
    maxStalenessPrefix: Double
  ): ConsistencyPolicy = {
    val __obj = js.Dynamic.literal(defaultConsistencyLevel = defaultConsistencyLevel, maxStalenessIntervalInSeconds = maxStalenessIntervalInSeconds, maxStalenessPrefix = maxStalenessPrefix)
  
    __obj.asInstanceOf[ConsistencyPolicy]
  }
}

