package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMount extends js.Object {
  var Description: java.lang.String
  var Destination: java.lang.String
  var Name: java.lang.String
  var Options: js.Array[java.lang.String]
  var Settable: js.Array[java.lang.String]
  var Source: java.lang.String
  var Type: java.lang.String
}

object PluginMount {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Destination: java.lang.String,
    Name: java.lang.String,
    Options: js.Array[java.lang.String],
    Settable: js.Array[java.lang.String],
    Source: java.lang.String,
    Type: java.lang.String
  ): PluginMount = {
    val __obj = js.Dynamic.literal(Description = Description, Destination = Destination, Name = Name, Options = Options, Settable = Settable, Source = Source, Type = Type)
  
    __obj.asInstanceOf[PluginMount]
  }
}

