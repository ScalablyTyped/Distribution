package typings.expoAsset

import typings.expoAsset.assetMod.Asset
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetHooksMod {
  
  @JSImport("expo-asset/build/AssetHooks", "useAssets")
  @js.native
  def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[Error]] = js.native
  @JSImport("expo-asset/build/AssetHooks", "useAssets")
  @js.native
  def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[Error]] = js.native
}
