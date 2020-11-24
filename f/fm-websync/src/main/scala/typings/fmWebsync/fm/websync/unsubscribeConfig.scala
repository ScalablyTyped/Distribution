package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait unsubscribeConfig extends baseRequestConfig {
  
  /**
    * The channel from which the client should be unsubscribed. Must start with a forward slash (/). Overrides channels.
    */
  var channel: js.UndefOr[String] = js.native
  
  /**
    * The channels from which the client should be unsubscribed. Each must start with a forward slash (/). Overrides channel.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The callback to invoke after onSuccess or onFailure. See unsubscribeCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.native
  
  /**
    * The callback to invoke if the unsubscribe fails. See unsubscribeFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.native
  
  /**
    * The callback to invoke if the unsubscribe succeeds. See unsubscribeSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ unsubscribeSuccessArgs, Unit]] = js.native
}
object unsubscribeConfig {
  
  @scala.inline
  def apply(): unsubscribeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[unsubscribeConfig]
  }
  
  @scala.inline
  implicit class unsubscribeConfigOps[Self <: unsubscribeConfig] (val x: Self) extends AnyVal {
    
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
    def setOnComplete(value: /* args */ baseResponseArgs => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnFailure(value: /* args */ baseFailureArgs => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* args */ unsubscribeSuccessArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
