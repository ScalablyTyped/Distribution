package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.gapi.drive.realtime.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeLoader extends js.Object {
  def handleErrors(e: Error): Unit
  def load(): Unit
  def start(): Unit
}

object RealtimeLoader {
  @scala.inline
  def apply(handleErrors: Error => Unit, load: () => Unit, start: () => Unit): RealtimeLoader = {
    val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1(handleErrors), load = js.Any.fromFunction0(load), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[RealtimeLoader]
  }
}

