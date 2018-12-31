package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Size describes a width and a height in two-dimensional coordinates.
  * The width and height must both be non-negative.
  */
trait Size extends js.Object {
  /**Gets or sets the height value of the Size.*/
  var height: scala.Double
  /**Gets or sets the width value of the Size.*/
  var width: scala.Double
  /**
    * Create a copy of this Size, with the same values.
    */
  def copy(): Size
  /**
    * Indicates whether the given size is equal to this Size.
    * @param {number} w the width.
    * @param {number} h the height.
    * false otherwise.
    */
  def equalTo(w: scala.Double, h: scala.Double): scala.Boolean
  /**
    * Indicates whether the given Size is equal to the current Size.
    * @param {Size} s The Size to compare to the current Size.
    * false otherwise.
    */
  def equals(s: Size): scala.Boolean
  def equalsApprox(s: Size): scala.Boolean
  /**
    * True if this Size has Width and Height values that are real numbers and not infinity.
    */
  def isReal(): scala.Boolean
  /**
    * Modify this Size so that its Width and Height values are the same as the given Size.
    * @param {Size} s the given Size.
    */
  def set(s: Size): Size
  /**
    * Modify this Size with new Width and Height values.
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(w: scala.Double, h: scala.Double): Size
}

