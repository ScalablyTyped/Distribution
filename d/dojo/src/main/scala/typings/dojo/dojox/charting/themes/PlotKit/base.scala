package typings.dojo.dojox.charting.themes.PlotKit

import typings.dojo.dojo.base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/themes/PlotKit/base.html
  *
  *
  */
trait base extends js.Object {
  /**
    *
    */
  var Adobebricks: js.Object
  /**
    *
    */
  var Algae: js.Object
  /**
    *
    */
  var Bahamation: js.Object
  /**
    *
    */
  var BlueDusk: js.Object
  /**
    *
    */
  var Charged: js.Object
  /**
    *
    */
  var Chris: js.Object
  /**
    *
    */
  var Claro: js.Object
  /**
    *
    */
  var CubanShirts: js.Object
  /**
    *
    */
  var Desert: js.Object
  /**
    *
    */
  var Distinctive: js.Object
  /**
    *
    */
  var Dollar: js.Object
  /**
    *
    */
  var Electric: js.Object
  /**
    *
    */
  var Grasshopper: js.Object
  /**
    *
    */
  var Grasslands: js.Object
  /**
    *
    */
  var GreySkies: js.Object
  /**
    *
    */
  var Harmony: js.Object
  /**
    *
    */
  var IndigoNation: js.Object
  /**
    *
    */
  var Ireland: js.Object
  /**
    *
    */
  var Julie: js.Object
  /**
    *
    */
  var MiamiNice: js.Object
  /**
    *
    */
  var Midwest: js.Object
  /**
    *
    */
  var Minty: js.Object
  /**
    *
    */
  var PrimaryColors: js.Object
  /**
    *
    */
  var PurpleRain: js.Object
  /**
    *
    */
  var Renkoo: js.Object
  /**
    *
    */
  var RoyalPurples: js.Object
  /**
    *
    */
  var SageToLime: js.Object
  /**
    *
    */
  var Shrooms: js.Object
  /**
    *
    */
  var Tom: js.Object
  /**
    *
    */
  var Tufte: js.Object
  /**
    *
    */
  var WatersEdge: js.Object
  /**
    *
    */
  var Wetland: js.Object
  /**
    *
    */
  var base: js.Object
  /**
    *
    */
  var blue: js.Object
  /**
    *
    */
  var cyan: js.Object
  /**
    *
    */
  var green: js.Object
  /**
    *
    */
  var orange: js.Object
  /**
    *
    */
  var purple: js.Object
  /**
    *
    */
  var red: js.Object
  /**
    * generates 2-color gradients using pure colors, a fill pattern, and two luminance values
    *
    * @param colors Array of colors to generate gradients for each.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    */
  def generateFills(colors: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double): Unit
  /**
    * generates gradient colors using an intensity map
    *
    * @param color Color to use to generate gradients.
    * @param intensityMap Array of tuples {o, i}, where o is a gradient offset (0-1),and i is an intensity (0-255).
    */
  def generateGradientByIntensity(color: Color, intensityMap: js.Array[_]): Unit
  /**
    * generates mini-themes with 2-color gradients using colors, a fill pattern, and three luminance values
    *
    * @param colors Array of colors to generate gradients for each.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    * @param lumStroke Stroke luminance value (0-100).
    */
  def generateMiniTheme(colors: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double, lumStroke: Double): Unit
  /**
    * transforms solid color fills into 2-color gradients using a fill pattern, and two luminance values
    *
    * @param themes Array of mini-themes (usually series themes or marker themes), which fill will be transformed.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    */
  def updateFills(themes: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double): Unit
}

object base {
  @scala.inline
  def apply(
    Adobebricks: js.Object,
    Algae: js.Object,
    Bahamation: js.Object,
    BlueDusk: js.Object,
    Charged: js.Object,
    Chris: js.Object,
    Claro: js.Object,
    CubanShirts: js.Object,
    Desert: js.Object,
    Distinctive: js.Object,
    Dollar: js.Object,
    Electric: js.Object,
    Grasshopper: js.Object,
    Grasslands: js.Object,
    GreySkies: js.Object,
    Harmony: js.Object,
    IndigoNation: js.Object,
    Ireland: js.Object,
    Julie: js.Object,
    MiamiNice: js.Object,
    Midwest: js.Object,
    Minty: js.Object,
    PrimaryColors: js.Object,
    PurpleRain: js.Object,
    Renkoo: js.Object,
    RoyalPurples: js.Object,
    SageToLime: js.Object,
    Shrooms: js.Object,
    Tom: js.Object,
    Tufte: js.Object,
    WatersEdge: js.Object,
    Wetland: js.Object,
    base: js.Object,
    blue: js.Object,
    cyan: js.Object,
    generateFills: (js.Array[_], js.Object, Double, Double) => Unit,
    generateGradientByIntensity: (Color, js.Array[_]) => Unit,
    generateMiniTheme: (js.Array[_], js.Object, Double, Double, Double) => Unit,
    green: js.Object,
    orange: js.Object,
    purple: js.Object,
    red: js.Object,
    updateFills: (js.Array[_], js.Object, Double, Double) => Unit
  ): base = {
    val __obj = js.Dynamic.literal(Adobebricks = Adobebricks.asInstanceOf[js.Any], Algae = Algae.asInstanceOf[js.Any], Bahamation = Bahamation.asInstanceOf[js.Any], BlueDusk = BlueDusk.asInstanceOf[js.Any], Charged = Charged.asInstanceOf[js.Any], Chris = Chris.asInstanceOf[js.Any], Claro = Claro.asInstanceOf[js.Any], CubanShirts = CubanShirts.asInstanceOf[js.Any], Desert = Desert.asInstanceOf[js.Any], Distinctive = Distinctive.asInstanceOf[js.Any], Dollar = Dollar.asInstanceOf[js.Any], Electric = Electric.asInstanceOf[js.Any], Grasshopper = Grasshopper.asInstanceOf[js.Any], Grasslands = Grasslands.asInstanceOf[js.Any], GreySkies = GreySkies.asInstanceOf[js.Any], Harmony = Harmony.asInstanceOf[js.Any], IndigoNation = IndigoNation.asInstanceOf[js.Any], Ireland = Ireland.asInstanceOf[js.Any], Julie = Julie.asInstanceOf[js.Any], MiamiNice = MiamiNice.asInstanceOf[js.Any], Midwest = Midwest.asInstanceOf[js.Any], Minty = Minty.asInstanceOf[js.Any], PrimaryColors = PrimaryColors.asInstanceOf[js.Any], PurpleRain = PurpleRain.asInstanceOf[js.Any], Renkoo = Renkoo.asInstanceOf[js.Any], RoyalPurples = RoyalPurples.asInstanceOf[js.Any], SageToLime = SageToLime.asInstanceOf[js.Any], Shrooms = Shrooms.asInstanceOf[js.Any], Tom = Tom.asInstanceOf[js.Any], Tufte = Tufte.asInstanceOf[js.Any], WatersEdge = WatersEdge.asInstanceOf[js.Any], Wetland = Wetland.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], generateFills = js.Any.fromFunction4(generateFills), generateGradientByIntensity = js.Any.fromFunction2(generateGradientByIntensity), generateMiniTheme = js.Any.fromFunction5(generateMiniTheme), green = green.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], updateFills = js.Any.fromFunction4(updateFills))
  
    __obj.asInstanceOf[base]
  }
}

