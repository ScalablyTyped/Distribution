package typings.eventToPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventToPromiseOptions extends js.Object {
  
  /**  If true, all parameters of the emitted events are put in an array which is used to resolve/reject the promise. (default: `false`) */
  var array: js.UndefOr[Boolean] = js.native
  
  /** The name of the event which rejects the promise. (default: `'error'`) */
  var error: js.UndefOr[String] = js.native
  
  /** Whether the error event should be ignored and not reject the promise. (default: `false`) */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}
object EventToPromiseOptions {
  
  @scala.inline
  def apply(): EventToPromiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventToPromiseOptions]
  }
  
  @scala.inline
  implicit class EventToPromiseOptionsOps[Self <: EventToPromiseOptions] (val x: Self) extends AnyVal {
    
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
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
  }
}
