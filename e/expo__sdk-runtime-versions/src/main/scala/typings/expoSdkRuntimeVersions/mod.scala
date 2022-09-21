package typings.expoSdkRuntimeVersions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/sdk-runtime-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/sdk-runtime-versions", "RUNTIME_VERSION_PREFIX")
  @js.native
  val RUNTIME_VERSION_PREFIX: /* "exposdk:" */ String = js.native
  
  inline def getRuntimeVersionForSDKVersion(sdkVersion: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeVersionForSDKVersion")(sdkVersion.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSDKVersionFromRuntimeVersion(runtimeVersion: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKVersionFromRuntimeVersion")(runtimeVersion.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isSDKVersionRuntimeVersion(runtimeVersion: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSDKVersionRuntimeVersion")(runtimeVersion.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
