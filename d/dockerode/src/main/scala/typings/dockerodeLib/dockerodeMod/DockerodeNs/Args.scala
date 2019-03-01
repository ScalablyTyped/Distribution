package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var Description: java.lang.String
  var Name: java.lang.String
  var Settable: js.Array[java.lang.String]
  var Value: java.lang.String
}

object Args {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Name: java.lang.String,
    Settable: js.Array[java.lang.String],
    Value: java.lang.String
  ): Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Settable")(Settable)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Args]
  }
}

