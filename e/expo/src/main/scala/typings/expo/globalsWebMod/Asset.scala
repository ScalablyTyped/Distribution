package typings.expo.globalsWebMod

import typings.expoAsset.assetMod.AssetDescriptor
import typings.expoAsset.assetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/globals.web", "Asset")
@js.native
class Asset protected ()
  extends typings.expoAsset.mod.Asset {
  def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
}

/* static members */
@JSImport("expo/build/globals.web", "Asset")
@js.native
object Asset extends js.Object {
  def fromMetadata(meta: AssetMetadata): typings.expoAsset.assetMod.Asset = js.native
  def fromModule(virtualAssetModule: String): typings.expoAsset.assetMod.Asset = js.native
  def fromModule(virtualAssetModule: Double): typings.expoAsset.assetMod.Asset = js.native
  def fromURI(uri: String): typings.expoAsset.assetMod.Asset = js.native
  def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
  def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
}

