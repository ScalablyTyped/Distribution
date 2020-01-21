package typings.dojo.dojox.color

import typings.dojo.dojo.base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/SimpleColorModel.html
  *
  * Base class for color models that return a color from a data value
  * using an interpolation between two extremum colors.
  *
  * @param startColor The start color.
  * @param endColor       OptionalThe end color.
  */
@JSGlobal("dojox.color.SimpleColorModel")
@js.native
class SimpleColorModel protected () extends js.Object {
  def this(startColor: Color) = this()
  def this(startColor: Color, endColor: Color) = this()
  /**
    * return the color for a given data value.
    *
    * @param value The data value.
    */
  def getColor(value: Double): js.Any = js.native
  /**
    * Return the normalized (between 0 and 1) value for a given data value.
    * This function must be implemented by implementations.
    *
    * @param value The data value.
    */
  def getNormalizedValue(value: Double): Unit = js.native
}

