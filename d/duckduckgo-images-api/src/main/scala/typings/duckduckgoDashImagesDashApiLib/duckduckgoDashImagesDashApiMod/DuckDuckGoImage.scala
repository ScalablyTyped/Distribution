package typings
package duckduckgoDashImagesDashApiLib.duckduckgoDashImagesDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuckDuckGoImage extends js.Object {
  var height: scala.Double
  var image: java.lang.String
  var source: java.lang.String
  var thumbnail: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
  var width: scala.Double
}

object DuckDuckGoImage {
  @scala.inline
  def apply(
    height: scala.Double,
    image: java.lang.String,
    source: java.lang.String,
    thumbnail: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    width: scala.Double
  ): DuckDuckGoImage = {
    val __obj = js.Dynamic.literal(height = height, image = image, source = source, thumbnail = thumbnail, title = title, url = url, width = width)
  
    __obj.asInstanceOf[DuckDuckGoImage]
  }
}

