package typings.dojo.dojox.gfx.vml_attach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach._bool.html
  *
  *
  */
trait _bool extends js.Object {
  /**
    *
    */
  var t: Double
  /**
    *
    */
  var `true`: Double
}

object _bool {
  @scala.inline
  def apply(t: Double, `true`: Double): _bool = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_bool]
  }
}

