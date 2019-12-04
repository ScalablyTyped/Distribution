package typings.dojo.dojox.data.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.rules.html
  *
  *
  */
trait rules extends js.Object {
  /**
    *
    * @param fn
    * @param ctx
    * @param context
    */
  def forEach(fn: js.Any, ctx: js.Any, context: js.Any): Unit
}

object rules {
  @scala.inline
  def apply(forEach: (js.Any, js.Any, js.Any) => Unit): rules = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction3(forEach))
  
    __obj.asInstanceOf[rules]
  }
}

