package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.textMode.html
  *
  * These styles apply to the containing
  * text box (edit mode), and not the text itself
  *
  */
trait textMode extends js.Object {
  /**
    *
    */
  var create: js.Object
  /**
    *
    */
  var edit: js.Object
}

object textMode {
  @scala.inline
  def apply(create: js.Object, edit: js.Object): textMode = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[textMode]
  }
}

