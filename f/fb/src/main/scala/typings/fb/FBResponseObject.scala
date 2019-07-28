package typings.fb

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
    val __obj = js.Dynamic.literal(data = data, error = error)
  
    __obj.asInstanceOf[FBResponseObject]
  }
}

