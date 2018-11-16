package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTheseMod {
  type These[L, A] = (This[L, A]) | (That[L, A]) | (Both[L, A])
  type URI = fpDashTsLib.fpDashTsLibStrings.These
}
