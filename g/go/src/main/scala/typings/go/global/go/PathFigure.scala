package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PathFigure represents a section of a Geometry.
  * It is a single connected series of
  * two-dimensional geometric PathSegments.
  */
@JSGlobal("go.PathFigure")
@js.native
/**
  * Constructs an empty figure.
  * The optional arguments specify the starting point of the figure.
  * You'll want to add a new instance of a PathFigure to the
  * Geometry.figures list of a Geometry.
  * @param {number=} sx optional: the X coordinate of the start point (default is zero).
  * @param {number=} sy optional: the Y coordinate of the start point (default is zero).
  * @param {boolean=} filled optional: whether the figure is filled (default is true).
  * @param {boolean=} shadowed optional: whether the figure may be drawn with a shadow (default is true).
  */
open class PathFigure ()
  extends typings.go.mod.PathFigure {
  def this(sx: Double) = this()
  def this(sx: Double, sy: Double) = this()
  def this(sx: Unit, sy: Double) = this()
  def this(sx: Double, sy: Double, filled: Boolean) = this()
  def this(sx: Double, sy: Unit, filled: Boolean) = this()
  def this(sx: Unit, sy: Double, filled: Boolean) = this()
  def this(sx: Unit, sy: Unit, filled: Boolean) = this()
  def this(sx: Double, sy: Double, filled: Boolean, shadowed: Boolean) = this()
  def this(sx: Double, sy: Double, filled: Unit, shadowed: Boolean) = this()
  def this(sx: Double, sy: Unit, filled: Boolean, shadowed: Boolean) = this()
  def this(sx: Double, sy: Unit, filled: Unit, shadowed: Boolean) = this()
  def this(sx: Unit, sy: Double, filled: Boolean, shadowed: Boolean) = this()
  def this(sx: Unit, sy: Double, filled: Unit, shadowed: Boolean) = this()
  def this(sx: Unit, sy: Unit, filled: Boolean, shadowed: Boolean) = this()
  def this(sx: Unit, sy: Unit, filled: Unit, shadowed: Boolean) = this()
}
