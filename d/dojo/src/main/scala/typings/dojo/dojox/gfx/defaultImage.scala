package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultImage.html
  *
  * Defines the default Image prototype.
  *
  */
trait defaultImage extends js.Object {
  /**
    * The height of the image, default value 0.
    *
    */
  var height: Double
  /**
    * The src url of the image, defaults to empty string.
    *
    */
  var src: String
  /**
    * Specifies this object is an image, value 'image'.
    *
    */
  var `type`: String
  /**
    * The width of the image, default value 0.
    *
    */
  var width: Double
  /**
    * The X coordinate of the image's position, default value 0.
    *
    */
  var x: Double
  /**
    * The Y coordinate of the image's position, default value 0.
    *
    */
  var y: Double
}

object defaultImage {
  @scala.inline
  def apply(height: Double, src: String, `type`: String, width: Double, x: Double, y: Double): defaultImage = {
    val __obj = js.Dynamic.literal(height = height, src = src, width = width, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultImage]
  }
}

