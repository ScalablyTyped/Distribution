package typings.expressDashValidator

import typings.expressDashValidator.expressDashValidatorStrings.addError
import typings.expressDashValidator.expressDashValidatorStrings.addFieldInstances
import typings.expressDashValidator.expressDashValidatorStrings.setData
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcContextMod {
  type ReadonlyContext = Pick[Context, Exclude[String, setData | addFieldInstances | addError]]
}
