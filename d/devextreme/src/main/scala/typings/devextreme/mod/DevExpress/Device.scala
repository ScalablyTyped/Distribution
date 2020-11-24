package typings.devextreme.mod.DevExpress

import typings.devextreme.devextremeStrings.A
import typings.devextreme.devextremeStrings.B
import typings.devextreme.devextremeStrings.C
import typings.devextreme.devextremeStrings.android
import typings.devextreme.devextremeStrings.desktop
import typings.devextreme.devextremeStrings.generic
import typings.devextreme.devextremeStrings.ios
import typings.devextreme.devextremeStrings.phone
import typings.devextreme.devextremeStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  /**
    * [descr:Device.android]
    */
  var android: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Device.deviceType]
    */
  var deviceType: js.UndefOr[phone | tablet | desktop] = js.native
  
  /**
    * [descr:Device.generic]
    */
  var generic: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Device.grade]
    */
  var grade: js.UndefOr[A | B | C] = js.native
  
  /**
    * [descr:Device.ios]
    */
  var ios: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Device.phone]
    */
  var phone: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Device.platform]
    */
  var platform: js.UndefOr[android | ios | generic] = js.native
  
  /**
    * [descr:Device.tablet]
    */
  var tablet: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Device.version]
    */
  var version: js.UndefOr[js.Array[Double]] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: Boolean): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setDeviceType(value: phone | tablet | desktop): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceType: Self = this.set("deviceType", js.undefined)
    
    @scala.inline
    def setGeneric(value: Boolean): Self = this.set("generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneric: Self = this.set("generic", js.undefined)
    
    @scala.inline
    def setGrade(value: A | B | C): Self = this.set("grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrade: Self = this.set("grade", js.undefined)
    
    @scala.inline
    def setIos(value: Boolean): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
    
    @scala.inline
    def setPhone(value: Boolean): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios | generic): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setTablet(value: Boolean): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: Double*): Self = this.set("version", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
