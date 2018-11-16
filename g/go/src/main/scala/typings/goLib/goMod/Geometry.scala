package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * The Geometry class is used to define the "shape" of a Shape.
    * A Geometry can be simple straight lines, rectangles, or ellipses.
    * A Geometry can also be an arbitrarily complex path, consisting of a list of PathFigures.
    * A Geometry must not be modified once it has been used by a Shape.
    * However, a Geometry may be shared by multiple Shapes.
    */
@JSImport("go", "Geometry")
@js.native
class Geometry ()
  extends goLib.goMod.goNs.Geometry {
  /**
          * Construct an empty Geometry.
          * The geometry type must be one of the following values:
          * Geometry.Line, Geometry.Ellipse, Geometry.Rectangle, Geometry.Path.
          * @param {EnumValue=} type If not supplied, the default Geometry type is Geometry.Path.
          */
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

/**
    * The Geometry class is used to define the "shape" of a Shape.
    * A Geometry can be simple straight lines, rectangles, or ellipses.
    * A Geometry can also be an arbitrarily complex path, consisting of a list of PathFigures.
    * A Geometry must not be modified once it has been used by a Shape.
    * However, a Geometry may be shared by multiple Shapes.
    */
@JSImport("go", "Geometry")
@js.native
object Geometry extends js.Object {
  /**For drawing an ellipse fitting within a rectangle; a value for Geometry.type.*/
  var Ellipse: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a simple straight line; a value for Geometry.type.*/
  var Line: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a complex path made of a list of PathFigures; a value for Geometry.type.*/
  var Path: goLib.goMod.goNs.EnumValue = js.native
  /**For drawing a rectangle; a value for Geometry.type.*/
  var Rectangle: goLib.goMod.goNs.EnumValue = js.native
  /**
          * Given a SVG or GoJS path string, returns a congruent path string with each PathFigure filled.
          * For instance, "M0 0 L22 22 L33 0" would become "F M0 0 L22 22 L33 0".
          * @param {string} str
          */
  def fillPath(str: java.lang.String): java.lang.String = js.native
  /**
          * Produce a Geometry from a string that uses an SVG-like compact path geometry syntax.
          * @param {string} str
          * @param {boolean=} filled whether figures should be filled.
          * If true, all PathFigures in the string will be filled regardless of the presence
          * of an "F" command or not.
          * If false, all PathFigures will determine their own filled state by the presence of an "F" command or not.
          * Default is false.
          */
  def parse(str: java.lang.String): goLib.goMod.goNs.Geometry = js.native
  /**
          * Produce a Geometry from a string that uses an SVG-like compact path geometry syntax.
          * @param {string} str
          * @param {boolean=} filled whether figures should be filled.
          * If true, all PathFigures in the string will be filled regardless of the presence
          * of an "F" command or not.
          * If false, all PathFigures will determine their own filled state by the presence of an "F" command or not.
          * Default is false.
          */
  def parse(str: java.lang.String, filled: scala.Boolean): goLib.goMod.goNs.Geometry = js.native
  /**
          * This static function can be used to write out a Geometry as a string
          * that can be read by Geometry.parse.
          * The string produced by this method is a superset of the SVG path
          * string rules that contains some additional GoJS-specific tokens.
          * See the <a href="../../intro/pictures.html">Introduction page on Geometry Parsing</a> for more details.
          * @param {Geometry} val
          */
  def stringify(`val`: goLib.goMod.goNs.Geometry): java.lang.String = js.native
}

