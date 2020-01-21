package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhoto extends js.Object {
  /** the maximum height of the image. */
  var height: Double
  /** contains any required attributions. This field will always be present, but may be empty. */
  var html_attributions: js.Array[String]
  /** a string used to identify the photo when you perform a Photo request. */
  var photo_reference: String
  /** the maximum width of the image. */
  var width: Double
}

object PlacePhoto {
  @scala.inline
  def apply(height: Double, html_attributions: js.Array[String], photo_reference: String, width: Double): PlacePhoto = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], photo_reference = photo_reference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlacePhoto]
  }
}

