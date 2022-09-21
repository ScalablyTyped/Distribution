package typings.firebaseAuth.distSrcModelPublicTypesMod

import typings.firebaseAuth.anon.BundleId
import typings.firebaseAuth.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCodeSettings extends StObject {
  
  /**
    * Sets the Android package name.
    *
    * @remarks
    * This will try to open the link in an android app if it is
    * installed. If `installApp` is passed, it specifies whether to install the Android app if the
    * device supports it and the app is not already installed. If this field is provided without
    * a `packageName`, an error is thrown explaining that the `packageName` must be provided in
    * conjunction with this field. If `minimumVersion` is specified, and an older version of the
    * app is installed, the user is taken to the Play Store to upgrade the app.
    */
  var android: js.UndefOr[InstallApp] = js.undefined
  
  /**
    * When multiple custom dynamic link domains are defined for a project, specify which one to use
    * when the link is to be opened via a specified mobile app (for example, `example.page.link`).
    *
    *
    * @defaultValue The first domain is automatically selected.
    */
  var dynamicLinkDomain: js.UndefOr[String] = js.undefined
  
  /**
    * When set to true, the action code link will be be sent as a Universal Link or Android App
    * Link and will be opened by the app if installed.
    *
    * @remarks
    * In the false case, the code will be sent to the web widget first and then on continue will
    * redirect to the app if installed.
    *
    * @defaultValue false
    */
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the iOS bundle ID.
    *
    * @remarks
    * This will try to open the link in an iOS app if it is installed.
    *
    * App installation is not supported for iOS.
    */
  var iOS: js.UndefOr[BundleId] = js.undefined
  
  /**
    * Sets the link continue/state URL.
    *
    * @remarks
    * This has different meanings in different contexts:
    * - When the link is handled in the web action widgets, this is the deep link in the
    * `continueUrl` query parameter.
    * - When the link is handled in the app directly, this is the `continueUrl` query parameter in
    * the deep link of the Dynamic Link.
    */
  var url: String
}
object ActionCodeSettings {
  
  inline def apply(url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  
  extension [Self <: ActionCodeSettings](x: Self) {
    
    inline def setAndroid(value: InstallApp): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    inline def setDynamicLinkDomain(value: String): Self = StObject.set(x, "dynamicLinkDomain", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinkDomainUndefined: Self = StObject.set(x, "dynamicLinkDomain", js.undefined)
    
    inline def setHandleCodeInApp(value: Boolean): Self = StObject.set(x, "handleCodeInApp", value.asInstanceOf[js.Any])
    
    inline def setHandleCodeInAppUndefined: Self = StObject.set(x, "handleCodeInApp", js.undefined)
    
    inline def setIOS(value: BundleId): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    inline def setIOSUndefined: Self = StObject.set(x, "iOS", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
