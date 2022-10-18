package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlatformUtilsDotwebMod {
  
  @JSImport("expo-asset/build/PlatformUtils.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_ENV_WITHOUT_UPDATES_ENABLED")
  @js.native
  val IS_ENV_WITHOUT_UPDATES_ENABLED: /* false */ Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_ENV_WITH_UPDATES_ENABLED")
  @js.native
  val IS_ENV_WITH_UPDATES_ENABLED: /* false */ Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_MANAGED_ENV")
  @js.native
  val IS_MANAGED_ENV: /* false */ Boolean = js.native
  
  inline def downloadAsync(uri: Any, hash: Any, `type`: Any, name: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadAsync")(uri.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getManifest(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[js.Object]
  
  inline def getManifest2(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest2")().asInstanceOf[js.Object]
  
  @JSImport("expo-asset/build/PlatformUtils.web", "manifestBaseUrl")
  @js.native
  val manifestBaseUrl: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
}
