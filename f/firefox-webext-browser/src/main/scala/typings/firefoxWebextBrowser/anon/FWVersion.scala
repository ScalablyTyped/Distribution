package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FWVersion extends js.Object {
  
  var FWVersion: String = js.native
  
  var HWVersion: String = js.native
  
  var isLoggedIn: String = js.native
  
  var manufacturer: String = js.native
  
  var name: String = js.native
  
  var serial: String = js.native
}
object FWVersion {
  
  @scala.inline
  def apply(
    FWVersion: String,
    HWVersion: String,
    isLoggedIn: String,
    manufacturer: String,
    name: String,
    serial: String
  ): FWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion.asInstanceOf[js.Any], HWVersion = HWVersion.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[FWVersion]
  }
  
  @scala.inline
  implicit class FWVersionOps[Self <: FWVersion] (val x: Self) extends AnyVal {
    
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
    def setFWVersion(value: String): Self = this.set("FWVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHWVersion(value: String): Self = this.set("HWVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoggedIn(value: String): Self = this.set("isLoggedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
  }
}
