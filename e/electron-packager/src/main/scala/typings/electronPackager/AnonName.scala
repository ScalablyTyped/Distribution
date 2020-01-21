package typings.electronPackager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var schemes: js.Array[String]
}

object AnonName {
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

