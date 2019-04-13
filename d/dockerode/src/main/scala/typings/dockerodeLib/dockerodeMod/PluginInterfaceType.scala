package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginInterfaceType extends js.Object {
  var Capability: java.lang.String
  var Prefix: java.lang.String
  var Version: java.lang.String
}

object PluginInterfaceType {
  @scala.inline
  def apply(Capability: java.lang.String, Prefix: java.lang.String, Version: java.lang.String): PluginInterfaceType = {
    val __obj = js.Dynamic.literal(Capability = Capability, Prefix = Prefix, Version = Version)
  
    __obj.asInstanceOf[PluginInterfaceType]
  }
}

