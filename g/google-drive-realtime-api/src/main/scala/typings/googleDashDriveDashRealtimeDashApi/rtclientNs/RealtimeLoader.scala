package typings.googleDashDriveDashRealtimeDashApi.rtclientNs

import typings.googleDashDriveDashRealtimeDashApi.gapiNs.driveNs.realtimeNs.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeLoader extends js.Object {
  def handleErrors(e: Error): Unit
  def load(): Unit
  def start(): Unit
}

@JSGlobal("rtclient.RealtimeLoader")
@js.native
class RealtimeLoaderCls protected () extends RealtimeLoader {
  def this(options: LoaderOptions) = this()
  /* CompleteClass */
  override def handleErrors(e: Error): Unit = js.native
  /* CompleteClass */
  override def load(): Unit = js.native
  /* CompleteClass */
  override def start(): Unit = js.native
}

object RealtimeLoader {
  @scala.inline
  def apply(handleErrors: Error => Unit, load: () => Unit, start: () => Unit): RealtimeLoader = {
    val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1(handleErrors), load = js.Any.fromFunction0(load), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[RealtimeLoader]
  }
}

