package typings.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/date.html
  *
  *
  */
trait date extends js.Object {
  /**
    *
    * @param format
    * @param node
    */
  def NowNode(format: js.Any, node: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def now(parser: js.Any, token: js.Any): Unit
}

object date {
  @scala.inline
  def apply(NowNode: (js.Any, js.Any) => Unit, now: (js.Any, js.Any) => Unit): date = {
    val __obj = js.Dynamic.literal(NowNode = js.Any.fromFunction2(NowNode), now = js.Any.fromFunction2(now))
  
    __obj.asInstanceOf[date]
  }
}

