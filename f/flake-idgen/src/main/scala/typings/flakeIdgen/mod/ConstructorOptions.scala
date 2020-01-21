package typings.flakeIdgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var datacenter: js.UndefOr[Double] = js.undefined
  var epoch: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var seqMask: js.UndefOr[Double] = js.undefined
  var worker: js.UndefOr[Double] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    datacenter: Int | Double = null,
    epoch: Int | Double = null,
    id: Int | Double = null,
    seqMask: Int | Double = null,
    worker: Int | Double = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (datacenter != null) __obj.updateDynamic("datacenter")(datacenter.asInstanceOf[js.Any])
    if (epoch != null) __obj.updateDynamic("epoch")(epoch.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (seqMask != null) __obj.updateDynamic("seqMask")(seqMask.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

