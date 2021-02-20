package typings.firebase.mod.firebase.auth

import typings.firebase.anon.BundleId
import typings.firebase.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the interface that defines the required continue/state URL with
  * optional Android and iOS bundle identifiers.
  * The action code setting fields are:
  * <ul>
  * <li><p>url: Sets the link continue/state URL, which has different meanings
  *     in different contexts:</p>
  *     <ul>
  *     <li>When the link is handled in the web action widgets, this is the deep
  *         link in the continueUrl query parameter.</li>
  *     <li>When the link is handled in the app directly, this is the continueUrl
  *         query parameter in the deep link of the Dynamic Link.</li>
  *     </ul>
  *     </li>
  * <li>iOS: Sets the iOS bundle ID. This will try to open the link in an iOS app
  *     if it is installed.</li>
  * <li>android: Sets the Android package name. This will try to open the link in
  *     an android app if it is installed. If installApp is passed, it specifies
  *     whether to install the Android app if the device supports it and the app
  *     is not already installed. If this field is provided without a
  *     packageName, an error is thrown explaining that the packageName must be
  *     provided in conjunction with this field.
  *     If minimumVersion is specified, and an older version of the app is
  *     installed, the user is taken to the Play Store to upgrade the app.</li>
  * <li>handleCodeInApp: The default is false. When set to true, the action code
  *     link will be be sent as a Universal Link or Android App Link and will be
  *     opened by the app if installed. In the false case, the code will be sent
  *     to the web widget first and then on continue will redirect to the app if
  *     installed.</li>
  * </ul>
  */
@js.native
trait ActionCodeSettings extends StObject {
  
  var android: js.UndefOr[InstallApp] = js.native
  
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  
  var handleCodeInApp: js.UndefOr[Boolean] = js.native
  
  var iOS: js.UndefOr[BundleId] = js.native
  
  var url: String = js.native
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
