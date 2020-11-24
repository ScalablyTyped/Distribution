package typings.ethereumjsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hardforkOptions extends js.Object {
  
  /** optional, only active HFs (default: false) */
  var onlyActive: js.UndefOr[Boolean] = js.native
  
  /** optional, only allow supported HFs (default: false) */
  var onlySupported: js.UndefOr[Boolean] = js.native
}
object hardforkOptions {
  
  @scala.inline
  def apply(): hardforkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hardforkOptions]
  }
  
  @scala.inline
  implicit class hardforkOptionsOps[Self <: hardforkOptions] (val x: Self) extends AnyVal {
    
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
    def setOnlyActive(value: Boolean): Self = this.set("onlyActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyActive: Self = this.set("onlyActive", js.undefined)
    
    @scala.inline
    def setOnlySupported(value: Boolean): Self = this.set("onlySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySupported: Self = this.set("onlySupported", js.undefined)
  }
}
