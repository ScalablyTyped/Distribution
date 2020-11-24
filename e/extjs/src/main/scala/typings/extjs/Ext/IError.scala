package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IError extends js.Object {
  
  /** [Property] (Boolean) */
  var ignore: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  @JSName("notify")
  var notify_FIError: js.UndefOr[Boolean] = js.native
  
  /** [Method] Provides a custom string representation of the error object
    * @returns String The error message. If raised from within the Ext 4 class system, the error message will also include the raising class and method names, if available.
    */
  @JSName("toString")
  var toString_FIError: js.UndefOr[js.Function0[java.lang.String]] = js.native
}
object IError {
  
  @scala.inline
  def apply(): IError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    
    @scala.inline
    def setToString(value: () => java.lang.String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
