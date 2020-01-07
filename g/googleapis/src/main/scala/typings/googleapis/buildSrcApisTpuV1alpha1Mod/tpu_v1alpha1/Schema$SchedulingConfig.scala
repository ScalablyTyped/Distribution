package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SchedulingConfig extends js.Object {
  var preemptible: js.UndefOr[Boolean] = js.native
}

object Schema$SchedulingConfig {
  @scala.inline
  def apply(preemptible: js.UndefOr[Boolean] = js.undefined): Schema$SchedulingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SchedulingConfig]
  }
}

