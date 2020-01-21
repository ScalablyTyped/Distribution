package typings.egg

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: String
  var csrf: Boolean
  var limit: Double
  var whiteList: String | RegExp | (js.Array[String | RegExp])
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: String,
    csrf: Boolean,
    limit: Double,
    whiteList: String | RegExp | (js.Array[String | RegExp])
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

