package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Margin represents a band of space outside or inside a rectangular area,
  * with possibly different values on each of the four sides.
  */
@JSImport("go", "Margin")
@js.native
/**
  * If zero arguments are supplied, zero is used for all four sides.
  */
class Margin () extends js.Object {
  /**
    * If one argument is supplied, that number is used for all four sides.
    * @param {number} m the margin for all four sides.
    */
  def this(m: Double) = this()
  /**
    * If two arguments are supplied, the top and bottom sides get the first value,
    * and the left and right sides get the second value.
    * @param {number} tb the margin for the top and bottom sides
    * @param {number} rl the margin for the right and left sides
    */
  def this(tb: Double, rl: Double) = this()
  /**
    * If there are four arguments, the numbers represent: top, right, bottom, left.
    * @param {number} t the margin for the top side;
    *                    if not supplied, all sides are zero.
    * @param {number} r the margin for the right side;
    *                    if not supplied, all sides have the value of the first argument.
    * @param {number} b the margin for all bottom side;
    *                    if not supplied, the top and bottom get the value of the first argument,
    *                    and the right and left sides get the value of the second argument.
    * @param {number} l the margin for the left side;
    *                    must be supplied if the third argument was supplied.
    */
  def this(t: Double, r: Double, b: Double, l: Double) = this()
  /**Gets or sets the bottom value of this margin.*/
  var bottom: Double = js.native
  /**Gets or sets the left value of this margin.*/
  var left: Double = js.native
  /**Gets or sets the right value of this margin.*/
  var right: Double = js.native
  /**Gets or sets the top value of this margin.*/
  var top: Double = js.native
  /**
    * Create a copy of this Margin, with the same values.
    */
  def copy(): Margin = js.native
  /**
    * Indicates whether the given margin is equal to this Margin.
    * @param {number} t top.
    * @param {number} r right.
    * @param {number} b bottom.
    * @param {number} l left.
    */
  def equalTo(t: Double, r: Double, b: Double, l: Double): Boolean = js.native
  /**
    * Indicates whether the given Margin is equal to this Margin.
    * @param {Margin} m The Margin to compare to this Margin.
    */
  def equals(m: Margin): Boolean = js.native
  def equalsApprox(m: Margin): Boolean = js.native
  /**
    * True if this Margin has values that are real numbers and not infinity.
    */
  def isReal(): Boolean = js.native
  /**
    * Modify this Margin so that its Top, Right, Bottom, and Left values are the same as the given Margin.
    * @param {Margin} m the Margin whose values are to be copied
    */
  def set(m: Margin): Margin = js.native
  /**
    * Modify this Size with new Width and Height values.
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(t: Double, r: Double, b: Double, l: Double): Margin = js.native
}

/* static members */
@JSImport("go", "Margin")
@js.native
object Margin extends js.Object {
  /**
    * This static function can be used to read in a Margin from a string that was produced by Margin.stringify.
    * @param {string} str
    */
  def parse(str: String): Margin = js.native
  /**
    * This static function can be used to write out a Margin as a string that can be read by Margin.parse.
    * @param {Margin} val
    */
  def stringify(`val`: Margin): String = js.native
}

