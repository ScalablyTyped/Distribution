package typings.expoAsset

import typings.expoAsset.assetMod.Asset
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/AssetHooks", JSImport.Namespace)
@js.native
object assetHooksMod extends js.Object {
  
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[Error]] = js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[Error]] = js.native
}
