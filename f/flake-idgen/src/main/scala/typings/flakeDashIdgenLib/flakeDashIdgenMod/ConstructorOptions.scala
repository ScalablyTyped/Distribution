package typings
package flakeDashIdgenLib.flakeDashIdgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var datacenter: js.UndefOr[scala.Double] = js.undefined
  var epoch: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var seqMask: js.UndefOr[scala.Double] = js.undefined
  var worker: js.UndefOr[scala.Double] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    datacenter: scala.Int | scala.Double = null,
    epoch: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    seqMask: scala.Int | scala.Double = null,
    worker: scala.Int | scala.Double = null
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

