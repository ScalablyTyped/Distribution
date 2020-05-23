package typings.expressStatusMonitor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cpu extends js.Object {
  var cpu: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Boolean] = js.undefined
  var mem: js.UndefOr[Boolean] = js.undefined
  var responseTime: js.UndefOr[Boolean] = js.undefined
  var rps: js.UndefOr[Boolean] = js.undefined
  var statusCodes: js.UndefOr[Boolean] = js.undefined
}

object Cpu {
  @scala.inline
  def apply(
    cpu: js.UndefOr[Boolean] = js.undefined,
    load: js.UndefOr[Boolean] = js.undefined,
    mem: js.UndefOr[Boolean] = js.undefined,
    responseTime: js.UndefOr[Boolean] = js.undefined,
    rps: js.UndefOr[Boolean] = js.undefined,
    statusCodes: js.UndefOr[Boolean] = js.undefined
  ): Cpu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mem)) __obj.updateDynamic("mem")(mem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responseTime)) __obj.updateDynamic("responseTime")(responseTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rps)) __obj.updateDynamic("rps")(rps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCodes)) __obj.updateDynamic("statusCodes")(statusCodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpu]
  }
}

