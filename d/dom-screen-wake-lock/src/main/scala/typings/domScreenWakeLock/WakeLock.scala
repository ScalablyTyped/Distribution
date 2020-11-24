package typings.domScreenWakeLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows a document to acquire a screen wake lock.
  */
@js.native
trait WakeLock extends js.Object {
  
  /**
    * The request method will attempt to obtain a wake lock, and will return
    * a promise that will resolve with a sentinel to the obtained lock if
    * successful.
    *
    * If unsuccessful, the promise will reject with a "NotAllowedError"
    * DOMException. There are multiple different situations that may cause the
    * request to be unsucessful, including:
    *
    * 1. The _document_ is not allowed to use the wake lock feature.
    * 2. The _user-agent_ denied the specific type of wake lock.
    * 3. The _document_'s browsing context is `null`.
    * 4. The _document_ is not fully active.
    * 5. The _document_ is hidden.
    * 6. The request was aborted.
    *
    * @param type The type of wake lock to be requested.
    */
  def request(`type`: WakeLockType): js.Promise[WakeLockSentinel] = js.native
}
object WakeLock {
  
  @scala.inline
  def apply(request: WakeLockType => js.Promise[WakeLockSentinel]): WakeLock = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[WakeLock]
  }
  
  @scala.inline
  implicit class WakeLockOps[Self <: WakeLock] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: WakeLockType => js.Promise[WakeLockSentinel]): Self = this.set("request", js.Any.fromFunction1(value))
  }
}
