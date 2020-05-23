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
    datacenter: js.UndefOr[Double] = js.undefined,
    epoch: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    seqMask: js.UndefOr[Double] = js.undefined,
    worker: js.UndefOr[Double] = js.undefined
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(datacenter)) __obj.updateDynamic("datacenter")(datacenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(epoch)) __obj.updateDynamic("epoch")(epoch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seqMask)) __obj.updateDynamic("seqMask")(seqMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

