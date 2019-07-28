package typings.expo.expoMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkInfo extends js.Object {
  var path: String
  var queryParams: Partial[StringHashMap]
}

object LinkInfo {
  @scala.inline
  def apply(path: String, queryParams: Partial[StringHashMap]): LinkInfo = {
    val __obj = js.Dynamic.literal(path = path, queryParams = queryParams)
  
    __obj.asInstanceOf[LinkInfo]
  }
}

