package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultVectorFont.html
  *
  *
  */
trait defaultVectorFont extends js.Object {
  /**
    *
    */
  var family: js.Object
  /**
    *
    */
  var size: String
  /**
    *
    */
  var `type`: String
}

object defaultVectorFont {
  @scala.inline
  def apply(family: js.Object, size: String, `type`: String): defaultVectorFont = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultVectorFont]
  }
}

