package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rails.html
  *
  *
  */
trait rails extends js.Object {
  /**
    *
    * @param selector
    * @param evtName
    * @param fn
    */
  def live(selector: js.Any, evtName: js.Any, fn: js.Any): Unit
}

object rails {
  @scala.inline
  def apply(live: (js.Any, js.Any, js.Any) => Unit): rails = {
    val __obj = js.Dynamic.literal(live = js.Any.fromFunction3(live))
  
    __obj.asInstanceOf[rails]
  }
}

