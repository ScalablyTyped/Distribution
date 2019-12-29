package typings.expoDashAsset

import org.scalablytyped.runtime.StringDictionary
import typings.expoDashAsset.expoDashAssetBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/PlatformUtils", JSImport.Namespace)
@js.native
object buildPlatformUtilsMod extends js.Object {
  val IS_MANAGED_ENV: `true` = js.native
  val manifestBaseUrl: String | Null = js.native
  def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = js.native
  def getManifest(): StringDictionary[js.Any] = js.native
}

