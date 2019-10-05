package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.zoom100.html
  *
  *
  */
trait zoom100 extends js.Object {
  /**
    *
    */
  var text: String
  /**
    *
    */
  var `type`: String
}

object zoom100 {
  @scala.inline
  def apply(text: String, `type`: String): zoom100 = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[zoom100]
  }
}

