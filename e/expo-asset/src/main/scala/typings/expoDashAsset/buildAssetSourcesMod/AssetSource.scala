package typings.expoDashAsset.buildAssetSourcesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSource extends js.Object {
  var hash: String
  var uri: String
}

object AssetSource {
  @scala.inline
  def apply(hash: String, uri: String): AssetSource = {
    val __obj = js.Dynamic.literal(hash = hash, uri = uri)
  
    __obj.asInstanceOf[AssetSource]
  }
}

