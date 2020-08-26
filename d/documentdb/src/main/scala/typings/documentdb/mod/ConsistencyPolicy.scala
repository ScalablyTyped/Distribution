package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsistencyPolicy extends js.Object {
  var defaultConsistencyLevel: ConsistencyLevel = js.native
  var maxStalenessIntervalInSeconds: Double = js.native
  var maxStalenessPrefix: Double = js.native
}

object ConsistencyPolicy {
  @scala.inline
  def apply(
    defaultConsistencyLevel: ConsistencyLevel,
    maxStalenessIntervalInSeconds: Double,
    maxStalenessPrefix: Double
  ): ConsistencyPolicy = {
    val __obj = js.Dynamic.literal(defaultConsistencyLevel = defaultConsistencyLevel.asInstanceOf[js.Any], maxStalenessIntervalInSeconds = maxStalenessIntervalInSeconds.asInstanceOf[js.Any], maxStalenessPrefix = maxStalenessPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsistencyPolicy]
  }
  @scala.inline
  implicit class ConsistencyPolicyOps[Self <: ConsistencyPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultConsistencyLevel(value: ConsistencyLevel): Self = this.set("defaultConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxStalenessIntervalInSeconds(value: Double): Self = this.set("maxStalenessIntervalInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxStalenessPrefix(value: Double): Self = this.set("maxStalenessPrefix", value.asInstanceOf[js.Any])
  }
  
}

