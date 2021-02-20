package typings.expoAsset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformUtilsWebMod {
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_ENV_WITHOUT_UPDATES_ENABLED")
  @js.native
  val IS_ENV_WITHOUT_UPDATES_ENABLED: /* false */ Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_ENV_WITH_UPDATES_ENABLED")
  @js.native
  val IS_ENV_WITH_UPDATES_ENABLED: /* false */ Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "IS_MANAGED_ENV")
  @js.native
  val IS_MANAGED_ENV: /* false */ Boolean = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "downloadAsync")
  @js.native
  def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "getManifest")
  @js.native
  def getManifest(): js.Object = js.native
  
  @JSImport("expo-asset/build/PlatformUtils.web", "manifestBaseUrl")
  @js.native
  val manifestBaseUrl: Null = js.native
}
