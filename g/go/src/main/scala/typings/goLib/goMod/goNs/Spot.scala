package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Spot represents a relative point from(0, 0) to(1, 1) within the bounds of
  * a rectangular area plus an absolute offset.
  */
trait Spot extends js.Object {
  /**Gets or sets the offsetX value of the Spot.*/
  var offsetX: scala.Double
  /**Gets or sets the offsetY value of the Spot.*/
  var offsetY: scala.Double
  /**Gets or sets the x value of the Spot, a fractional value between zero and one.*/
  var x: scala.Double
  /**Gets or sets the y value of the Spot, a fractional value between zero and one.*/
  var y: scala.Double
  /**
    * Create a copy of this Spot, with the same values.
    */
  def copy(): Spot
  /**
    * Two spots are equal if all four property values are the same.
    * @param {Spot} spot The Spot to compare to the current Spot.
    */
  def equals(spot: Spot): scala.Boolean
  /**
    * This predicate is true if this Spot is a side that
    * includes the side(s) given by the argument Spot.
    * @param {Spot} side
    */
  def includesSide(side: Spot): scala.Boolean
  /**
    * True if this is a special spot referring to the default spot.
    */
  def isDefault(): scala.Boolean
  /**
    * True if this is an unspecific special spot, such as Spot.None or one of the sides.
    */
  def isNoSpot(): scala.Boolean
  /**
    * True if this is a special spot referring to one (or more) of the sides.
    */
  def isSide(): scala.Boolean
  /**
    * True if this is a specific spot, not a side nor Spot.None.
    */
  def isSpot(): scala.Boolean
  /**
    * Return a new spot that is opposite this spot.
    */
  def opposite(): Spot
  /**
    * Modify this Spot so that its X, Y, OffsetX, and OffsetY values are the same as the given Spot.
    * @param {Spot} s the given Spot.
    */
  def set(s: Spot): Spot
  /**
    * Modify this Spot with new X, Y, OffsetX, and OffsetY values.
    * @param {number} x
    * @param {number} y
    * @param {number} offx
    * @param {number} offy
    */
  def setTo(x: scala.Double, y: scala.Double, offx: scala.Double, offy: scala.Double): Spot
}

object Spot {
  @scala.inline
  def apply(
    copy: js.Function0[Spot],
    equals: js.Function1[Spot, scala.Boolean],
    includesSide: js.Function1[Spot, scala.Boolean],
    isDefault: js.Function0[scala.Boolean],
    isNoSpot: js.Function0[scala.Boolean],
    isSide: js.Function0[scala.Boolean],
    isSpot: js.Function0[scala.Boolean],
    offsetX: scala.Double,
    offsetY: scala.Double,
    opposite: js.Function0[Spot],
    set: js.Function1[Spot, Spot],
    setTo: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, Spot],
    x: scala.Double,
    y: scala.Double
  ): Spot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("includesSide")(includesSide)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("isNoSpot")(isNoSpot)
    __obj.updateDynamic("isSide")(isSide)
    __obj.updateDynamic("isSpot")(isSpot)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("opposite")(opposite)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("setTo")(setTo)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Spot]
  }
}

