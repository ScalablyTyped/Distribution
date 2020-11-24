package typings.esfxCancelable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelSignal extends js.Object {
  
  /**
    * Gets a value indicating whether cancellation was signaled.
    */
  val signaled: Boolean = js.native
  
  /**
    * Subscribes to notifications for when the object becomes signaled.
    */
  def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription = js.native
}
object CancelSignal {
  
  @scala.inline
  def apply(signaled: Boolean, subscribe: js.Function0[Unit] => CancelSubscription): CancelSignal = {
    val __obj = js.Dynamic.literal(signaled = signaled.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[CancelSignal]
  }
  
  @scala.inline
  implicit class CancelSignalOps[Self <: CancelSignal] (val x: Self) extends AnyVal {
    
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
    def setSignaled(value: Boolean): Self = this.set("signaled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribe(value: js.Function0[Unit] => CancelSubscription): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
