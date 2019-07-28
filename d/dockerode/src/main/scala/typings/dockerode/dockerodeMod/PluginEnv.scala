package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginEnv extends js.Object {
  var Description: String
  var Name: String
  var Settable: js.Array[String]
  var Value: String
}

object PluginEnv {
  @scala.inline
  def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): PluginEnv = {
    val __obj = js.Dynamic.literal(Description = Description, Name = Name, Settable = Settable, Value = Value)
  
    __obj.asInstanceOf[PluginEnv]
  }
}

