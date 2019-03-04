package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkInfo extends js.Object {
  var path: java.lang.String
  var queryParams: stdLib.Partial[StringHashMap]
}

object LinkInfo {
  @scala.inline
  def apply(path: java.lang.String, queryParams: stdLib.Partial[StringHashMap]): LinkInfo = {
    val __obj = js.Dynamic.literal(path = path, queryParams = queryParams)
  
    __obj.asInstanceOf[LinkInfo]
  }
}

