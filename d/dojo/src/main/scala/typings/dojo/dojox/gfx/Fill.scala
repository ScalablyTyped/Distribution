package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Fill.html
  *
  * Defines how to fill a shape. Four types of fills can be used: solid, linear gradient, radial gradient and pattern.
  * See dojox/gfx.LinearGradient, dojox/gfx.RadialGradient and dojox/gfx.Pattern respectively for more information about the properties supported by each type.
  *
  */
trait Fill extends js.Object {
  /**
    * The color of a solid fill type.
    *
    */
  var color: String
  /**
    * The type of fill. One of 'linear', 'radial', 'pattern' or undefined. If not specified, a solid fill is assumed.
    *
    */
  var `type`: js.Object
}

object Fill {
  @scala.inline
  def apply(color: String, `type`: js.Object): Fill = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
}

