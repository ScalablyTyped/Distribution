package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogParams extends js.Object {
   // "share"
  var href: String
  var method: String
}

object ShareDialogParams {
  @scala.inline
  def apply(href: String, method: String): ShareDialogParams = {
    val __obj = js.Dynamic.literal(href = href, method = method)
  
    __obj.asInstanceOf[ShareDialogParams]
  }
}

