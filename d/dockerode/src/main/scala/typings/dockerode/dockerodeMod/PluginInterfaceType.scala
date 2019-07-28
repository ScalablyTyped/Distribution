package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInterfaceType extends js.Object {
  var Capability: String
  var Prefix: String
  var Version: String
}

object PluginInterfaceType {
  @scala.inline
  def apply(Capability: String, Prefix: String, Version: String): PluginInterfaceType = {
    val __obj = js.Dynamic.literal(Capability = Capability, Prefix = Prefix, Version = Version)
  
    __obj.asInstanceOf[PluginInterfaceType]
  }
}

