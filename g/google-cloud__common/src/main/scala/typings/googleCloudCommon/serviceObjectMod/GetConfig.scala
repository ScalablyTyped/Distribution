package typings.googleCloudCommon.serviceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConfig extends js.Object {
  
  /**
    * Create the object if it doesn't already exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
}
object GetConfig {
  
  @scala.inline
  def apply(): GetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfig]
  }
  
  @scala.inline
  implicit class GetConfigOps[Self <: GetConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
  }
}
