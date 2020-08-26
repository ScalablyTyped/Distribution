package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectConfig extends baseRequestConfig {
  /**
    * The callback to invoke after onSuccess or onFailure. See connectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ connectCompleteArgs, Unit]] = js.native
  /**
    * The callback to invoke if the connect fails. Defaults to an alert of the error. See connectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ connectFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the streaming connection fails. See streamFailureArgs for callback argument details.
    * This method will be invoked if (a) the connection was lost, automatic retries succeeded, but the client had idled on the server (and so needs to reconnect),
    * or (b) the connection was lost and automatic retries failed. In the former case, willReconnect is true, and in the latter case, willReconnect is false.
    * See client for more details on these two scenarios.
    * If willReconnect is true, the client will automatically reconnect. If the reconnect succeeds, the callback specified by onSuccess will be invoked with isReconnect set to true.
    * If the reconnect fails, the callback specified by onFailure will be invoked with isReconnect set to false.
    * With the exception of UI updates, invocations of this callback with willReconnect set to true can be ignored.
    */
  var onStreamFailure: js.UndefOr[js.Function1[/* args */ streamFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke if the connect succeeds. See connectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ connectSuccessArgs, Unit]] = js.native
  /**
    * The callback to invoke when a message is received on a channel that has no local callback specified to handle it. See receiveArgs for callback argument details.
    * This can occur if (a) a client is manually subscribed to a channel by the server or (b) a client subscribed to a channel and then manually removed the local callback using client.
    */
  var onUnhandledReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, Unit]] = js.native
  /**
    * Whether to always attempt to stay connected in the event of network failure. If true, the client will continually reconnect, even after exhausting the specified number
    * of retries specified by initializeConfig.retries. If false, the client will stop reconnecting if all retry attempts fail.
    */
  var stayConnected: js.UndefOr[Boolean] = js.native
}

object connectConfig {
  @scala.inline
  def apply(): connectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[connectConfig]
  }
  @scala.inline
  implicit class connectConfigOps[Self <: connectConfig] (val x: Self) extends AnyVal {
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
    def setOnComplete(value: /* args */ connectCompleteArgs => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnFailure(value: /* args */ connectFailureArgs => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnStreamFailure(value: /* args */ streamFailureArgs => Unit): Self = this.set("onStreamFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStreamFailure: Self = this.set("onStreamFailure", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* args */ connectSuccessArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setOnUnhandledReceive(value: /* args */ receiveArgs => Unit): Self = this.set("onUnhandledReceive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnhandledReceive: Self = this.set("onUnhandledReceive", js.undefined)
    @scala.inline
    def setStayConnected(value: Boolean): Self = this.set("stayConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStayConnected: Self = this.set("stayConnected", js.undefined)
  }
  
}

