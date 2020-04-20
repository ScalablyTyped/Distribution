package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.textDisabled.html
  *
  * Style of disabled text
  *
  */
trait textDisabled extends js.Object {
  /**
    *
    */
  var color: String
  /**
    *
    */
  var family: String
  /**
    *
    */
  var size: String
  /**
    *
    */
  var weight: String
}

object textDisabled {
  @scala.inline
  def apply(color: String, family: String, size: String, weight: String): textDisabled = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[textDisabled]
  }
}

