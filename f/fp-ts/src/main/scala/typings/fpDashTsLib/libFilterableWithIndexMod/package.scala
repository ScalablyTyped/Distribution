package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFilterableWithIndexMod {
  type PredicateWithIndex[I, A] = js.Function2[/* i */ I, /* a */ A, scala.Boolean]
  type RefinementWithIndex[I, A, B /* <: A */] = js.Function2[/* i */ I, /* a */ A, /* is B */ scala.Boolean]
}
