package typings.dojo.doh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/_parseURLargs.html
  *
  *
  */
trait parseURLargs extends js.Object {
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

object parseURLargs {
  @scala.inline
  def apply(isDebug: Boolean, noGlobals: Boolean, scopeMap: js.Array[_]): parseURLargs = {
    val __obj = js.Dynamic.literal(isDebug = isDebug.asInstanceOf[js.Any], noGlobals = noGlobals.asInstanceOf[js.Any], scopeMap = scopeMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[parseURLargs]
  }
}

