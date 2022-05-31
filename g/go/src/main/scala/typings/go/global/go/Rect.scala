package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Rect describes a rectangular two-dimensional area as a top-left point (x and y values)
  * and a size (width and height values).
  */
@JSGlobal("go.Rect")
@js.native
/**
  * The default constructor (no argument) results in a Rect(0,0,0,0).
  */
class Rect ()
  extends typings.go.mod.Rect {
  /**
    * The constructor taking two Points produces a Rect that spans both points.
    * @param {Point} tl Top-left Point
    * @param {Point} br Bottom-right Point
    */
  def this(tl: typings.go.mod.Point, br: typings.go.mod.Point) = this()
  /**
    * The constructor taking a Point and a Size produces a Rect at that point with that size.
    * @param {Point} tl Top-left Point
    * @param {Point} sz Size
    */
  def this(tl: typings.go.mod.Point, sz: typings.go.mod.Size) = this()
  /**
    * The four-argument constructor takes four numbers for the x, y, width, height.
    * @param {number} x Top-left x value.
    * @param {number} y Top-left y value.
    * @param {number} w Width to be used; must be non-negative.
    * @param {number} h Height to be used; must be non-negative.
    */
  def this(x: Double, y: Double, w: Double, h: Double) = this()
}
object Rect {
  
  @JSGlobal("go.Rect")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Unit, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  /* static member */
  inline def intersects(rx: Double, ry: Double, rw: Double, rh: Double, x: Double, y: Double, w: Double, h: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rw.asInstanceOf[js.Any], rh.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * This static function can be used to read in a Rect from a string that was produced by Rect.stringify.
    * @param {string} str
    */
  /* static member */
  inline def parse(str: String): typings.go.mod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Rect]
  
  /**
    * This static function can be used to write out a Rect as a string that can be read by Rect.parse.
    * @param {Rect} val
    */
  /* static member */
  inline def stringify(`val`: typings.go.mod.Rect): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
}
