package typings.duckduckgoDashImagesDashApi.duckduckgoDashImagesDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuckDuckGoImage extends js.Object {
  var height: Double
  var image: String
  var source: String
  var thumbnail: String
  var title: String
  var url: String
  var width: Double
}

object DuckDuckGoImage {
  @scala.inline
  def apply(
    height: Double,
    image: String,
    source: String,
    thumbnail: String,
    title: String,
    url: String,
    width: Double
  ): DuckDuckGoImage = {
    val __obj = js.Dynamic.literal(height = height, image = image, source = source, thumbnail = thumbnail, title = title, url = url, width = width)
  
    __obj.asInstanceOf[DuckDuckGoImage]
  }
}

