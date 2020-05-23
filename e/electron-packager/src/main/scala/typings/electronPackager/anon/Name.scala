package typings.electronPackager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var schemes: js.Array[String]
}

object Name {
  @scala.inline
  def apply(name: String, schemes: js.Array[String]): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

