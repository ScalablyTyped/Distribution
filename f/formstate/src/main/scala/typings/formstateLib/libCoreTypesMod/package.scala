package typings
package formstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreTypesMod {
  type ValidationResponse = js.UndefOr[java.lang.String | scala.Null | formstateLib.formstateLibNumbers.`false`]
  type Validator[TValue] = js.Function1[/* value */ TValue, ValidatorResponse]
  type ValidatorResponse = ValidationResponse | js.Promise[ValidationResponse]
}
