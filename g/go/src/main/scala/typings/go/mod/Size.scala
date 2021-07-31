package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Size describes a width and a height in two-dimensional coordinates.
  * The width and height must both be non-negative.
  */
@JSImport("go", "Size")
@js.native
/**
  * The default constructor produces the Size(0,0).
  */
class Size () extends StObject {
  /**
    * The two-argument constructor produces the Size(w,h).
    * @param {number} w this number must not be negative.
    * @param {number} h this number must not be negative.
    */
  def this(w: Double, h: Double) = this()
  
  /**
    * Create a copy of this Size, with the same values.
    */
  def copy(): Size = js.native
  
  /**
    * Indicates whether the given size is equal to this Size.
    * @param {number} w the width.
    * @param {number} h the height.
    * false otherwise.
    */
  def equalTo(w: Double, h: Double): Boolean = js.native
  
  /**
    * Indicates whether the given Size is equal to the current Size.
    * @param {Size} s The Size to compare to the current Size.
    * false otherwise.
    */
  def equals(s: Size): Boolean = js.native
  
  def equalsApprox(s: Size): Boolean = js.native
  
  /**Gets or sets the height value of the Size.*/
  var height: Double = js.native
  
  /**
    * True if this Size has Width and Height values that are real numbers and not infinity.
    */
  def isReal(): Boolean = js.native
  
  /**
    * Modify this Size so that its Width and Height values are the same as the given Size.
    * @param {Size} s the given Size.
    */
  def set(s: Size): Size = js.native
  
  /**
    * Modify this Size with new Width and Height values.
    * @param {number} w the width.
    * @param {number} h the height.
    */
  def setTo(w: Double, h: Double): Size = js.native
  
  /**Gets or sets the width value of the Size.*/
  var width: Double = js.native
}
object Size {
  
  @JSImport("go", "Size")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function can be used to read in a Size from a string that was produced by Size.stringify.
    * @param {string} str
    */
  /* static member */
  @scala.inline
  def parse(str: String): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  /**
    * This static function can be used to write out a Size as a string that can be read by Size.parse.
    * @param {Size} val
    */
  /* static member */
  @scala.inline
  def stringify(`val`: Size): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
