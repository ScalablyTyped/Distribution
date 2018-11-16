package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libValidationMod {
  type URI = fpDashTsLib.fpDashTsLibStrings.Validation
  type Validation[L, A] = (Failure[L, A]) | (Success[L, A])
}
