package typings.expoAsset

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/PlatformUtils", JSImport.Namespace)
@js.native
object platformUtilsMod extends js.Object {
  
  val IS_BARE_ENV_WITHOUT_UPDATES: Boolean = js.native
  
  val IS_BARE_ENV_WITH_UPDATES: Boolean = js.native
  
  val IS_ENV_WITH_UPDATES_ENABLED: Boolean = js.native
  
  val IS_MANAGED_ENV: Boolean = js.native
  
  def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = js.native
  
  def getLocalAssets(): js.Any = js.native
  
  def getManifest(): StringDictionary[js.Any] = js.native
  
  val manifestBaseUrl: String | Null = js.native
}
