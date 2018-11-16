package typings
package expressDashValidatorLib.expressDashValidatorMod.ExpressValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator
  extends Sanitizer
     with expressDashValidatorLib.checkCheckMod.Validator {
  def len(options: expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs.MinMaxOptions): this.type = js.native
  def notEmpty(): this.type = js.native
}

