package typings.dojo.dojox.color

import typings.dojo.dojo._base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/Palette.html
  *
  * An object that represents a palette of colors.
  * A Palette is a representation of a set of colors.  While the standard
  * number of colors contained in a palette is 5, it can really handle any
  * number of colors.
  *
  * A palette is useful for the ability to transform all the colors in it
  * using a simple object-based approach.  In addition, you can generate
  * palettes using dojox.color.Palette.generate; these generated palettes
  * are based on the palette generators at http://kuler.adobe.com.
  *
  * @param base
  */
@JSName("Palette")
@js.native
trait Palette_ extends js.Object {
  def apply(base: String): Unit = js.native
  def apply(base: js.Array[_]): Unit = js.native
  def apply(base: Color): Unit = js.native
  def apply(base: Palette): Unit = js.native
}

