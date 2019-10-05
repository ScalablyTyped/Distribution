package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultRadialGradient.html
  *
  * An object specifying the default properties for RadialGradients using in fills patterns.
  *
  */
trait defaultRadialGradient extends js.Object {
  /**
    * An array of colors at given offsets (from the center of the radial gradient).
    * The center is defined at offest 0 with the outer edge of the gradient at offset 1.
    * Default value, [{ offset: 0, color: 'black'},{offset: 1, color: 'white'}], is a gradient from black to white.
    *
    */
  var colors: js.Array[_]
  /**
    * The X coordinate of the center of the radial gradient, default value 0.
    *
    */
  var cx: Double
  /**
    * The Y coordinate of the center of the radial gradient, default value 0.
    *
    */
  var cy: Double
  /**
    * The radius to the end of the radial gradient, default value 100.
    *
    */
  var r: Double
  /**
    * Specifies this is a RadialGradient, value 'radial'
    *
    */
  var `type`: String
}

object defaultRadialGradient {
  @scala.inline
  def apply(colors: js.Array[_], cx: Double, cy: Double, r: Double, `type`: String): defaultRadialGradient = {
    val __obj = js.Dynamic.literal(colors = colors, cx = cx, cy = cy, r = r)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultRadialGradient]
  }
}

