package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Rect describes a rectangular two-dimensional area as a top-left point (x and y values)
    * and a size (width and height values).
    */
@JSImport("go", "Rect")
@js.native
class Rect ()
  extends goLib.goMod.goNs.Rect {
  /**
           * The constructor taking two Points produces a Rect that spans both points.
           * @param {Point} tl Top-left Point
           * @param {Point} br Bottom-right Point
           */
  def this(tl: goLib.goMod.goNs.Point, br: goLib.goMod.goNs.Point) = this()
  /**
           * The constructor taking a Point and a Size produces a Rect at that point with that size.
           * @param {Point} tl Top-left Point
           * @param {Point} sz Size
           */
  def this(tl: goLib.goMod.goNs.Point, sz: goLib.goMod.goNs.Size) = this()
  /**
           * The four-argument constructor takes four numbers for the x, y, width, height.
           * @param {number} x Top-left x value.
           * @param {number} y Top-left y value.
           * @param {number} w Width to be used; must be non-negative.
           * @param {number} h Height to be used; must be non-negative.
           */
  def this(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double) = this()
}

/**
    * A Rect describes a rectangular two-dimensional area as a top-left point (x and y values)
    * and a size (width and height values).
    */
@JSImport("go", "Rect")
@js.native
object Rect extends js.Object {
  /**
          * This static function indicates whether a Rect contains the given Point/Rect.
          * @param {number} rx The X coordinate of a Rect.
          * @param {number} ry The Y coordinate of a Rect.
          * @param {number} rw The Width of a Rect.
          * @param {number} rh The Height of a Rect.
          * @param {number} x The X coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number} y The Y coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
          * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
          * false otherwise.
          */
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  /**
          * This static function indicates whether a Rect contains the given Point/Rect.
          * @param {number} rx The X coordinate of a Rect.
          * @param {number} ry The Y coordinate of a Rect.
          * @param {number} rw The Width of a Rect.
          * @param {number} rh The Height of a Rect.
          * @param {number} x The X coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number} y The Y coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
          * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
          * false otherwise.
          */
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double
  ): scala.Boolean = js.native
  /**
          * This static function indicates whether a Rect contains the given Point/Rect.
          * @param {number} rx The X coordinate of a Rect.
          * @param {number} ry The Y coordinate of a Rect.
          * @param {number} rw The Width of a Rect.
          * @param {number} rh The Height of a Rect.
          * @param {number} x The X coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number} y The Y coordinate of the Point or Rect that might be in the bounds (RX, RY, RW, RH).
          * @param {number=} w The Width of the Rect to include in the new bounds, defaults to zero.
          * @param {number=} h The Height of the Rect to include in the new bounds, defaults to zero.
          * false otherwise.
          */
  def contains(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double
  ): scala.Boolean = js.native
  /**
          * This static function indicates whether a Rect partly or wholly overlaps the given Rect.
          * @param {number} rx The X coordinate of a Rect.
          * @param {number} ry The Y coordinate of a Rect.
          * @param {number} rw The Width of a Rect.
          * @param {number} rh The Height of a Rect.
          * @param {number} x The X coordinate of the Point or Rect that might overlap the bounds (RX, RY, RW, RH).
          * @param {number} y The Y coordinate of the Point or Rect that might overlap the bounds (RX, RY, RW, RH).
          * @param {number} w
          * @param {number} h
          */
  def intersects(
    rx: scala.Double,
    ry: scala.Double,
    rw: scala.Double,
    rh: scala.Double,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double
  ): scala.Boolean = js.native
  /**
          * This static function can be used to read in a Rect from a string that was produced by Rect.stringify.
          * @param {string} str
          */
  def parse(str: java.lang.String): goLib.goMod.goNs.Rect = js.native
  /**
          * This static function can be used to write out a Rect as a string that can be read by Rect.parse.
          * @param {Rect} val
          */
  def stringify(`val`: goLib.goMod.goNs.Rect): java.lang.String = js.native
}

