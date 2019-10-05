package typings.dojo.doh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/_parseURLargs.html
  *
  *
  */
trait _parseURLargs extends js.Object {
  /**
    *
    */
  var isDebug: Boolean
  /**
    *
    */
  var noGlobals: Boolean
  /**
    *
    */
  var scopeMap: js.Array[_]
}

object _parseURLargs {
  @scala.inline
  def apply(isDebug: Boolean, noGlobals: Boolean, scopeMap: js.Array[_]): _parseURLargs = {
    val __obj = js.Dynamic.literal(isDebug = isDebug, noGlobals = noGlobals, scopeMap = scopeMap)
  
    __obj.asInstanceOf[_parseURLargs]
  }
}

