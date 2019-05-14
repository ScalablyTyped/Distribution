package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es6FreeMod {
  type Free[F, A] = (Pure[F, A]) | (Impure[F, A, js.Any])
  type URI = fpDashTsLib.fpDashTsLibStrings.Free
}
