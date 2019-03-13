package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: java.lang.String
  var csrf: scala.Boolean
  var limit: scala.Double
  var whiteList: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: java.lang.String,
    csrf: scala.Boolean,
    limit: scala.Double,
    whiteList: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(callback = callback, csrf = csrf, limit = limit, whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

