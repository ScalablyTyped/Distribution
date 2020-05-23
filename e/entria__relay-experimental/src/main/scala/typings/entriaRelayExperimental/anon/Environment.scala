package typings.entriaRelayExperimental.anon

import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends Action {
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment
  var fragmentIdentifier: String
  var `type`: String
}

object Environment {
  @scala.inline
  def apply(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: String
  ): Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

