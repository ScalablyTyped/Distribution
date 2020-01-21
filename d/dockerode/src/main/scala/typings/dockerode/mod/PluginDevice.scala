package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginDevice extends js.Object {
  var Description: String
  var Name: String
  var Path: String
  var Settable: js.Array[String]
}

object PluginDevice {
  @scala.inline
  def apply(Description: String, Name: String, Path: String, Settable: js.Array[String]): PluginDevice = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginDevice]
  }
}

