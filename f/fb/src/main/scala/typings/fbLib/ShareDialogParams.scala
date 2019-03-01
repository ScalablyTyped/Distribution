package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogParams extends js.Object {
   // "share"
  var href: java.lang.String
  var method: java.lang.String
}

object ShareDialogParams {
  @scala.inline
  def apply(href: java.lang.String, method: java.lang.String): ShareDialogParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[ShareDialogParams]
  }
}

