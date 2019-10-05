package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.button.html
  *
  *
  */
trait button extends js.Object {
  /**
    *
    */
  var down: js.Object
  /**
    *
    */
  var icon: js.Object
  /**
    *
    */
  var norm: js.Object
  /**
    *
    */
  var over: js.Object
  /**
    *
    */
  var selected: js.Object
}

object button {
  @scala.inline
  def apply(down: js.Object, icon: js.Object, norm: js.Object, over: js.Object, selected: js.Object): button = {
    val __obj = js.Dynamic.literal(down = down, icon = icon, norm = norm, over = over, selected = selected)
  
    __obj.asInstanceOf[button]
  }
}

