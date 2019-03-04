package typings
package googleDashDriveDashRealtimeDashApiLib.rtclientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeLoader extends js.Object {
  def handleErrors(e: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error): scala.Unit
  def load(): scala.Unit
  def start(): scala.Unit
}

object RealtimeLoader {
  @scala.inline
  def apply(
    handleErrors: js.Function1[googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error, scala.Unit],
    load: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): RealtimeLoader = {
    val __obj = js.Dynamic.literal(handleErrors = handleErrors, load = load, start = start)
  
    __obj.asInstanceOf[RealtimeLoader]
  }
}

