package typings.expoDashAsset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/EmbeddedAssets", JSImport.Namespace)
@js.native
object buildEmbeddedAssetsMod extends js.Object {
  def getEmbeddedAssetUri(hash: String): String | Null = js.native
  def getEmbeddedAssetUri(hash: String, `type`: String): String | Null = js.native
}

