package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.scopeMap.html
  *
  *
  */
trait scopeMap extends js.Object {
  /**
    *
    */
  var dijit: js.Array[_]
  /**
    *
    */
  var dojo: js.Array[_]
  /**
    *
    */
  var dojox: js.Array[_]
}

object scopeMap {
  @scala.inline
  def apply(dijit: js.Array[_], dojo: js.Array[_], dojox: js.Array[_]): scopeMap = {
    val __obj = js.Dynamic.literal(dijit = dijit.asInstanceOf[js.Any], dojo = dojo.asInstanceOf[js.Any], dojox = dojox.asInstanceOf[js.Any])
    __obj.asInstanceOf[scopeMap]
  }
}

