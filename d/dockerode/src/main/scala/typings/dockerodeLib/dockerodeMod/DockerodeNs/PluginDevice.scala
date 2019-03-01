package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDevice extends js.Object {
  var Description: java.lang.String
  var Name: java.lang.String
  var Path: java.lang.String
  var Settable: js.Array[java.lang.String]
}

object PluginDevice {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Name: java.lang.String,
    Path: java.lang.String,
    Settable: js.Array[java.lang.String]
  ): PluginDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("Settable")(Settable)
    __obj.asInstanceOf[PluginDevice]
  }
}

