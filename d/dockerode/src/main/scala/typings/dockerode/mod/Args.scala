package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var Description: String
  var Name: String
  var Settable: js.Array[String]
  var Value: String
}

object Args {
  @scala.inline
  def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): Args = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

