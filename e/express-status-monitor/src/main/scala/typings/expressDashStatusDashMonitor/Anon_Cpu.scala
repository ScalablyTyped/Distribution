package typings.expressDashStatusDashMonitor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cpu extends js.Object {
  var cpu: js.UndefOr[Boolean] = js.undefined
  var load: js.UndefOr[Boolean] = js.undefined
  var mem: js.UndefOr[Boolean] = js.undefined
  var responseTime: js.UndefOr[Boolean] = js.undefined
  var rps: js.UndefOr[Boolean] = js.undefined
  var statusCodes: js.UndefOr[Boolean] = js.undefined
}

object Anon_Cpu {
  @scala.inline
  def apply(
    cpu: js.UndefOr[Boolean] = js.undefined,
    load: js.UndefOr[Boolean] = js.undefined,
    mem: js.UndefOr[Boolean] = js.undefined,
    responseTime: js.UndefOr[Boolean] = js.undefined,
    rps: js.UndefOr[Boolean] = js.undefined,
    statusCodes: js.UndefOr[Boolean] = js.undefined
  ): Anon_Cpu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpu)) __obj.updateDynamic("cpu")(cpu)
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load)
    if (!js.isUndefined(mem)) __obj.updateDynamic("mem")(mem)
    if (!js.isUndefined(responseTime)) __obj.updateDynamic("responseTime")(responseTime)
    if (!js.isUndefined(rps)) __obj.updateDynamic("rps")(rps)
    if (!js.isUndefined(statusCodes)) __obj.updateDynamic("statusCodes")(statusCodes)
    __obj.asInstanceOf[Anon_Cpu]
  }
}

