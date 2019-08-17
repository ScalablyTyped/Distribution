package typings.expressDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcContextMod {
  import typings.expressDashValidator.expressDashValidatorStrings.addError
  import typings.expressDashValidator.expressDashValidatorStrings.addFieldInstances
  import typings.expressDashValidator.expressDashValidatorStrings.setData
  import typings.std.Exclude
  import typings.std.Pick

  type ReadonlyContext = Pick[Context, Exclude[String, setData | addFieldInstances | addError]]
}
