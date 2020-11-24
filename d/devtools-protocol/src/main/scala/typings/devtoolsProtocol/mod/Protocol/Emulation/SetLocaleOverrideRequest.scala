package typings.devtoolsProtocol.mod.Protocol.Emulation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLocaleOverrideRequest extends js.Object {
  
  /**
    * ICU style C locale (e.g. "en_US"). If not specified or empty, disables the override and
    * restores default host system locale.
    */
  var locale: js.UndefOr[String] = js.native
}
object SetLocaleOverrideRequest {
  
  @scala.inline
  def apply(): SetLocaleOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLocaleOverrideRequest]
  }
  
  @scala.inline
  implicit class SetLocaleOverrideRequestOps[Self <: SetLocaleOverrideRequest] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
