package typings.dojo.dojox.color

import typings.dojo.dojo._base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/NeutralColorModel.html
  *
  * Base class for color models that return a color from a data value
  * using an interpolation between two extremum colors around a neutral value.
  *
  * @param startColor The start color.
  * @param endColor       OptionalThe end color.
  */
@JSGlobal("dojox.color.NeutralColorModel")
@js.native
class NeutralColorModel protected () extends SimpleColorModel {
  def this(startColor: Color) = this()
  def this(startColor: Color, endColor: Color) = this()
  /**
    * Return the neutral value. This can be for example the mean or average value.
    * This function must be implemented by implementations.
    *
    * @param min The minimal value.
    * @param max The maximum value.
    * @param sum The sum of all values.
    * @param values The sorted array of values used to compute colors.
    */
  def computeNeutral(min: Double, max: Double, sum: Double, values: js.Array[Double]): Unit = js.native
  /**
    * Initialize the color model from a list of data items and using a function
    * that returns the value used to compute the color for a given item.
    *
    * @param items The data items.
    * @param colorFunc The function that returns the value used to compute the color for particular data item.
    */
  def initialize(items: js.Array[js.Object], colorFunc: js.Function): Unit = js.native
}

