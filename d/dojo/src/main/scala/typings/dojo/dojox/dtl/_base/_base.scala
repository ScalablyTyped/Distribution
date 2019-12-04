package typings.dojo.dojox.dtl._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base._base.html
  *
  *
  */
trait _base extends js.Object {
  /**
    * Escapes a string's HTML
    *
    * @param value
    */
  def escape(value: js.Any): Unit
  /**
    *
    * @param value
    */
  def safe(value: js.Any): Unit
}

object _base {
  @scala.inline
  def apply(escape: js.Any => Unit, safe: js.Any => Unit): _base = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), safe = js.Any.fromFunction1(safe))
  
    __obj.asInstanceOf[_base]
  }
}

