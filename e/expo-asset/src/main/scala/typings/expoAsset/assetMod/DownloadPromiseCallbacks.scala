package typings.expoAsset.assetMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPromiseCallbacks extends js.Object {
  def reject(error: Error): Unit = js.native
  def resolve(): Unit = js.native
}

object DownloadPromiseCallbacks {
  @scala.inline
  def apply(reject: Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[DownloadPromiseCallbacks]
  }
  @scala.inline
  implicit class DownloadPromiseCallbacksOps[Self <: DownloadPromiseCallbacks] (val x: Self) extends AnyVal {
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
    def setReject(value: Error => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: () => Unit): Self = this.set("resolve", js.Any.fromFunction0(value))
  }
  
}

