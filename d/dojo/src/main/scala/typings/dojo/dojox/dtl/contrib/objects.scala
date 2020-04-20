package typings.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/objects.html
  *
  *
  */
trait objects extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def key(value: js.Any, arg: js.Any): js.Any
}

object objects {
  @scala.inline
  def apply(key: (js.Any, js.Any) => js.Any): objects = {
    val __obj = js.Dynamic.literal(key = js.Any.fromFunction2(key))
    __obj.asInstanceOf[objects]
  }
}

