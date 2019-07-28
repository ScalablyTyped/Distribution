package typings.dockerode.dockerodeMod

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
    val __obj = js.Dynamic.literal(Description = Description, Destination = Destination, Name = Name, Options = Options, Settable = Settable, Source = Source, Type = Type)
  
    __obj.asInstanceOf[PluginMount]
  }
}

