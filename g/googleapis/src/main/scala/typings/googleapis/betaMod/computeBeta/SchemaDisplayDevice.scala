package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of Display Device options
  */
@js.native
trait SchemaDisplayDevice extends js.Object {
  
  /**
    * Defines whether the instance has Display enabled.
    */
  var enableDisplay: js.UndefOr[Boolean] = js.native
}
object SchemaDisplayDevice {
  
  @scala.inline
  def apply(): SchemaDisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayDevice]
  }
  
  @scala.inline
  implicit class SchemaDisplayDeviceOps[Self <: SchemaDisplayDevice] (val x: Self) extends AnyVal {
    
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
    def setEnableDisplay(value: Boolean): Self = this.set("enableDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDisplay: Self = this.set("enableDisplay", js.undefined)
  }
}
