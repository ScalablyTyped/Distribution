package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Theme.html
  *
  * A Theme is a pre-defined object, primarily JSON-based, that makes up the definitions to
  * style a chart. It extends SimpleTheme with additional features like color definition by
  * palettes and gradients definition.
  *
  * @param kwArgs
  */
@JSGlobal("dojox.charting.Theme")
@js.native
class Theme_ protected () extends SimpleTheme {
  def this(kwArgs: js.Any) = this()
  /**
    * Generate a set of colors for the theme based on keyword
    * arguments.
    *
    * @param kwArgs The arguments object used to define colors.
    */
  def defineColors(kwArgs: js.Object): js.Any = js.native
  /**
    *
    * @param fillPattern
    * @param colorFrom
    * @param colorTo
    */
  def generateGradient(fillPattern: js.Any, colorFrom: js.Any, colorTo: js.Any): js.Any = js.native
  /**
    *
    * @param color
    * @param luminance
    */
  def generateHslColor(color: js.Any, luminance: js.Any): js.Any = js.native
  /**
    *
    * @param color
    * @param fillPattern
    * @param lumFrom
    * @param lumTo
    */
  def generateHslGradient(color: js.Any, fillPattern: js.Any, lumFrom: js.Any, lumTo: js.Any): js.Any = js.native
}

