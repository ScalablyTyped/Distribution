package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Size describes a width and a height in two-dimensional coordinates.
  * The width and height must both be non-negative.
  */
@JSImport("go", "Size")
@js.native
/**
  * The default constructor produces the Size(0,0).
  */
class Size ()
  extends goLib.goMod.goNs.Size {
  /**
    * The two-argument constructor produces the Size(w,h).
    * @param {number} w this number must not be negative.
    * @param {number} h this number must not be negative.
    */
  def this(w: scala.Double, h: scala.Double) = this()
  /**Gets or sets the height value of the Size.*/
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**Gets or sets the width value of the Size.*/
  /* CompleteClass */
  override var width: scala.Double = js.native
  /**
    * Create a copy of this Size, with the same values.
    */
  /* CompleteClass */
  override def copy(): goLib.goMod.goNs.Size = js.native
  /**
    * Indicates whether the given size is equal to this Size.
    * @param {number} w the width.
    * @param {number} h the height.
    * false otherwise.
    */
  /* CompleteClass */
  override def equalTo(w: scala.Double, h: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether the given Size is equal to the current Size.
    * @param {Size} s The Size to compare to the current Size.
    * false otherwise.
    */
  /* CompleteClass */
  override def equals(s: goLib.goMod.goNs.Size): scala.Boolean = js.native
  /* CompleteClass */
  override def equalsApprox(s: goLib.goMod.goNs.Size): scala.Boolean = js.native
  /**
    * True if this Size has Width and Height values that are real numbers and not infinity.
    */
  /* CompleteClass */
  override def isReal(): scala.Boolean = js.native
  /**
    * Modify this Size so that its Width and Height values are the same as the given Size.
    * @param {Size} s the given Size.
    */
  /* CompleteClass */
  override def set(s: goLib.goMod.goNs.Size): goLib.goMod.goNs.Size = js.native
  /**
    * Modify this Size with new Width and Height values.
    * @param {number} w the width.
    * @param {number} h the height.
    */
  /* CompleteClass */
  override def setTo(w: scala.Double, h: scala.Double): goLib.goMod.goNs.Size = js.native
}

/* static members */
@JSImport("go", "Size")
@js.native
object Size extends js.Object {
  /**
    * This static function can be used to read in a Size from a string that was produced by Size.stringify.
    * @param {string} str
    */
  def parse(str: java.lang.String): goLib.goMod.goNs.Size = js.native
  /**
    * This static function can be used to write out a Size as a string that can be read by Size.parse.
    * @param {Size} val
    */
  def stringify(`val`: goLib.goMod.goNs.Size): java.lang.String = js.native
}

