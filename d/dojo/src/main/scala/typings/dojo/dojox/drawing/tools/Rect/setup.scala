package typings.dojo.dojox.drawing.tools.Rect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/Rect.setup.html
  *
  *
  */
trait setup extends js.Object {
  /**
    *
    */
  var iconClass: String
  /**
    *
    */
  var name: String
  /**
    *
    */
  var tooltip: String
}

object setup {
  @scala.inline
  def apply(iconClass: String, name: String, tooltip: String): setup = {
    val __obj = js.Dynamic.literal(iconClass = iconClass, name = name, tooltip = tooltip)
  
    __obj.asInstanceOf[setup]
  }
}

