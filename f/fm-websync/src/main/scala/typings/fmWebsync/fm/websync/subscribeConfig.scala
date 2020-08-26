package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subscribeConfig extends baseRequestConfig {
  /**
    * The channel to which the client should be subscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * The channels to which the client should be subscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The callback to invoke after onSuccess or onFailure. See subscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ subscribeCompleteArgs, Unit]] = js.native
  /**
    * (OptionalThe callback to invoke if the subscribe fails. See subscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ subscribeFailureArgs, Unit]] = js.native
  /**
    * The callback to invoke when data is received on the channel(s). See receiveArgs for callback argument details.
    */
  var onReceive: js.UndefOr[js.Function1[/* args */ receiveArgs, Unit]] = js.native
  /**
    * Subscribers extension. The callback to invoke when a subscribers change notification is received (i.e. when a client subscribes to or unsubscribes from the channel(s)).
    * The current subscribe request will trigger this callback. See subscribersChangeArgs for callback argument details.
    */
  var onSubscribersChange: js.UndefOr[js.Function1[/* args */ subscribersChangeArgs, Unit]] = js.native
  /**
    * The callback to invoke if the subscribe succeeds. See subscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ subscribeSuccessArgs, Unit]] = js.native
}

object subscribeConfig {
  @scala.inline
  def apply(): subscribeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[subscribeConfig]
  }
  @scala.inline
  implicit class subscribeConfigOps[Self <: subscribeConfig] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setOnComplete(value: /* args */ subscribeCompleteArgs => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnFailure(value: /* args */ subscribeFailureArgs => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    @scala.inline
    def setOnReceive(value: /* args */ receiveArgs => Unit): Self = this.set("onReceive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReceive: Self = this.set("onReceive", js.undefined)
    @scala.inline
    def setOnSubscribersChange(value: /* args */ subscribersChangeArgs => Unit): Self = this.set("onSubscribersChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscribersChange: Self = this.set("onSubscribersChange", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* args */ subscribeSuccessArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

