package typings
package expressDashValidatorLib.expressDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator
  extends expressDashValidatorLib.checkCheckMod.Validator
     with expressDashValidatorLib.filterSanitizeMod.Sanitizer {
  def len(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.MinMaxOptions): this.type = js.native
  def notEmpty(): this.type = js.native
}

