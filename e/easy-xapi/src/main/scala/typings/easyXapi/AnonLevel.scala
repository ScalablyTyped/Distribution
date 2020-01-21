package typings.easyXapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: String
  var name: String
}

object AnonLevel {
  @scala.inline
  def apply(level: String, name: String): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

