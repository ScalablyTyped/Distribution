package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBResponseObject extends js.Object {
  var data: js.Any
  var error: js.Any
}

object FBResponseObject {
  @scala.inline
  def apply(data: js.Any, error: js.Any): FBResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[FBResponseObject]
  }
}

