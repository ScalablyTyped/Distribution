package typings.dojo.dijit.place

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/place.__Position.html
  *
  * 
  */
trait Position extends js.Object {
  /**
    * horizontal coordinate in pixels, relative to document body
    * 
    */
  var x: Double
  /**
    * vertical coordinate in pixels, relative to document body
    * 
    */
  var y: Double
}

object Position {
  @scala.inline
  def apply(x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Position]
  }
}

