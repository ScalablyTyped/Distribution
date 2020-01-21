package typings.dojo.dojox.color

import typings.dojo.dojo.base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/MeanColorModel.html
  *
  * A color model that returns a color from a data value
  * using an interpolation between two extremum colors around the mean value.
  *
  * @param startColor The start color.
  * @param endColor       OptionalThe end color.
  */
@JSGlobal("dojox.color.MeanColorModel")
@js.native
class MeanColorModel protected () extends NeutralColorModel {
  def this(startColor: Color) = this()
  def this(startColor: Color, endColor: Color) = this()
}

