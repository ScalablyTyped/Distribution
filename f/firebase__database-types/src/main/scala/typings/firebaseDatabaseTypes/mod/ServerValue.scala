package typings.firebaseDatabaseTypes.mod

import typings.firebaseDatabaseTypes.AnonSv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerValue extends js.Object {
  var TIMESTAMP: AnonSv
}

object ServerValue {
  @scala.inline
  def apply(TIMESTAMP: AnonSv): ServerValue = {
    val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerValue]
  }
}

