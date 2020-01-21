package typings.firebaseFirestore

import typings.firebaseFirestore.specTestRunnerMod.SpecConfig
import typings.firebaseFirestore.specTestRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: SpecConfig
  var steps: js.Array[SpecStep]
}

object AnonConfig {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfig]
  }
}

