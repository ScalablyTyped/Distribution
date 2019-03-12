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
    handleErrors: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error => scala.Unit,
    load: () => scala.Unit,
    start: () => scala.Unit
  ): RealtimeLoader = {
    val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1(handleErrors), load = js.Any.fromFunction0(load), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[RealtimeLoader]
  }
}

