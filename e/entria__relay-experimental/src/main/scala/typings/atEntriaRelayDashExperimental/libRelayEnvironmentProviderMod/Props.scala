package typings.atEntriaRelayDashExperimental.libRelayEnvironmentProviderMod

import typings.react.reactMod.ReactNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var environment: Environment
}

object Props {
  @scala.inline
  def apply(children: ReactNode, environment: Environment): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], environment = environment)
  
    __obj.asInstanceOf[Props]
  }
}

