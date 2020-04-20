package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/registry.html
  *
  *
  */
trait registry extends js.Object {
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

object registry {
  @scala.inline
  def apply(byId: String => Shape, dispose: (Shape, Boolean) => Unit, register: Shape => Double): registry = {
    val __obj = js.Dynamic.literal(byId = js.Any.fromFunction1(byId), dispose = js.Any.fromFunction2(dispose), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[registry]
  }
}

