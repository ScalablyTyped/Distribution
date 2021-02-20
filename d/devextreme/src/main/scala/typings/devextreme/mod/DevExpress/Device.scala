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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
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
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setDeviceType(value: phone | tablet | desktop): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    @scala.inline
    def setGeneric(value: Boolean): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    @scala.inline
    def setGrade(value: A | B | C): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    @scala.inline
    def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    @scala.inline
    def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPlatform(value: android | ios | generic): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
