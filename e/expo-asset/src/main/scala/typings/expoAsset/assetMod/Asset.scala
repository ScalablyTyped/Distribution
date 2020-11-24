package typings.expoAsset.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-asset/build/Asset", "Asset")
@js.native
class Asset protected () extends js.Object {
  def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  
  var _downloadCallbacks: js.Array[DownloadPromiseCallbacks] = js.native
  
  def downloadAsync(): js.Promise[this.type] = js.native
  
  var downloaded: Boolean = js.native
  
  var downloading: Boolean = js.native
  
  var hash: String | Null = js.native
  
  var height: Double | Null = js.native
  
  var localUri: String | Null = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
  
  var uri: String = js.native
  
  var width: Double | Null = js.native
}
/* static members */
@JSImport("expo-asset/build/Asset", "Asset")
@js.native
object Asset extends js.Object {
  
  def fromMetadata(meta: AssetMetadata): Asset = js.native
  
  def fromModule(virtualAssetModule: String): Asset = js.native
  def fromModule(virtualAssetModule: Double): Asset = js.native
  
  def fromURI(uri: String): Asset = js.native
  
  def loadAsync(moduleId: String): js.Promise[js.Array[Asset]] = js.native
  def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[Asset]] = js.native
  def loadAsync(moduleId: Double): js.Promise[js.Array[Asset]] = js.native
}
