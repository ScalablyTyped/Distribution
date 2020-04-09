package typings.expoAsset

import typings.expoAsset.expoAssetBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/PlatformUtils.web", JSImport.Namespace)
@js.native
object platformUtilsWebMod extends js.Object {
  val IS_ENV_WITHOUT_UPDATES_ENABLED: `false` = js.native
  val IS_ENV_WITH_UPDATES_ENABLED: `false` = js.native
  val IS_MANAGED_ENV: `false` = js.native
  val manifestBaseUrl: Null = js.native
  def downloadAsync(uri: js.Any, hash: js.Any, `type`: js.Any, name: js.Any): js.Promise[String] = js.native
  def getManifest(): js.Object = js.native
}

