package typings.expoAsset

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformUtilsMod {
  
  @JSImport("expo-asset/build/PlatformUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-asset/build/PlatformUtils", "IS_BARE_ENV_WITHOUT_UPDATES")
  @js.native
  val IS_BARE_ENV_WITHOUT_UPDATES: Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils", "IS_BARE_ENV_WITH_UPDATES")
  @js.native
  val IS_BARE_ENV_WITH_UPDATES: Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils", "IS_ENV_WITH_UPDATES_ENABLED")
  @js.native
  val IS_ENV_WITH_UPDATES_ENABLED: Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils", "IS_MANAGED_ENV")
  @js.native
  val IS_MANAGED_ENV: Boolean = js.native
  
  inline def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getLocalAssets(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalAssets")().asInstanceOf[js.Any]
  
  inline def getManifest(): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[StringDictionary[js.Any]]
  
  @JSImport("expo-asset/build/PlatformUtils", "manifestBaseUrl")
  @js.native
  val manifestBaseUrl: String | Null = js.native
}
