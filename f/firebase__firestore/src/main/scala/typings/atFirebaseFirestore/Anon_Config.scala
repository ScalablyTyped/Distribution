package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod.SpecConfig
import typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod.SpecStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: SpecConfig
  var steps: js.Array[SpecStep]
}

object Anon_Config {
  @scala.inline
  def apply(config: SpecConfig, steps: js.Array[SpecStep]): Anon_Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Config]
  }
}

