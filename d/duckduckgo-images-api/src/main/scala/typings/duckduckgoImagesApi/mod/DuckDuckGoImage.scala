package typings.duckduckgoImagesApi.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DuckDuckGoImage]
  }
}

