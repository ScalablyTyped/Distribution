package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.LinearGradient.html
  *
  * An object defining the default stylistic properties used for Linear Gradient fills.
  * Linear gradients are drawn along a virtual line, which results in appearance of a rotated pattern in a given direction/orientation.
  *
  */
trait LinearGradient extends js.Object {
  /**
    * An array of colors at given offsets (from the start of the line).  The start of the line is
    * defined at offest 0 with the end of the line at offset 1.
    * Default value, [{ offset: 0, color: 'black'},{offset: 1, color: 'white'}], is a gradient from black to white.
    *
    */
  var colors: js.Array[_]
  /**
    * Specifies this object is a Linear Gradient, value 'linear'
    *
    */
  var `type`: String
  /**
    * The X coordinate of the start of the virtual line along which the gradient is drawn, default value 0.
    *
    */
  var x1: Double
  /**
    * The X coordinate of the end of the virtual line along which the gradient is drawn, default value 100.
    *
    */
  var x2: Double
  /**
    * The Y coordinate of the start of the virtual line along which the gradient is drawn, default value 0.
    *
    */
  var y1: Double
  /**
    * The Y coordinate of the end of the virtual line along which the gradient is drawn, default value 100.
    *
    */
  var y2: Double
}

object LinearGradient {
  @scala.inline
  def apply(colors: js.Array[_], `type`: String, x1: Double, x2: Double, y1: Double, y2: Double): LinearGradient = {
    val __obj = js.Dynamic.literal(colors = colors, x1 = x1, x2 = x2, y1 = y1, y2 = y2)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LinearGradient]
  }
}

