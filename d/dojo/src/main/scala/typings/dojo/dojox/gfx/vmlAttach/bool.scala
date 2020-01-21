package typings.dojo.dojox.gfx.vmlAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/vml_attach._bool.html
  *
  *
  */
trait bool extends js.Object {
  /**
    *
    */
  var t: Double
  /**
    *
    */
  var `true`: Double
}

object bool {
  @scala.inline
  def apply(t: Double, `true`: Double): bool = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[bool]
  }
}

