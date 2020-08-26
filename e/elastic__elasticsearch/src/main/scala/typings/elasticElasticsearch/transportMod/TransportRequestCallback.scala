package typings.elasticElasticsearch.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportRequestCallback extends js.Object {
  def abort(): Unit = js.native
}

object TransportRequestCallback {
  @scala.inline
  def apply(abort: () => Unit): TransportRequestCallback = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[TransportRequestCallback]
  }
  @scala.inline
  implicit class TransportRequestCallbackOps[Self <: TransportRequestCallback] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
  }
  
}

