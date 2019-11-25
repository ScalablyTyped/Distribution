package typings.getDashRes.getDashResMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolution extends js.Object {
  var item: String
  var percent: String
}

object Resolution {
  @scala.inline
  def apply(item: String, percent: String): Resolution = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resolution]
  }
}

