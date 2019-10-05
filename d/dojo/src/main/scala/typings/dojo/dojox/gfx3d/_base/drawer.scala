package typings.dojo.dojox.gfx3d._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.drawer.html
  *
  *
  */
trait drawer extends js.Object {
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def chart(todos: js.Any, objects: js.Any, viewport: js.Any): Unit
  /**
    *
    * @param todos
    * @param objects
    * @param viewport
    */
  def conservative(todos: js.Any, objects: js.Any, viewport: js.Any): Unit
}

object drawer {
  @scala.inline
  def apply(chart: (js.Any, js.Any, js.Any) => Unit, conservative: (js.Any, js.Any, js.Any) => Unit): drawer = {
    val __obj = js.Dynamic.literal(chart = js.Any.fromFunction3(chart), conservative = js.Any.fromFunction3(conservative))
  
    __obj.asInstanceOf[drawer]
  }
}

