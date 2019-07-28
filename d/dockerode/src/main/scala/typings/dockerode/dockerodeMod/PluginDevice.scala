package typings.dockerode.dockerodeMod

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
    val __obj = js.Dynamic.literal(Description = Description, Name = Name, Path = Path, Settable = Settable)
  
    __obj.asInstanceOf[PluginDevice]
  }
}

