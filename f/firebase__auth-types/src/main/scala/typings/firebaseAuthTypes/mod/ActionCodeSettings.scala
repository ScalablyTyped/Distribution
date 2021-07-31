package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.BundleId
import typings.firebaseAuthTypes.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCodeSettings extends StObject {
  
  var android: js.UndefOr[InstallApp] = js.undefined
  
  var dynamicLinkDomain: js.UndefOr[String] = js.undefined
  
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  
  var iOS: js.UndefOr[BundleId] = js.undefined
  
  var url: String
}
object ActionCodeSettings {
  
  @scala.inline
  def apply(url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  
  @scala.inline
  implicit class ActionCodeSettingsMutableBuilder[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: InstallApp): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setDynamicLinkDomain(value: String): Self = StObject.set(x, "dynamicLinkDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicLinkDomainUndefined: Self = StObject.set(x, "dynamicLinkDomain", js.undefined)
    
    @scala.inline
    def setHandleCodeInApp(value: Boolean): Self = StObject.set(x, "handleCodeInApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCodeInAppUndefined: Self = StObject.set(x, "handleCodeInApp", js.undefined)
    
    @scala.inline
    def setIOS(value: BundleId): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOSUndefined: Self = StObject.set(x, "iOS", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
