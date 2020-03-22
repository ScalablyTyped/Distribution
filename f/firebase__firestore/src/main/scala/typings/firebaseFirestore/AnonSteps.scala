package typings.firebaseFirestore

import typings.firebaseFirestore.specsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.specsSpecTestRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSteps extends js.Object {
  var config: SpecConfig
  var steps: js.Array[SpecStep]
}

object AnonSteps {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): AnonSteps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSteps]
  }
}

