package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhoto extends js.Object {
  /** the maximum height of the image. */
  var height: scala.Double
  /** contains any required attributions. This field will always be present, but may be empty. */
  var html_attributions: js.Array[java.lang.String]
  /** a string used to identify the photo when you perform a Photo request. */
  var photo_reference: java.lang.String
  /** the maximum width of the image. */
  var width: scala.Double
}

object PlacePhoto {
  @scala.inline
  def apply(
    height: scala.Double,
    html_attributions: js.Array[java.lang.String],
    photo_reference: java.lang.String,
    width: scala.Double
  ): PlacePhoto = {
    val __obj = js.Dynamic.literal(height = height, html_attributions = html_attributions, photo_reference = photo_reference, width = width)
  
    __obj.asInstanceOf[PlacePhoto]
  }
}

