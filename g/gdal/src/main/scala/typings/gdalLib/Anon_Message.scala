package typings
package gdalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: js.Any
  var number: js.Any
  var `type`: js.Any
}

object Anon_Message {
  @scala.inline
  def apply(message: js.Any, number: js.Any, `type`: js.Any): Anon_Message = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Anon_Message]
  }
}

