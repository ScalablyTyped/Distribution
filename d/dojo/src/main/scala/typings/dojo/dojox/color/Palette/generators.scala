package typings.dojo.dojox.color.Palette

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/Palette.generators.html
  *
  *
  */
trait generators extends js.Object {
  /**
    * Create a 5 color palette based on the analogous rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.high (Number, optional): The difference between the hue of the base color and the highest hue.  In degrees, default is 60.low (Number, optional): The difference between the hue of the base color and the lowest hue.  In degrees, default is 18.
    */
  def analogous(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the complementary rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.
    */
  def complementary(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the compound rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.
    */
  def compound(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the monochromatic rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.
    */
  def monochromatic(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the shades rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.
    */
  def shades(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the split complementary rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.da (Number, optional): The delta angle to be used to determine where the split for the complementary rules happen.In degrees, the default is 30.
    */
  def splitComplementary(args: js.Object): js.Any
  /**
    * Create a 5 color palette based on the triadic rules as implemented at
    * http://kuler.adobe.com.
    *
    * @param args An object with the following properties:base (dojo/_base/Color): The base color to be used to generate the palette.
    */
  def triadic(args: js.Object): js.Any
}

/**
  *
  */
@JSGlobal("dojox.color.Palette.generators")
@js.native
object generators
  extends TopLevel[js.Object]

