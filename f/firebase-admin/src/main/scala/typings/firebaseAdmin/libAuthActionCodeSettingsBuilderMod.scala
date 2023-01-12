package typings.firebaseAdmin

import typings.firebaseAdmin.anon.BundleId
import typings.firebaseAdmin.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthActionCodeSettingsBuilderMod {
  
  trait ActionCodeSettings extends StObject {
    
    /**
      * Defines the Android package name. This will try to open the link in an
      * android app if it is installed. If `installApp` is passed, it specifies
      * whether to install the Android app if the device supports it and the app is
      * not already installed. If this field is provided without a `packageName`, an
      * error is thrown explaining that the `packageName` must be provided in
      * conjunction with this field. If `minimumVersion` is specified, and an older
      * version of the app is installed, the user is taken to the Play Store to
      * upgrade the app.
      */
    var android: js.UndefOr[InstallApp] = js.undefined
    
    /**
      * Defines the dynamic link domain to use for the current link if it is to be
      * opened using Firebase Dynamic Links, as multiple dynamic link domains can be
      * configured per project. This field provides the ability to explicitly choose
      * configured per project. This fields provides the ability explicitly choose
      * one. If none is provided, the oldest domain is used by default.
      */
    var dynamicLinkDomain: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to open the link via a mobile app or a browser.
      * The default is false. When set to true, the action code link is sent
      * as a Universal Link or Android App Link and is opened by the app if
      * installed. In the false case, the code is sent to the web widget first
      * and then redirects to the app if installed.
      */
    var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the iOS bundle ID. This will try to open the link in an iOS app if it
      * is installed.
      */
    var iOS: js.UndefOr[BundleId] = js.undefined
    
    /**
      * Defines the link continue/state URL, which has different meanings in
      * different contexts:
      * <ul>
      * <li>When the link is handled in the web action widgets, this is the deep
      *     link in the `continueUrl` query parameter.</li>
      * <li>When the link is handled in the app directly, this is the `continueUrl`
      *     query parameter in the deep link of the Dynamic Link.</li>
      * </ul>
      */
    var url: String
  }
  object ActionCodeSettings {
    
    inline def apply(url: String): ActionCodeSettings = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionCodeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
      
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
}
