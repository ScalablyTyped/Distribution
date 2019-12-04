package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/shape.html
  *
  * This module contains the core graphics Shape API.
  * Different graphics renderer implementation modules (svg, canvas, vml, silverlight, etc.) extend this
  * basic api to provide renderer-specific implementations for each shape.
  *
  */
trait shape extends js.Object {
  /**
    * Returns the shape that matches the specified id.
    *
    * @param id The unique identifier for this Shape.
    */
  def byId(id: String): Shape
  /**
    * Removes the specified shape from the registry.
    *
    * @param s The shape to unregister.
    * @param recurse               Optional
    */
  def dispose(s: Shape, recurse: Boolean): Unit
  /**
    * Register the specified shape into the graphics registry.
    *
    * @param s The shape to register.
    */
  def register(s: Shape): Double
}

@JSGlobal("dojox.gfx.shape")
@js.native
object shape extends js.Object {
  /**
    *
    */
  @js.native
  class Circle () extends js.Object
  
  /**
    * a container of shapes, which can be used
    * as a foundation for renderer-specific groups, or as a way
    * to logically group shapes (e.g, to propagate matricies)
    *
    */
  @js.native
  class Container () extends js.Object
  
  /**
    * shape creators
    *
    */
  @js.native
  class Creator () extends js.Object
  
  /**
    *
    */
  @js.native
  class Ellipse () extends js.Object
  
  /**
    *
    */
  @js.native
  class Image () extends js.Object
  
  /**
    *
    */
  @js.native
  class Line () extends js.Object
  
  /**
    *
    */
  @js.native
  class Polyline () extends js.Object
  
  /**
    *
    */
  @js.native
  class Rect () extends js.Object
  
  /**
    *
    */
  @js.native
  class Shape () extends js.Object
  
  /**
    *
    */
  @js.native
  class Surface () extends js.Object
  
  /**
    *
    */
  @js.native
  class Text () extends js.Object
  
}

