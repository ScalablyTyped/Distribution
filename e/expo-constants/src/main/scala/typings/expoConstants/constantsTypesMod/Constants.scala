package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constants
  extends StObject
     with NativeConstants {
  
  /**
    * @hidden
    * @warning do not use this property. Use `manifest` by default.
    *
    * In certain cases accessing manifest via this property
    * suppresses important warning about missing manifest.
    */
  var __unsafeNoWarnManifest: js.UndefOr[AppManifest] = js.undefined
  
  /**
    * @hidden
    * @warning do not use this property. Use `manifest2` by default.
    *
    * In certain cases accessing manifest via this property
    * suppresses important warning about missing manifest.
    */
  var __unsafeNoWarnManifest2: js.UndefOr[Manifest] = js.undefined
}
object Constants {
  
  inline def apply(
    debugMode: Boolean,
    executionEnvironment: ExecutionEnvironment,
    experienceUrl: String,
    getWebViewUserAgentAsync: () => js.Promise[String | Null],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String]
  ): Constants = {
    val __obj = js.Dynamic.literal(debugMode = debugMode.asInstanceOf[js.Any], executionEnvironment = executionEnvironment.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], name = "ExponentConstants", sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any], appOwnership = null, deviceYearClass = null, expoConfig = null, expoRuntimeVersion = null, expoVersion = null, manifest = null, manifest2 = null, nativeAppVersion = null, nativeBuildVersion = null)
    __obj.asInstanceOf[Constants]
  }
  
  extension [Self <: Constants](x: Self) {
    
    inline def set__unsafeNoWarnManifest(value: AppManifest): Self = StObject.set(x, "__unsafeNoWarnManifest", value.asInstanceOf[js.Any])
    
    inline def set__unsafeNoWarnManifest2(value: Manifest): Self = StObject.set(x, "__unsafeNoWarnManifest2", value.asInstanceOf[js.Any])
    
    inline def set__unsafeNoWarnManifest2Undefined: Self = StObject.set(x, "__unsafeNoWarnManifest2", js.undefined)
    
    inline def set__unsafeNoWarnManifestUndefined: Self = StObject.set(x, "__unsafeNoWarnManifest", js.undefined)
  }
}
