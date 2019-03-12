package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Margin represents a band of space outside or inside a rectangular area,
  * with possibly different values on each of the four sides.
  */
trait Margin extends js.Object {
  /**Gets or sets the bottom value of this margin.*/
  var bottom: scala.Double
  /**Gets or sets the left value of this margin.*/
  var left: scala.Double
  /**Gets or sets the right value of this margin.*/
  var right: scala.Double
  /**Gets or sets the top value of this margin.*/
  var top: scala.Double
  /**
    * Create a copy of this Margin, with the same values.
    */
  def copy(): Margin
  /**
    * Indicates whether the given margin is equal to this Margin.
    * @param {number} t top.
    * @param {number} r right.
    * @param {number} b bottom.
    * @param {number} l left.
    */
  def equalTo(t: scala.Double, r: scala.Double, b: scala.Double, l: scala.Double): scala.Boolean
  /**
    * Indicates whether the given Margin is equal to this Margin.
    * @param {Margin} m The Margin to compare to this Margin.
    */
  def equals(m: Margin): scala.Boolean
  def equalsApprox(m: Margin): scala.Boolean
  /**
    * True if this Margin has values that are real numbers and not infinity.
    */
  def isReal(): scala.Boolean
  /**
    * Modify this Margin so that its Top, Right, Bottom, and Left values are the same as the given Margin.
    * @param {Margin} m the Margin whose values are to be copied
    */
  def set(m: Margin): Margin
  /**
    * Modify this Size with new Width and Height values.
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(t: scala.Double, r: scala.Double, b: scala.Double, l: scala.Double): Margin
}

object Margin {
  @scala.inline
  def apply(
    bottom: scala.Double,
    copy: () => Margin,
    equalTo: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Boolean,
    equals: Margin => scala.Boolean,
    equalsApprox: Margin => scala.Boolean,
    isReal: () => scala.Boolean,
    left: scala.Double,
    right: scala.Double,
    set: Margin => Margin,
    setTo: (scala.Double, scala.Double, scala.Double, scala.Double) => Margin,
    top: scala.Double
  ): Margin = {
    val __obj = js.Dynamic.literal(bottom = bottom, copy = js.Any.fromFunction0(copy), equalTo = js.Any.fromFunction4(equalTo), equals = js.Any.fromFunction1(equals), equalsApprox = js.Any.fromFunction1(equalsApprox), isReal = js.Any.fromFunction0(isReal), left = left, right = right, set = js.Any.fromFunction1(set), setTo = js.Any.fromFunction4(setTo), top = top)
  
    __obj.asInstanceOf[Margin]
  }
}

