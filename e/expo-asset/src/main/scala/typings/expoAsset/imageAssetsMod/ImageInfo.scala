package typings.expoAsset.imageAssetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var height: Double
  var name: String
  var width: Double
}

object ImageInfo {
  @scala.inline
  def apply(height: Double, name: String, width: Double): ImageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageInfo]
  }
}

