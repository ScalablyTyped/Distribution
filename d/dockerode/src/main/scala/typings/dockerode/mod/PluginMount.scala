package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMount extends js.Object {
  var Description: String
  var Destination: String
  var Name: String
  var Options: js.Array[String]
  var Settable: js.Array[String]
  var Source: String
  var Type: String
}

object PluginMount {
  @scala.inline
  def apply(
    Description: String,
    Destination: String,
    Name: String,
    Options: js.Array[String],
    Settable: js.Array[String],
    Source: String,
    Type: String
  ): PluginMount = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMount]
  }
}

