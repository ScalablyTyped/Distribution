package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait disconnectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See disconnectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.native
  /**
    * The callback to invoke if the disconnect fails. See disconnectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the disconnect succeeds. See disconnectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.native
}

object disconnectConfig {
  @scala.inline
  def apply(): disconnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[disconnectConfig]
  }
  @scala.inline
  implicit class disconnectConfigOps[Self <: disconnectConfig] (val x: Self) extends AnyVal {
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
    def setOnComplete(value: /* args */ baseResponseArgs => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnFailure(value: /* args */ baseFailureArgs => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* args */ baseResponseArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

