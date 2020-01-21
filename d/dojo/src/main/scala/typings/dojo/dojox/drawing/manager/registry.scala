package typings.dojo.dojox.drawing.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/_registry.html
  *
  *
  */
trait registry extends js.Object {
  /**
    *
    * @param type
    * @param id
    */
  def getRegistered(`type`: js.Any, id: js.Any): js.Any
  /**
    *
    * @param item
    * @param type
    */
  def register(item: js.Any, `type`: js.Any): Unit
}

object registry {
  @scala.inline
  def apply(getRegistered: (js.Any, js.Any) => js.Any, register: (js.Any, js.Any) => Unit): registry = {
    val __obj = js.Dynamic.literal(getRegistered = js.Any.fromFunction2(getRegistered), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[registry]
  }
}

