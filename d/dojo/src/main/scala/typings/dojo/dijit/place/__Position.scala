package typings.dojo.dijit.place

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/place.__Position.html
  *
  * 
  */
trait __Position extends js.Object {
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

object __Position {
  @scala.inline
  def apply(x: Double, y: Double): __Position = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[__Position]
  }
}

