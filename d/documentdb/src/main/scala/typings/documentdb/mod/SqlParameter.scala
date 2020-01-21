package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlParameter extends js.Object {
  /** The name of the parameter. */
  var name: String
  /** The value of the parameter. */
  var value: js.Any
}

object SqlParameter {
  @scala.inline
  def apply(name: String, value: js.Any): SqlParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlParameter]
  }
}

