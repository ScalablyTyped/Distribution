package typings.gdal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeoTransform extends js.Object {
  var geoTransform: js.Any
  var rasterSize: js.Any
}

object AnonGeoTransform {
  @scala.inline
  def apply(geoTransform: js.Any, rasterSize: js.Any): AnonGeoTransform = {
    val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGeoTransform]
  }
}

