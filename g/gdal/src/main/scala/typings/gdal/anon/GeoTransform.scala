package typings.gdal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoTransform extends js.Object {
  var geoTransform: js.Any
  var rasterSize: js.Any
}

object GeoTransform {
  @scala.inline
  def apply(geoTransform: js.Any, rasterSize: js.Any): GeoTransform = {
    val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoTransform]
  }
}

