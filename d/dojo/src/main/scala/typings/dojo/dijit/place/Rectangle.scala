package typings.dojo.dijit.place

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/place.__Rectangle.html
  *
  * 
  */
trait Rectangle extends js.Object {
  /**
    * height in pixels.   Can also be specified as "height" for backwards-compatibility.
    * 
    */
  var h: Double
  /**
    * width in pixels.   Can also be specified as "width" for backwards-compatibility.
    * 
    */
  var w: Double
  /**
    * horizontal offset in pixels, relative to document body
    * 
    */
  var x: Double
  /**
    * vertical offset in pixels, relative to document body
    * 
    */
  var y: Double
}

object Rectangle {
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): Rectangle = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

