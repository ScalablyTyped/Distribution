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

@JSGlobal("rtclient.RealtimeLoader")
@js.native
class RealtimeLoaderCls protected () extends RealtimeLoader {
  def this(options: LoaderOptions) = this()
  /* CompleteClass */
  override def handleErrors(e: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Error): scala.Unit = js.native
  /* CompleteClass */
  override def load(): scala.Unit = js.native
  /* CompleteClass */
  override def start(): scala.Unit = js.native
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

