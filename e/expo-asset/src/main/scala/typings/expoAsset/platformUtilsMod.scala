package typings.expoAsset

import org.scalablytyped.runtime.StringDictionary
import typings.expoAsset.expoAssetBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/PlatformUtils", JSImport.Namespace)
@js.native
object platformUtilsMod extends js.Object {
  val IS_MANAGED_ENV: `true` = js.native
  val manifestBaseUrl: String | Null = js.native
  def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = js.native
  def getManifest(): StringDictionary[js.Any] = js.native
}

