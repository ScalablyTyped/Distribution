package typings.gdal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GeoTransform extends js.Object {
  var geoTransform: js.Any
  var rasterSize: js.Any
}

object Anon_GeoTransform {
  @scala.inline
  def apply(geoTransform: js.Any, rasterSize: js.Any): Anon_GeoTransform = {
    val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GeoTransform]
  }
}

