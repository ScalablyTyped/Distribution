package typings.dojo.dojox.color

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Palette {
  /**
    * Clones the current palette.
    *
    */
  type clone = js.Function0[js.Any]
  /**
    * Transform the palette using a specific transformation function
    * and a set of transformation parameters.
    * {palette}.transform is a simple way to uniformly transform
    * all of the colors in a palette using any of 5 formulae:
    * RGBA, HSL, HSV, CMYK or CMY.
    *
    * Once the forumula to be used is determined, you can pass any
    * number of parameters based on the formula "d"[param]; for instance,
    * { use: "rgba", dr: 20, dg: -50 } will take all of the colors in
    * palette, add 20 to the R value and subtract 50 from the G value.
    *
    * Unlike other types of transformations, transform does not alter
    * the original palette but will instead return a new one.
    *
    * @param kwArgs An object with the following properties:use (String, optional): Specify the color model to use for the transformation.  Can be "rgb", "rgba", "hsv", "hsl", "cmy", "cmyk".dr (Number, optional): The delta to be applied to the red aspect of the RGB/RGBA color model.dg (Number, optional): The delta to be applied to the green aspect of the RGB/RGBA color model.db (Number, optional): The delta to be applied to the blue aspect of the RGB/RGBA color model.da (Number, optional): The delta to be applied to the alpha aspect of the RGBA color model.dc (Number, optional): The delta to be applied to the cyan aspect of the CMY/CMYK color model.dm (Number, optional): The delta to be applied to the magenta aspect of the CMY/CMYK color model.dy (Number, optional): The delta to be applied to the yellow aspect of the CMY/CMYK color model.dk (Number, optional): The delta to be applied to the black aspect of the CMYK color model.dh (Number, optional): The delta to be applied to the hue aspect of the HSL/HSV color model.ds (Number, optional): The delta to be applied to the saturation aspect of the HSL/HSV color model.dl (Number, optional): The delta to be applied to the luminosity aspect of the HSL color model.dv (Number, optional): The delta to be applied to the value aspect of the HSV color model.
    */
  type transform = js.Function1[/* kwArgs */ js.Object, js.Any]
}
