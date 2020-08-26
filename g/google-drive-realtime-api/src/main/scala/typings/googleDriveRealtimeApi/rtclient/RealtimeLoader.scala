package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.gapi.drive.realtime.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeLoader extends js.Object {
  def handleErrors(e: Error): Unit = js.native
  def load(): Unit = js.native
  def start(): Unit = js.native
}

object RealtimeLoader {
  @scala.inline
  def apply(handleErrors: Error => Unit, load: () => Unit, start: () => Unit): RealtimeLoader = {
    val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1(handleErrors), load = js.Any.fromFunction0(load), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[RealtimeLoader]
  }
  @scala.inline
  implicit class RealtimeLoaderOps[Self <: RealtimeLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandleErrors(value: Error => Unit): Self = this.set("handleErrors", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: () => Unit): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

