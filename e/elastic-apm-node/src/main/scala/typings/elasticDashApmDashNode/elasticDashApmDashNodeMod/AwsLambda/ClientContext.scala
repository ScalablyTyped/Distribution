package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod.AwsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContext extends js.Object {
  var client: ClientContextClient
  var custom: js.UndefOr[js.Any] = js.undefined
  var env: ClientContextEnv
}

object ClientContext {
  @scala.inline
  def apply(client: ClientContextClient, env: ClientContextEnv, custom: js.Any = null): ClientContext = {
    val __obj = js.Dynamic.literal(client = client, env = env)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    __obj.asInstanceOf[ClientContext]
  }
}

